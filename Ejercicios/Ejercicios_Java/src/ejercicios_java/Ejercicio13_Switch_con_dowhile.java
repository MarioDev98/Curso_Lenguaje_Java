
package ejercicios_java;

import java.util.Scanner;


public class Ejercicio13_Switch_con_dowhile {
    
public static void Ejercicio13_Switch_con_dowhile(){
   Scanner leer = new Scanner(System.in);
   
    int opc;
    
    do {
        
        System.out.println("1 Hola mundo ");
        System.out.println("2 Hola grupo ");
        System.out.println("3 Salir ");
        opc = leer.nextInt();
        switch(opc){
            case 1:
                System.out.println("Hola mundo");
                break;
            case 2: 
                System.out.println("Hola grupo");
                break;
            case 3:
                System.out.println("Hasta luego..");
                break;
            default:
                System.out.println("La opción no es valida");
        }
    }while(opc != 3);
}
   
}


//cajero automatico con do while y switch
//
//el de los dias de la semana con switch y do while 
//y que cuando el usuario eliga el 8 salga del programa
