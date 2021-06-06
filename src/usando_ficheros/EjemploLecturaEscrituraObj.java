/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usando_ficheros;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM1
 */
public class EjemploLecturaEscrituraObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SERIALIZACIÓN DE OBJETOS
        FileOutputStream fo=null;
        ObjectOutputStream os=null;
        FileInputStream fi =null;
        ObjectInputStream oi=null;
        try {
            
            fo = new FileOutputStream("amigos.txt");
            fi = new FileInputStream("amigos.txt");
            
            //guardo objeto Amigo
            os = new ObjectOutputStream(fo);
            oi = new ObjectInputStream(fi);
            Amigo a1 = new Amigo("perico", "12345678K");
            Amigo a2 = new Amigo("Lucilda", "12345678J");
            os.writeObject(a1);
            os.flush();
            try {
                //leo amigo
                Amigo a =  (Amigo)oi.readObject();
                
                while(a!=null){
                    
                    System.out.println(a);//TODO NO ME ESCRIBE LA AMIGA
                    a= (Amigo)oi.readObject();
                }
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EjemploLecturaEscrituraObj.class.getName()).log(Level.SEVERE, null, ex);
            }catch (EOFException e){
                System.out.println("Fin de fichero");
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploLecturaEscrituraObj.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
                Logger.getLogger(EjemploLecturaEscrituraObj.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fi.close();
                fo.close();
                oi.close();
                os.close();
            } catch (IOException ex) {
                Logger.getLogger(EjemploLecturaEscrituraObj.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        
        
    }
    
}
