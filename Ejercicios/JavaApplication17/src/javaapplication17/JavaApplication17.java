/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.io.File;

/**
 *
 * @author Condor
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String jnlpFilePath = "C:\\Users\\Condor\\AppData\\Local\\Temp\\frmservlet.jnlp";
File jnlpFile = new File(jnlpFilePath);

if (!jnlpFile.exists()) {
    System.out.println("Archivo JNLP no encontrado: " + jnlpFilePath);
    // Manejar el error adecuadamente
} else {
    // Proceder con el lanzamiento de la aplicación
}
    }
    
}
