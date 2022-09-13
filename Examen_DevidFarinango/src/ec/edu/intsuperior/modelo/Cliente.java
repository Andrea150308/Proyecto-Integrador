/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author ThinkBook
 */
public class Cliente extends Persona {
    double telefono;

    public Cliente() {
    }

    public Cliente(double telefono, String cedula, String nombre, String apellido, Date fechanacimiento) {
        super(cedula, nombre, apellido, fechanacimiento);
        this.telefono = telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public double getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"
                +"Telefono: "+getTelefono();
    }

    
    }
    

