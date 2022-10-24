package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11660 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][N];
		
		for(int i = 0; i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<N; j++) {
				
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
//		for(int m = 0; m<M; m++) {
//			st = new StringTokenizer(br.readLine());
//			int X1 = Integer.parseInt(st.nextToken());
//			int Y1 = Integer.parseInt(st.nextToken());
//			int X2 = Integer.parseInt(st.nextToken());
//			int Y2 = Integer.parseInt(st.nextToken());
//			
//			
//			int x_minus = X2 - X1;
//			int y_minus = Y2 - Y1;
//			
//			int sum = 0;
//			
//			for(int i = X1 - 1; i <= (X1 - 1)+ x_minus; i++) {
//				for(int j = Y1 -1; j<=(Y1 -1)+ y_minus; j++) {
//				
//					sum += arr[i][j];
//				}
//			}
//			System.out.println(sum);
//		}
//		
	
		
		
	}
}
