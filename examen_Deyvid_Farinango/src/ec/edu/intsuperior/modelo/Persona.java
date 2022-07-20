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
public class Persona {
    private String ci;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String edad;
     
    
    public Persona(){
        
    }

    public Persona(String ci, String nombre, String apellido, String direccion, String correo, String edad) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.edad = edad;
    }

    
    


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String sueldoBruto) {
        this.edad = sueldoBruto;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCi() {
        return ci;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }
    
    
    @Override
    public String toString(){
        return "los datos de la persona son:\n"
                + "Cedula: "+getCi()+"\n"
                + "Nombre: "+getNombre()+"\n"
                + "Apellido: "+getApellido()+"\n"
                + "Direccion: "+getDireccion()+"\n"
                + "Correo: "+getCorreo()+"\n"
                + "Edad: "+getEdad();
             
                
        
        
        
        
        
        
    }
}
