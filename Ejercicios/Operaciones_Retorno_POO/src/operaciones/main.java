
package operaciones;

import java.util.Scanner;


public class main {
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("Ingresa dos numeros enteros");
        n1=leer.nextInt();
        n2=leer.nextInt();
        
       metodos_operaciones operacion1 = new metodos_operaciones();
        
    // primera forma de imprimir
//        System.out.println("La suma es " + operacion1.suma(n1,n2));

        
       int resmetodosuma = operacion1.suma(n1,n2);

        System.out.println("La summa es " + resmetodosuma);
        
        System.out.println("La resta es " + operacion1.resta(n1, n2));
        System.out.println("la multiplicacion es " 
        + operacion1.multiplicacion(4, 4));
    }
}
