/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class Persona implements Observer {
    private String codigo;
    private String nombre;
    private boolean suscrito;

    public Persona(String codigo, String nombre, boolean suscrito) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.suscrito = suscrito;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public void setSuscrito(boolean suscrito) {
        this.suscrito = suscrito;
    }

    public boolean isSuscrito() {
        return suscrito;
    }

    @Override
    public void update(String mensaje) {
        System.out.println("SSMETEOROLOGICO indica a " + nombre + ": " + mensaje);
    }
}
