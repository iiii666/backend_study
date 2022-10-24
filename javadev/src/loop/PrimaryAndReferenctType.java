package loop;

import java.util.Arrays;

public class PrimaryAndReferenctType {
	public static void main(String[] args) {
		int value1= 3;
		int value2 = value1;
		value2 = 7;
		System.out.println(value1);
		System.out.println(value2);
		
		int[] arr1 = new int[] {1,2,3};
		int[] arr2 = arr1;
		arr2[0] =3;
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr1));
	}
}
