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
public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private Date fechanacimiento;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido, Date fechanacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    @Override
    public String toString() {
        return "Cedula: "+getCedula()+"\n"
                +"Nombre: "+getNombre()+"\n"
                +"Apellido: "+getApellido()+"\n"
                +"Fecha Nacimiento: "+getFechanacimiento().toString();
                        
                
        
    }
    
    
}
