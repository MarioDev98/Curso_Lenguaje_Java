
package retornos;


public class metodos_con_retorno {
    
    
    public int posneg(int n){
        int positivo = 0;
        if(n > 0){
            positivo = positivo + 1;
            
        }
        else{
            positivo = positivo - 1;
          
        }
        
        return positivo;
    }
}
