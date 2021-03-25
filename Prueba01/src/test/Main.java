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
public class Main {
    public static void main(String[] args) {
        
        
        
        
        //boolean => 1-0 -> true - false                                                    Boolean
        /*
        Enteros
        - byte  8bits   -> 10101010 - max 11111111 -> 127 - -128                            Byte
        - short 16bits  -> 1010101010101010                                                 Short
        - int   32bits  -> 10101010101010101010101010101010                                 Integer
        - long  64bits  -> 1010101010101010101010101010101010101010101010101010101010101010 Long
         ---------------------------------------------
        Puntos flotantes o deceminales
        - float     32bits  -> 10101010101010101010101010101010                                 Float
        - bouble    62bits  -> 1010101010101010101010101010101010101010101010101010101010101010 Double
        */
        /*
        - char   -> 8bits                Character
        - String -> Cadena de caracteres    
        */
        //"Hola mundo"
        float cantidadIngresosPorDia; 
        cantidadIngresosPorDia = 129.0F;
        /*
        ***********************
        */
        cantidadIngresosPorDia = 20;
        
        final double utilidadMensual = 23.0;
        /*
        ************
        */
        //utilidadMensual = 34.8;
        
        
        
        
        //Opertadores
        //Aritméticos
        /*
        + suma  -> valorA aplica la suma con valorB     -> 3+4 => 7
        - resta  -> valorA aplica la resta con valorB   -> 4-3 => 1
        * multiplicacion -> valorA multiplica por valorB   -> 4*3 => 12
        / división -> valorA divido entre valorB        -> 12/2 => 6
        % reiduo de la división -> al dividir valorA entre valorB cunato subra
                                                        -> 5%2 = 1
        
        //Aritméticos incrementales
        ++ Intermento del valor actual
        -- Decremento del valor actual
            Preincremento -> Incrementa y después utiliza el valor nuevo
                ++ variable -> ++numeroDeCasos;
                -- variable -> --numeroDeCasos;
            Posincremento -> Incrementa después de haber eutilizado el valor actual
                variable++  -> numeroDeCasos++;
                variable--  -> --numeroDeCasos--;
                Ejemplo
                int numeroDeCasos = 2;
                System.out.println(numeroDeCasos++);//3? -> 2 => 3
                System.out.println(numeroDeCasos);//3
        
        +=  variable += valor_nuevo; -> valor_actual_variable + valor_nuevo => variable
        -=  variable -= valor_nuevo; -> valor_actual_variable - valor_nuevo => variable
        *=  variable *= valor_nuevo; -> valor_actual_variable * valor_nuevo => variable
        /=  variable /= valor_nuevo; -> valor_actual_variable / valor_nuevo => variable
        
        Ej Expresiones:
        int resultado = 0;
        resultado += 3 + 5 * 4 - 3 / 2;
        resultado += (3 + 5) * 4 - (3 / 2);
        */
        int numeroDeCasos = 2;
        System.out.println(++numeroDeCasos);//3? -> 3
        System.out.println(numeroDeCasos);//3
        
        /*
        Operadores de relación
        ==  dato1 es igual dato2 ? -> dato1 == dato2;
        !=  dato1 es diferente dato2 ? -> dato1 != dato2;
        <   dato1 es menor que dato2 ? -> dato1 < dato2;
        >   dato1 es mayor que dato2 ? -> dato1 > dato2;
        <=  dato1 es menor o igual que dato2 ? -> dato1 <= dato2;
        >=  dato1 es mayor o igual que dato2 ? -> dato1 >= dato2;
        
        Operadores lógicos (valorLogico es un true o false)
        !   Negación
        |   OR (Inclusivo)  Bit -   valorLogico1 | valorLogico2  -> 
        &   AND             Bit -   valorLogico1 & valorLogico2  ->
        ||  OR (Inclusivo)          valorLogico1 || valorLogico2  ->
        &&  AND                     valorLogico1 && valorLogico2  ->
        
        TV
        p1  |   p2  ?               p1  &   p2  ?
        V       V   V               V       V   V
        V       F   V               V       F   F
        F       V   V               F       V   F
        F       F   F               F       F   F
        
        Ej Expresiones:
        boolean respuesta = false;
        respuesta = (4*3) <= (6+6) | (7*3) > (2-8) | (7*3) > (2-8);
        respuesta = (a*b) <= (c+d) | (c*a) > (a-b) & (d*b) > (c-b);
        respuesta = (a*b) <= (c+d) | ((c*a) > (a-b) & (d*b) > (c-b));
        
        
        
        Operadores a nivel de bits
        ~   Complemento -> ~12 ->  00001100 -> 11110011 => -13
        |   OR (BIT)    -> 12 | 10 => 00001100 | 00001010 => 14
        &   AND (BIT)   -> 12 & 10 => 00001100 & 00001010 => 8
        ^   XOR (BIT)   -> 12 ^ 10 => 00001100 & 00001010 => 6
        <<  Desplazamiento a la izquierda   -> 12<<2 => 00001100 -> 00011000 -> 00110000 = 48
        >>  Desplazamiento a la derecha(-)     -> 12>>3 => 00001100 -> 00000110 -> 00000011 -> 10000001 = 1
        >>> Desplazamiento a la derecha en bit de ingreso es un 0  -> 12>>>3 => 00001100 -> 00000110 -> 00000011 -> 00000001 = 1
        
        Ejemplo |:
        00001100        00001100        00001100
        |               &               ^
        00001010        00001010        00001010
        ---------       ---------       ---------
        00001110        00001000        00000110
        
        
        Operador de concatenación:
        +   Une dos textos -> "Hola" + "Mundo" => "HolaMundo"
        +=  Al valor actual de la variable le concate el valor de la derecha
            String texto = "Hola ";
            texto += "Carlos"; => texto = "Hola " + "Carlos"; => "Hola Carlos";
        */
        System.out.println("#############################################");
        System.out.println("Operadores a nivel de bits");
        int rta = 12 ^ 10;
        System.out.println("12 ^10 => " + rta);
        rta = 12<<2;
        System.out.println("12<<2 => " + rta);
        rta = 12>>3;
        System.out.println("12>>3 => " + rta);
        
        rta = -12>>3;
        System.out.println("-12>>3  => " + rta);
        rta = -12>>>3;
        System.out.println("-12>>>3 => " + rta);
        rta = ~12;
        System.out.println("~12 => " + rta);
        
        System.out.println("#################################################");
        System.out.println("Estructuras de control");
        /*
        Estructuras de control
        Seleccion de código a ejecutar:
        IF - ELSE
        Si se cumple la condición se realiza la acción.
        if(condición o condiciones){ // las codiciones debe dar un resultado lógio
            el código que se ejecuta según la condición o condiciones
        } else{ //Sino se cumple la codición
            //El código que se ejecuta si no se cumple la condición
        }
        Nota1: La sección "else" no es obligatoria
        */
        System.out.println("-----IF - ELSE");
        int valor1 = 4;
        int valor2 = 5;
        int valor3 = 5;
        if(valor1 == valor2 && valor1 == valor3){
            System.out.println("Los tres valores son iguales");
        } else{
            System.out.println("Por lo menos un valor es diferente");
        }
        
        
        
        System.out.println("-----IF solo que no se cumple");
        if(valor1 <= valor2){
            System.out.println("Los valores 1 y 2 son iguales");
        }
        
        
        System.out.println("-----IF - IF - IF");
        if(valor1 == valor2){
            System.out.println("Los valores 1 y 2 son iguales");
        }
        if(valor1 == valor3){
            System.out.println("Los valores 1 y 3 son iguales");
        }
        if(valor2 == valor3){
            System.out.println("Los valores 2 y 3 son iguales");
        }
        
        System.out.println("-----IF - IF - IF - Exclusivo");
        if(valor1 == valor2){
            //if(){}Desde que se pueda debemos evitar
            System.out.println("Los valores 1 y 2 son iguales");
        } else if(valor1 == valor3){
            System.out.println("Los valores 1 y 3 son iguales");
        } else if(valor2 == valor3){
            System.out.println("Los valores 2 y 3 son iguales");
        }
        if(4==4){
            System.out.println("4 y 4 son iguales");
        }
        
        /*
        SWITCH
        Si se cumple el caso se selecciona dicho caso.
        
        switch(variable){
            case valor_de_la_variable: Para que se ejecute el código desde este punto
            default: //No es obligatorio
        }
        
        */
        System.out.println("-----Switch");
        int varSw = 3;
        switch(varSw){
            case 1: 
                System.out.println("Estamos en el caso 1");
                break;
            case 2: 
                System.out.println("Estamos en el caso 2");
                break;
            case 3: 
                System.out.println("Estamos en el caso 3");
                break;
            case 4: 
                System.out.println("Estamos en el caso 4");
                break;
        }
        System.out.println("Este es el fin del switch");
        
        
        /*
        Repetitivas, de ciclo, de iteración:
        WHILE
            while(condición){
                //Código que se repetira mientras se cumpla la condición
            }
        */
        System.out.println("-----WHILE");
        int dato = 0;
        while(dato < 10){
            System.out.println(dato);
            dato++;
        }
        System.out.println("---------------");
        System.out.println("-----DO - WHILE");
        /*
        DO ... WHILE
            do{
                //Se ejecuta por lo menos una vez
                //Código que se repetira mientras se cumpla la condición
            } while(condición);
        */
        dato = 0;
        do{
            System.out.println(dato);
            dato++;
        }while(dato < 10);
        System.out.println("---------------");
        /*
        FOR
            for(sentencias_iniciales;
                condición_para_repeteir_el_bloque_de_código;
                setencias_por_cada_ciclo){
                //Bloque de código que se realizará o repetirá dependiendo la condición
            }
        */
        System.out.println("-----FOR");
        System.out.println("dbjasd");
        for(dato=0;dato<10;dato++){
            System.out.println(dato);
        }
        System.out.println("----------------------------");
        for(int i=0, j=10;i<10;i++,j--){
            System.out.println(i +  " - " + j);
        }
        
        System.out.println("---------------");
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
