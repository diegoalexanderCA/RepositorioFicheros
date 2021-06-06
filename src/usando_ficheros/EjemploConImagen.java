/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usando_ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM1
 */
public class EjemploConImagen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileInputStream fi=null;
        FileOutputStream fo=null;
        
        try {
            //COPIAREMOS IMAGEN DESCARGADA
             fi = new FileInputStream("negro.png");
             fo = new FileOutputStream("copiaImagen.png");
            try {
                byte[] contenido = new byte[fi.available()];
                fi.read(contenido);
                fo.write(contenido);
                
            } catch (IOException ex) {
                Logger.getLogger(EjemploConImagen.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploConImagen.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fo.close();
                fi.close();
            } catch (IOException ex) {
                Logger.getLogger(EjemploConImagen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
}
