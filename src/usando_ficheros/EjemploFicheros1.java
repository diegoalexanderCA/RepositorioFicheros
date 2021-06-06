/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usando_ficheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM1
 */
public class EjemploFicheros1 {
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("mifichero.txt");
            fw.write("derbi");
            fw.flush();
            FileReader fr = new FileReader("mifichero.txt");
            int car=0;
            while((car=fr.read())!=-1){
                System.out.println((char)car);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(EjemploFicheros1.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            
        }
        
        
        
        
    }
    
}
