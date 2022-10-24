package OpTest;

import java.text.DecimalFormat;

public class OpTest6 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###, ###");
		
		double seedMoney = 1_000_000;
			
		for (int i = 1; i <= 50; i++) {
			seedMoney += seedMoney/2 * 0.4;
			seedMoney -= seedMoney/2 * 0.3;
			System.out.println(df.format(seedMoney));
		}
	}
}
