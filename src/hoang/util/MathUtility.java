/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoang.util;

/**
 *
 * @author user
 */
public class MathUtility {
    //làm bộ thư viện fake giống y chang Math
    //Math.PI, .abs .sqrt .pow(a,b) 

    public static final double PI = 3.1415;

    //tinh giai thua, am giai thua vo nghia, 21! long ko tinh dc -> 0!..20!
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("n must be between 0..20!");
//        }
//        long result = 1;
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
    //viết hàm đệ quy cho ngầu
    public static long getFactorial(int n) {
        if(n<0 || n > 20 ){
            throw new IllegalArgumentException("n must be  between 0..20!");
        }
        if(n == 0 || n ==1){
            return 1;
        }
        return n*getFactorial(n-1);
    }
    
   
}
