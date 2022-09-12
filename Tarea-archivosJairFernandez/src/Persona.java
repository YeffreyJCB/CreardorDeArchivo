
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author windos
 */
public class Persona implements Serializable{
    private String carnet;
    private String nombre;
    private String apellidos;
    private int edad;
    private double estatura;
    
    public Persona(){}
    
    public Persona(String carnet, String nombre, String apellidos, int edad, double estatura){
        super();
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Persona [carnet=" + carnet + "; nombre=" + nombre + "; apellidos=" 
                + apellidos + "; edad=" + edad + "; estatura=" + estatura + "]";
    }
}
