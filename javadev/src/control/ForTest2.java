package control;

public class ForTest2 {

	public static void main(String[] args) {

//		// 1~3까지합계
//		int sum = 0;
//		for (int i = 3; i <= 1000; i += 3) {
//			sum += i;
//		}
		int sum = 0;
		int i =3;
		while(i<=1000) {
			sum += i;
			i +=3;
		}
		System.out.println(sum);
	}
}
