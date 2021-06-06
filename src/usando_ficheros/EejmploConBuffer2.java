/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usando_ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM1
 */
public class EejmploConBuffer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("prueba.txt"));
            BufferedReader br = new BufferedReader(new FileReader("prueba.txt"));
            bw.write("fffffffffffffff");
            bw.newLine();
            bw.write("masfffffffffffff tomorrow.");
            bw.close();
            String linea="";
            linea = br.readLine();
            while(linea != null ){
                System.out.println(linea);
            }
        } catch (IOException ex) {
            Logger.getLogger(EjemploConBuffer.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Ha funcionado");
        
        
    }
    
}
