
package telefonos;

import javax.swing.JOptionPane;

public class telefonos {
    //atributos
    String marca;
    int precio;
    String modelo;
    
    // metodos
    public void marca_modelo(){
      marca = JOptionPane.showInputDialog(null,"Ingresa la marca de tu telefono");
//      JOptionPane.showMessageDialog(null, "Tu celular es marca " + marca);
      
      modelo =JOptionPane.showInputDialog(null,"Ingresa el modelo de tu telefono");
//       JOptionPane.showMessageDialog(null, "Tu celular es el modelo " + modelo);
    }
   
    public void precio(){
       precio = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el precio del telefono"));
//       precio = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el precio del telefono"));
//       JOptionPane.showMessageDialog(null, "El precio del celular es " + precio);
    }
    
    public void resultados(){
        JOptionPane.showMessageDialog(null, "Tu celular es marca " + marca 
        + "\n" + "Tu celular es el modelo " + modelo + "\n" +
        "El precio del celular es " + precio);
    }
    
}


