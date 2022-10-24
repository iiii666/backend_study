package array;

public class ArrayTest3 {
	public static void main(String[] args) {
		Object[][] score = {
				{"이름","국어","영어","수학","철학","총점","평균"},
				{"학생A",100,90,80,70},
				{"학생B",90,80,70,60},
				{"학생C",80,70,60,50}
		};
		
		System.out.println("이름    국어    영어    수학    철학    총점    평균");
		for(int row =1; row< score.length; row++) {
			
			int sum =0;
			double avg = 0.0;
			for(int col=1; col<score[row].length; col++) {
				System.out.print(score[row][col] + "\t");
				sum += (int)score[row][col];
			}
			
			System.out.print(sum+"\t");
			System.out.println(sum/4);
		}
		System.out.println();
	}
}
