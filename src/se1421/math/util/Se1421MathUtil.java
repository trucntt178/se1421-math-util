/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1421.math.util;

import truc.util.MathUtility;

/**
 *
 * @author DELL
 */
public class Se1421MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = " + MathUtility.getFactorial(5));
        //                gọi hàm tính 5! hy vọng hàm trả về 120
        //lát hàm chạy coi thực tế là mấy - ACTUAL
        //so sánh vs cái mình hy vọng trước khi tính, EXPECTED 120
        //ACTUAL == EXPECTED, HÀM CHẠY ĐÚNG CHO TÌNH HUỐNG NÀY, TEST CASE NÀY
        System.out.println("0! = " + MathUtility.getFactorial(0));
                           //expected: 1, actual: ? chạy mới biết
                           //chạy xong ms biết hàm đúng sai
        System.out.println("-5! = " + MathUtility.getFactorial(-5));
                           //expected: ĐẬP VÀO MẶT ILLEGALARGUMENTEXCEPTION
        //cách test kiểu này gọi là: MANUAL
        //                  VÌ TA PHẢI NHÌN BẰNG MẮT ĐỂ LUẬN KẾT QUẢ
        
        //cách xịn sò, ta dùng màu sắc xanh đỏ để luận kết quả đúng sai của hàm
        //cách này gọi là TEST AUTOMATION
        //thứ 3 giảng tiếp
    }
    
}
