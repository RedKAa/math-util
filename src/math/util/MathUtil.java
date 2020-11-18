/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import hoang.util.MathUtility;

/**
 *
 * @author user
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // test function by looking
        long expected = 120;//result should be return by getFactorial(5)
        long actual = MathUtility.getFactorial(5);
        System.out.println("Expected: "+expected+", actual: "+actual);
        
        //expected: 720 if getFactorial(6)
        System.out.println("6!: "+MathUtility.getFactorial(6));
        //expected: 1 if getFactorial(0)
        System.out.println("0!: "+MathUtility.getFactorial(0));
        //expected: IllegalArgumentException if parameter is -5
        System.out.println("-5!: "+MathUtility.getFactorial(-5));
        
        
        
    }
    
}
