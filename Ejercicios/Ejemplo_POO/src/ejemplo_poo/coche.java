
package ejemplo_poo;


public class coche {
   // caracteristicas / atributos
    String color;
    String marca;
    int km;
    
    public static void main(String [] args){
    // nombre de la clase - objeto = constructores
       coche cocheuno = new coche();
       
       cocheuno.color = "Rojo";
       cocheuno.marca = "Jetta";
       cocheuno.km = 180;
       
        System.out.println("El color del objeto cocheuno es " + cocheuno.color);
        System.out.println("La marca del objeto coche uno es "+ cocheuno.marca);
        System.out.println("El kilometraje del objeto cocheuno es " + cocheuno.km);
        
       coche cochedos = new coche();
        
       cochedos.color = "blanco";
       cochedos.marca = "Jetta";
       cochedos.km = 100;
        
        System.out.println("");
        System.out.println("El color del objeto cochedos es " + cochedos.color);
        System.out.println("La marca del objeto cochedos es "+ cochedos.marca);
        System.out.println("El kilometraje del objeto cochedos es " + cochedos.km);
        
    }
    
}
