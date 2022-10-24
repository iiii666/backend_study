package basic;

import java.math.BigDecimal;

public class BigNumberTest {
	public static void main(String[] args) {
		System.out.println(2-1.1);
		
		BigDecimal b1 = new BigDecimal("2");
		BigDecimal b2 = new BigDecimal("1.1");//달러 센트 계산
		System.out.println(b1.subtract(b2));
		
	}
}
