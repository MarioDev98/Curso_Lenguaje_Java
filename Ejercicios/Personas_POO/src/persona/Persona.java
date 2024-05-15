
package persona;

import java.util.Scanner;

public class Persona {
    // atributos
    int edad;
    String genero;
    String nombre;
    
    Scanner leer = new Scanner(System.in);
            
    public void solicitar_nombre(){
        System.out.println("Ingresa tu nombre");
        nombre= leer.nextLine();
//        System.out.println("Tu nombre es " + nombre);
    }
    
    public void solicitar_edad(){
        System.out.println("Ingresa tu edad");
        edad= leer.nextInt();
//        System.out.println("Tu edad es " + edad);
    }
    public void solicitar_genero(){
        System.out.println("Ingresa tu genero");
        genero= leer.next();
//        System.out.println("Tu genero es " + genero);
    }
    
    public void resultados(){
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu edad es " + edad);
        System.out.println("Tu genero es " + genero);
    }
}
