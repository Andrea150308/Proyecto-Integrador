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
public class Empresa extends Persona {
    private String nombreEmpresa;
    
    public Empresa() {
        
    }

    public Empresa(String nombreEmpresa, String ci, String nombre, String apellido, String direccion, String correo, String edad) {
        super(ci, nombre, apellido, direccion, correo, edad);
        this.nombreEmpresa = nombreEmpresa;
    }


    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    
    @Override
    public String toString() {
        return"el nombre de la empresa es: \n"
                +getNombreEmpresa();
               
    }
    
}
