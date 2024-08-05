
package operaciones;


public class metodos_operaciones {
    
    int rsuma;
    int rresta;
    int rmulti;
   
    public int suma(int numero1, int numero2){
        
      rsuma = numero1 + numero2;
      return rsuma;
    } 
    
    public int resta(int numero1, int numero2){
        rresta = numero1 - numero2;
        return rresta;
    }
    
    public int multiplicacion(int numero1, int numero2){
        rmulti = numero1 * numero2;
        return rmulti;
    }
}
