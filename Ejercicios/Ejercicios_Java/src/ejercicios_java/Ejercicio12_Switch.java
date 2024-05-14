
package ejercicios_java;

import java.util.Scanner;


public class Ejercicio12_Switch {
    
    public static void Ejercicio12_Switch(){
     Scanner leer = new Scanner(System.in);
    int opc,retiro, saldo,abono;
    saldo = 1000;
    System.out.println("1 Consulta saldo");
    System.out.println("2 Retiro");
    System.out.println("3 Abono");
    opc = leer.nextInt();
    
    switch(opc){
    case 1:
        System.out.println("Tu saldo es de "+ saldo);
        break;
    case 2:
        System.out.println("Ingresa la cantidad que deseas retirar ");
        retiro = leer.nextInt();
        saldo = saldo - retiro;
        System.out.println("Tu saldo actual es de " + saldo);
        break;
    case 3:
        System.out.println("Ingresa la cantidad que deseas abonar ");
        abono = leer.nextInt();
        saldo = saldo + abono;
        System.out.println("Tu saldo actual es de " + saldo);
        break;
    default:
        System.out.println("La opción no es valida");
        
}
} 
}



