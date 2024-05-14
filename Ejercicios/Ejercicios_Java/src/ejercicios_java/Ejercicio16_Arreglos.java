
package ejercicios_java;

public class Ejercicio16_Arreglos {
   public static void  Ejercicio16_Arreglos(){
       
  //       int suma =0;     
       int[] arreglo = {3,45,3,8};

       int numero = 8;
       
       int checador = 1;
       
        for(int i = 0; i < arreglo.length; i++){
           if(arreglo[i]== numero){
               System.out.println("El numero si exite");
           }
           else{
               System.out.println("El numero no existe");
           }
        }


    //  Imprimir arreglo
//       for(int i = 0; i < arreglo.length; i++){
//           System.out.println(arreglo[i]);
//       }


    //  Sumar elementos del arreglo  
//       for(int i = 0; i < arreglo.length; i++){
//           suma = suma + arreglo[i];
//       }
//       System.out.println("La suma de los elementos es " + suma);


   }
}

