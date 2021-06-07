/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paratest;

/**
 *
 * @author Oboe
 */
public class ejercicio3 {
    
    public int[] cadenaEnteros(int tam)throws NegativeArraySizeException{
        if(tam<1 || tam>10){
            throw new NegativeArraySizeException("Los tamaños deben ser entre 1-10 inclusives");
        }
        int[] cadena = new int[tam];
        
        return cadena;
    } 
    
}
