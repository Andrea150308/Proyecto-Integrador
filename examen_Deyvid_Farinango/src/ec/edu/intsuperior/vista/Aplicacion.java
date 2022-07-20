/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Empresa;
import ec.edu.intsuperior.modelo.Persona;
import ec.edu.intsuperior.modelo.Directivo;
import java.util.Scanner;
import javax.swing.JOptionPane;
      
/**
 *
 * @author ThinkBook
 */
public class Aplicacion {
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Cliente();
        
        
         p1.setCi(JOptionPane.showInputDialog("Ingrese el numero de cedula:"));
         p1.setApellido(JOptionPane.showInputDialog("Ingrese el Apellido:"));
         p1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre:"));
         p1.setCorreo(JOptionPane.showInputDialog("Ingrese el correo:")); 
          p1.setDireccion(JOptionPane.showInputDialog("Ingrese la Direccion:"));
          p1.setDireccion(JOptionPane.showInputDialog("Ingrese la Edad: "));
        
        
        
        Cliente c1 = new Cliente();
         c1.setCi(JOptionPane.showInputDialog("Ingrese el contacto del cliente:"));
         
         
         Empleado e1 =new Empleado ();
          c1.setCi(JOptionPane.showInputDialog("Ingrese el Suedo Bruto del Cliente:"));
       
         Empresa em1 = new Empresa ();
         em1.setNombre(JOptionPane.showInputDialog("Ingrese el Nombre de la Empresa:"));
         
         Directivo d1 = new Directivo();
         d1.setNombre(JOptionPane.showInputDialog("Ingrese la categoria de Directivo:"));
         
        
    }
}
