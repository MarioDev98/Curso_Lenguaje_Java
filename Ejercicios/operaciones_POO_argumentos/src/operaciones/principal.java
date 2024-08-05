
package operaciones;

import java.util.Scanner;


public class principal {
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Ingresa un numero entero");
        numero1 = leer.nextInt();
        System.out.println("Ingresa otro numero entero");
        numero2 = leer.nextInt();
        
        metodos operacion = new metodos();
        
        operacion.suma(numero1, numero2);
        operacion.resta(numero1, numero2);
        operacion.multiplicacion(numero1, numero2);
    }
    
    
//    en una clase llamada ejercicicos vamos a tener 3 metodos
//    numeros_ciclofor - el de inicio y el final
//    suma_numeros_pares - solo mandamos un numero 
//    numero_positivo_negativo - un numero (NEGATIVPO - POSITIVO)
//    
//    Todos los metodos pertenecen al objeto llamado alumno
    
    
    
    
    
    
    
}
