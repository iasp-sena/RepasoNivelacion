/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejemploencapsulacion;

/**
 *
 * @author Ismael
 */
public class Persona {
    
    private int numeroDocumento;
    private String nombre;
    private String apellido;
    private int edad;
    private double estatura;
    
    //modificadorDeAcceso NombreClase(tipoDeDato nombreArgumento){}
    public Persona(){
        nombre = "Diana";
        apellido = "Castro";
        estatura = 150;
    }
    
    public Persona(
            String nombreInicial, 
            String apellidoInicial, 
            double estaturaInicial){
        nombre = nombreInicial;
        apellido = apellidoInicial;
        estatura = estaturaInicial;
    }
    
    public void setNumeroDocumento(int nuevoNumeroDocumento){
        numeroDocumento = nuevoNumeroDocumento;
    }
    
    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }
    
}
