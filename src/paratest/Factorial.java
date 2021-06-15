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
public class Factorial {

    public static int calculo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número " + n + " no puede ser < que 0");
        }
        if (n > 999999) {
            throw new ArithmeticException("Overflow, núemro " + n + " demasiado grande");
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        
        return fact;
    }

}
