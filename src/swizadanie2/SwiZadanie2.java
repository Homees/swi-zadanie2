/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swizadanie2;

import java.util.Random;

/**
 *
 * @author Filip
 */
public class SwiZadanie2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        factorial();
        aplhabetMethod();
    }
    
    private static void factorial() {
        int factorial = 5;
        for (int i = 4; i > 0; i--) {
            factorial *= i;
        }
        System.out.println(factorial + "%n");
    }
    
    private static void aplhabetMethod() {
        Character[] abc = new Character[26];
        for (int i = 0; i < 26; i++) {
            abc[i] = (char) (i + 'a');
        }
        System.out.println("Nova abeceda: " + abc.toString());
    }
    
    private static void randomNumbers() {
        Random rnd = new Random(System.currentTimeMillis());
        int r = 0, i = 0;
        do {
            r = rnd.nextInt(100) + 1;
            System.out.println(r);
        } while (i < 100);
    }
    
}
