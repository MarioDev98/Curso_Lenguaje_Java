
package Constructores;


public class Persona {
    // atributos
    String nombre;
    int edad;
    
    
    // metodo contructor
    public Persona(String nombre, int edad){
    // variable local = argumento
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // metodos
    public void DatosMuestra(){
        System.out.println("El nombre es " + nombre);
        System.out.println("La edad es " + edad);
    }
}



