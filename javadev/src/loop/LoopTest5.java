package loop;

public class LoopTest5 {

	public static void main(String[] args) {
		for(int i = 1;i<9; i+=4) {
		
			for(int j = 1;j<=9;j++) {
				for(int k = i+1; k<=i+4;k++) {
					System.out.print(k+ " * "+ j + " = " + k*j +" ");
				}
			System.out.println();
			
			}
			System.out.println();
		}
	}

}
