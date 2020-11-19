/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truc.util.test;

import org.junit.Test;
import static org.junit.Assert.*;
import truc.util.MathUtility;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {

    @Test //kí hiệu của JUnit đưa ra, biến hàm sau đây thành
    //public static void main(), app có nhiều main()
    //F6 chạy main() mặc định, Shift-F6 là chạy main() ở @Test
    //đây là 1 trong những cách đặt tên cho hàm test, để test code chính
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
    }
    //XANH CHỈ ĐẠT ĐƯỢC NẾU TẤT CẢ CÙNG XANH, HÀM Ý HÀM ĐÚNG HẾT TẤT CẢ
    //ĐỎ: CHỈ CẦN ÍT NHẤT 1 THẰNG ĐỎ, COI NHƯ ĐỎ TẤT CẢ
    //ý nghĩa: hàm đã đúng thì phải đúng hết, sai 1 cái hay vài cái
    //hàm ko đáng tin

    //viết code để test code chính (MathUtility)
    //viết code dùng thư viện JUnit, NUnit, xUnit, Jasmine,... để test
    //xem code chính chạy ổn ko trước khi đem qua bên QC/Khách hàng trải nghiệm
    //và thư viện này cung cấp cái cơ chế báo đúng sai qua màu sắc xanh đỏ
    //mắt chỉ nhìn 2 màu là đủ, khỏi cần so sánh expected và actual rồi kết
}
