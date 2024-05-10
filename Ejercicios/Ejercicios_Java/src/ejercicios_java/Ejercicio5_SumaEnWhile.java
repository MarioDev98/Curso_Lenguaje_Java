
package ejercicios_java;


public class Ejercicio5_SumaEnWhile {
    
    public static void Ejercicio5_SumaEnWhile(){
        int i, suma;
        suma = 0;
        i = 1;
        
        while(i <= 5){
            System.out.println(i);
            if(i % 2 == 0){
               suma = suma + i;
            }
            i++;
        }
        System.out.println("La suma es  " + suma);
    }
    
}



//un ciclo que imprima del 1 al 5 y me sume solo los numeros pares