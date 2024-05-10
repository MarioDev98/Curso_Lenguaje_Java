
package ejercicios_java;

import java.util.Scanner;


public class Ejercicio9_TablasMultiplicar {
    public static void Ejercicio9_TablasMultiplicar(){
        Scanner leer = new Scanner(System.in);
        
        int i, numerotabla;
        
        System.out.println("Ingresa un numero del 1 al 10 ");
        numerotabla = leer.nextInt();
        
        for(i=1; i <= 10; i++){
            //System.out.println(i);
            //int resultado = numerotabla * i;
            System.out.println(numerotabla + "x" + i + "=" + numerotabla * i);
        }
    }
}
