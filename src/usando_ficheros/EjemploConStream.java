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
public class EjemploConStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileOutputStream fo=null;
        FileInputStream fi=null;
        try {
            fi= new FileInputStream("prueba.txt");
            fo = new FileOutputStream("copia.txt");
            int num=0;
            num=fi.read();
            while( num!=-1 ){
                fo.write(num);
                
            }
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploConStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjemploConStream.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fo.close();
                fi.close();
            } catch (IOException ex) {
                Logger.getLogger(EjemploConStream.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
        System.out.println("okkk");
        
        
        
    }
    
}
