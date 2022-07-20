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
public class Cliente extends Persona {
    private String telefonoContacto;
    
    public Cliente (){
        
    }

    public Cliente(String telefonoContacto, String ci, String nombre, String apellido, String direccion, String correo, String edad) {
        super(ci, nombre, apellido, direccion, correo, edad);
        this.telefonoContacto = telefonoContacto;
    }


    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }
    
    @Override
    public String toString() {
        return "el telefono del contacto es:\n"
                + getTelefonoContacto();
    }
    
   
    
 
   

}
