/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejemplopersona;

/**
 *
 * @author Ismael
 */
public class Persona {
    
    private int numeroDocumento;
    String nombre;
    protected String apellido;
    public int edad;
    public double estatura;
    
    public String obtenerNombreCompleto(){
        return nombre + " " + apellido;
    }
    
}
