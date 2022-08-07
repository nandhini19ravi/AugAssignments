package week1.day2;

import java.util.Arrays;

public class FindLargeNumber {

	public static void main(String[] args) {
		int arr[] = {22,67,98,1,34,58,99};
		System.out.println("Value of Array: ");
		for (int i = 0; i<=6; i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("After Sorting: ");
		for (int j=0; j<=6; j++) {
			System.out.println(arr[j]);
		}
		System.out.println("First highest number in the array is: "+arr[arr.length-1]);
		System.out.println("Second highest number in the arrat is: "+arr[arr.length-2]);

	}

}
