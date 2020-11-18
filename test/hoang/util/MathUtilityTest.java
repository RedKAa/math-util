/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//copy file jar trong thu vien cai dat cua netbeans vao project
package hoang.util;

import static hoang.util.MathUtility.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class MathUtilityTest {
    
    public MathUtilityTest() {
        //the usecase of using getFactorial()
        //check if actual equal expected or not
        //but in a higher performance:  in any test case's result, red or green color will be shown for a bug or not
        //Another case of using UnitTest:
        //CI - Countinous Integration
        //CD - Countinous Delivery
        //CT -Countinous Regression Test
        //DevOps - Development & Operation
        //app lien tuc dc kiem tra chat luong 
        // san sang test kĩ
        // sau đó có thể đẩy thẳng lên PRODUCTION SERVER, máy chạy thật ở nơi khách
        // mọi việc sẽ bắt đầu kể từ khi Developer push code lên Github
        // mọi thứ cứ thế tự động, ko cần con người can thiệp
        
    }
     
   @Test // từ khóa này biến hàm này thành psvm
   //Trong hàm này mình sẽ show ra màu xanh đỏ dựa trên sự khớp nhau của 
   //EXPECTED VS. ACUTAL qua hàm assertEquals()... mà thư viện cung cấp
   //assert...() đủ các loại assert trên cuộc đời - assert(v) so sánh
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
        assertEquals(1, getFactorial(0));
        assertEquals(0, getFactorial(0));
        
        
        //so sánh hàm sau vói 120, đúng thì xanh sai thì đỏ
    }
    
    
    
}
