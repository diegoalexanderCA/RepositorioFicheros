/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usando_ficheros;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;

/**
 *
 * @author DAM1
 */
public class EjemploUsoFich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = new String("holaktal");
        char [] bufer= new char[s.length()];
        
        //flujo de lectura
        StringReader flectura = new StringReader(s);
        
        //flujo de escritura
        CharArrayWriter fescritura= new CharArrayWriter();
        int aux=0;
        try {
            while((aux=flectura.read()) != -1){
                fescritura.write(aux);
            }
            
        } catch (IOException e) {
            
        } finally {
            flectura.close();
            fescritura.close();
        }
        
        
    }
    
}
