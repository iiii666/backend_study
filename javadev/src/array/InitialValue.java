package array;

import java.util.Arrays;

public class InitialValue {
	public static void main(String[] args) {
		int value3 = 0;
		System.out.println(value3);

		int[] value4 = null;
		System.out.println(value4);
		System.out.println();

		boolean[] arr = new boolean[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int[] arr2 = new int[3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		double[] arr3 = new double[3];
		for(int i = 0; i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		
		String[] arr4 = new String[3];
		for(int i = 0; i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
