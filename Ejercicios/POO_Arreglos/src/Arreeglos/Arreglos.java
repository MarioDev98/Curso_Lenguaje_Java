
package Arreeglos;


public class Arreglos {
     int[] arreglonumeros;
     
     // constructor
     public Arreglos(int[] arreglonumeros){
         this.arreglonumeros = arreglonumeros;
     }
    
     public int sumaarreglo(){
         int suma = 0;
         for(int i = 0; i <arreglonumeros.length; i++){
             suma = suma + arreglonumeros[i];
             
         }
         return suma;
     }
     
}

//void imprime el arreglo 

// tipo va a buscar un numero dentro de un arreglo


