/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

public class SistemaMeteorologico implements Subject {
    private List<Observer> observers;
    private int temperatura;

    public SistemaMeteorologico() {
        observers = new ArrayList<>();
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        String categoria = categorizarTemperatura();
        for (Observer observer : observers) {
            observer.update("Temperatura: " + temperatura + "°C - " + categoria);
        }
    }

    public String categorizarTemperatura() {
        if (temperatura < 10) return "Frío";
        else if (temperatura < 20) return "Templado";
        else if (temperatura < 30) return "Cálido";
        else return "Caluroso";
    }
}
