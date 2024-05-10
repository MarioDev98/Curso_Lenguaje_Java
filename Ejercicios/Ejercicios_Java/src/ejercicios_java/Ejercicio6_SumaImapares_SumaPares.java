
package ejercicios_java;


public class Ejercicio6_SumaImapares_SumaPares {
    public static void Ejercicio6_SumaImapares_SumaPares(){
        int i, suma,sumaimpar;
        suma = 0;
        sumaimpar=0;
        i = 1;
        
        while(i <= 5){
            System.out.println(i);
            if(i % 2 == 0){
               suma = suma + i;
            }
            else if(i % 2 ==1){
                sumaimpar = sumaimpar + i;
            }
            i++;
        }
        System.out.println("La suma de los pares " + suma);
        System.out.println("La suma de los impares es " + sumaimpar);
    }
}


//Un ciclo del 1 al 5, 
//sumar los pares y mostrar el resultado, 
//sume los impares
//mostrar el resultado
