package array;

public class ArrayTest1 {
	public static void main(String[] args) {

		int[] arr1 = new int[3];
		arr1[0] = 3;
		arr1[1] = 4;
		arr1[2] = 5;
		System.out.println(arr1[0] + " " + arr1[1]+" "+arr1[2]);
		
		int[] arr2;
		arr2 = new int[3];
		arr2[0] = 3;
		arr2[1] = 4;
		arr2[2] = 5;
		System.out.println(arr1[0] + " " + arr1[1]+" "+arr1[2]);
		
		int[] arr3= new int[] {3,4,5};
		
		System.out.println(arr1[0] + " " + arr1[1]+" "+arr1[2]);

		int[] arr4;
		arr4 = new int[] {3,4,5};
		System.out.println(arr1[0] + " " + arr1[1]+" "+arr1[2]);

		int[] arr5 = {3,4,5};
		System.out.println(arr1[0] + " " + arr1[1]+" "+arr1[2]);

	}
}
