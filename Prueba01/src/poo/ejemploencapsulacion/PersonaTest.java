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
public class PersonaTest {
    
    public static void main(String[] args){
        
        int numero = 10;
        
        //TipoDato nombreVariable = valor;
        Persona persona1 = new Persona();
        persona1.setNumeroDocumento(123456789);
        persona1.setEdad(20);
        
        
        String nombrePersona = persona1.getNombre();
        
        String nombreCompleto = persona1.getNombreCompleto();
        
        
        Persona persona2 = new Persona("Fabián","Díaz", 165);
        
    }
    
}
