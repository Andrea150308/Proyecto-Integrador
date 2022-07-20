/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author ThinkBook
 */
public class Empleado extends Persona {
    double sueldo;
    
    public Empleado() {
        
    }

    public Empleado(double sueldo, String ci, String nombre, String apellido, String direccion, String correo, String edad) {
        super(ci, nombre, apellido, direccion, correo, edad);
        this.sueldo = sueldo;
    }


    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }
    @Override
    public String toString(){
        return "el sueldo es:\n"
                + getSueldo();
    }
  
    
}
