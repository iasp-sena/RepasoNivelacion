/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Ismael
 */
public class Arreglos {

    public static void main(String[] args) {

        final int tamanioArreglo = 10;

        int[] arreglo = new int[tamanioArreglo];
        arreglo[0] = 4;
        arreglo[1] = 2;
        arreglo[2] = 1;
        //arreglo[10] = 1; //Pilas con accesos fuera del rango o tamaño definido para el arreglo

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        
        
        
        
        
        
        
        
        
        

        String[][] datosUsuarios = {
            /*0*/{"Andres", "Carrillo", "CC", "123456789"},
            /*1*/{"Julia", "De Las Casas", "TI", "123456789"}
        };
        
        System.out.println(datosUsuarios[0][3]);

    }
}
