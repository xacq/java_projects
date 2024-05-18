package com.mycompany.sistemameteorologico;

import modelos.Person;
import modelos.WeatherData;
import visual.WeatherAppFrame;

public class SistemaMeteorologico {

    public static void main(String[] args) {
        
        WeatherData weatherData = new WeatherData();
        WeatherAppFrame frame = new WeatherAppFrame(weatherData);
        frame.setVisible(true);
        
        weatherData.setTemperature(0.0f);
        
        Person person1 = new Person("Juan", weatherData);
        Person person2 = new Person("Ana", weatherData);
        Person person3 = new Person("Pedro", weatherData);
        Person person4 = new Person("Pedro", weatherData);
        Person person5 = new Person("Pedro", weatherData);
        

    }
}
