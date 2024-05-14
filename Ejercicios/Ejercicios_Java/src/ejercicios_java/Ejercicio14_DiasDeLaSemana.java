
package ejercicios_java;

import java.util.Scanner;


public class Ejercicio14_DiasDeLaSemana {
    public static void Ejercicio14_DiasDeLaSemana(){
        Scanner leer = new Scanner(System.in);
        int opc;
        do{
//           
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                case 8:
                    
                    break;
                default:
                        System.out.println("No valido");
            }

        }while(opc !=8);
    }
}
