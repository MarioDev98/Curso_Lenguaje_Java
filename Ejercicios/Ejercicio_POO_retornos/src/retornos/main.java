
package retornos;


public class main {
    public static void main (String [] args){
        
  metodos_con_retorno funciones = new metodos_con_retorno();
  
      
  
//  funciones.posneg(1);
        
//        System.out.println(" TEXTO " + funciones.posneg(1));
        int numero = -10;
        if (funciones.posneg(numero) == 1){
            System.out.println("El numero es positivo " + numero);
        }
        else{
            System.out.println("el numero es negativo " + numero);
        }
    }
}
