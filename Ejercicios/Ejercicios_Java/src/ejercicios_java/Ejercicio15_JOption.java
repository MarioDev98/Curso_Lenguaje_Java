
package ejercicios_java;

import javax.swing.JOptionPane;




public class Ejercicio15_JOption {
    public static void Ejercicio15_JOption(){
        int numero, numero2;

//        JOptionPane.showMessageDialog(null, "Ingresa un numero ");
       
//        String pedirnumero = JOptionPane.showInputDialog("Ingresa un numero ");
//        numero = Integer.parseInt(pedirnumero);
//        
//        String pedirnumerodos = JOptionPane.showInputDialog("Ingresa un segundo numero ");
//        numero2 = Integer.parseInt(pedirnumerodos);
//         
//         int resultado = numero + numero2;
//         
//         JOptionPane.showMessageDialog(null, "La suma es  "+ resultado);
//         

// cuadro de dialogo normal 
JOptionPane.showMessageDialog(null, "La suma es  ");

// cuadro de dialogo de advertencia
JOptionPane.showMessageDialog(null, "Advetencia tienes un error ", "Ventana de error",JOptionPane.WARNING_MESSAGE);

// cuadro de dialogo de error 
JOptionPane.showMessageDialog(null, "Advetencia tienes un error ", "Ventana de error",JOptionPane.ERROR_MESSAGE);

//JOptionPane.ERROR_MESSAGE
//JOptionPane.WARNING_MESSAGE
//JOptionPane.QUESTION_MESSAGE

//try {
//    //codigo
//}catch(exception){
//   // codigo
//}

         
    }
}
