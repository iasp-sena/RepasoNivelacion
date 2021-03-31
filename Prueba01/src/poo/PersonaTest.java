/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import poo.ejemplopersona.Persona;
import poo.ejemplopersona.Persona;
import poo.ejemplopersona.Persona;

/**
 *
 * @author Ismael
 */
public class PersonaTest {
    
    public static void main(String[] args){
        
        int numero = 10;
        
        //TipoDato nombreVariable = valor;
        Persona persona1 = new Persona();
        persona1.numeroDocumento = 123456789;
        persona1.nombre = "Adriana";
        persona1.apellido = "Flórez";
        persona1.edad = 20;
        persona1.estatura = 155;
        
        String nombreCompleto = persona1.obtenerNombreCompleto();
        
        
        
    }
    
}
