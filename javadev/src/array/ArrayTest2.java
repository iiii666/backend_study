package array;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[][][] score = { {
						{ 100, 90, 80, 70 }, 
	
				      { 90, 80, 70, 60 }, 
				      { 80, 70, 60, 50 } },
				
				
				
				{
			{100,100,90,80},{90,80,70,60},{90,80,70,60}
				}};
		
		System.out.println("국어	영어	수학	철학	총점	평균");
		for(int tab =0; tab< score.length; tab++) {
			
			double avg = 0.0;
			for(int row=0; row<score[tab].length; row++) {
				int sum = 0;
				for(int col=0; col <score[tab][row].length; col++) {
					System.out.print(score[tab][row][col] + "\t");
					sum += score[tab][row][col];
				}
				avg = sum/4;
				System.out.print(sum + "\t");
			    System.out.println(avg);
				System.out.println();
			}
			System.out.println();
		}
	}
}
