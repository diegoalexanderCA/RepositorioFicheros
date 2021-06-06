/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usando_ficheros;

import java.io.Serializable;

/**
 *
 * @author DAM1
 */
public class Amigo implements Serializable{
    private String nombre;
    private String DNI;

    public Amigo(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Amigo{" + "nombre=" + nombre + ", DNI=" + DNI + '}';
    }
    
    
    
}
