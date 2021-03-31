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
public class Metodos {
    
    
    
    
    
    public static void main(String[] args){
        double numero = 3;
        double otroNumero = 5;
        double total = 0;
        
        //total = sumar(numero, otroNumero); // Un método static sólo puede invocar a otros métodos static
        
        //correr(numero);
        //correr(otroNumero);
        //correrRecursivamente(6);
        int num = 6;
        /*
        int fact = factorial(num);
        System.out.println("Factorial de " + num + " es: " +  fact);
        */
        int factR = factoriaRecursivo(num);
        System.out.println("Factorial de " + num + " es: " +  factR);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //modificador_acceso (static) (final) tipo_de_retorno nombreDelMetodo(tipo_de_dato nombreDelArgumento, tipo_de_dato nombreDelArgumento){
    //  ... Código de la funcionalidad ...
    //}
    //Ejemplo
    
    public static void correr(double distanciaEnMetros){
        System.out.println("Estoy corriendo " + distanciaEnMetros + " metros.");
    }
    
    public static void correr(){
        System.out.println("Estoy corriendo ");
    }
    
    private double sumar(double numero1, double numero2){
        double suma = numero1 + numero2;
        return suma;
    }
    
    
    public void comer(String comida){
        System.out.println("Estoy comiendo "+ comida);
    }
    
    
    public static void correrRecursivamente(double distanciaEnMetros){
        if(distanciaEnMetros > 0){
            correrRecursivamente(distanciaEnMetros-1);
        }
        System.out.println("Corrí " + distanciaEnMetros + " metros");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Facotrial de un número
    /*
    
    3! => 1*2*3             = 6 
    4! => 1*2*3*4           = 24 
    5! => 1*2*3*4*5         = 120       5! = 4!*5   =>  5! = (5-1)!*5
    
    n! = (n-1)!*n
    (n-1)! = ((n-1)-1)!* (n-1)
    */
    public static int factorial(int numero){
        int numFactorial = 1;
        for(int i=1; i<=numero; i++){
            numFactorial *= i;
        }
        return numFactorial;
    }
    
    private static int factoriaRecursivo(int numero){
        if(numero == 0){
            return 1;
        }
        return numero * factoriaRecursivo(numero-1);
    }
    
    
    //1-1-2-3-5-8-13-21
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
