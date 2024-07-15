/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coneccion;

public class EmployeeDTO {
    private int id;
    private String Usuario;
    private String contrasena;
    private String tipo;
    private int horas_trabajo;

    // Getters and setters

    public int getId() {
        return id;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getEmployeeTipo() {
        return tipo;
    }

    public int getHoras_trabajo() {
        return horas_trabajo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setEmployeeTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setHoras_trabajo(int horas_trabajo) {
        this.horas_trabajo = horas_trabajo;
    }
    
    
}

