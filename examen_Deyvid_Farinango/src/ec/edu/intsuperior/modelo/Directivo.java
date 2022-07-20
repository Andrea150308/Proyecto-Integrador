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
public class Directivo extends Empleado {
    private String TipoDirectivo;
    
    public Directivo() {
        
    } 

    public Directivo(String TipoDirectivo, double sueldo, String ci, String nombre, String apellido, String direccion, String correo, String edad) {
        super(sueldo, ci, nombre, apellido, direccion, correo, edad);
        this.TipoDirectivo = TipoDirectivo;
    }


    public void setTipoDirectivo(String TipoDirectivo) {
        this.TipoDirectivo = TipoDirectivo;
    }

    public String getTipoDirectivo() {
        return TipoDirectivo;
    }
    
    @Override 
    public String toString()  {
        return"el directivo es: \n"
                + getTipoDirectivo();
    }
    
}
