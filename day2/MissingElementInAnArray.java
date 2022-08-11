package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		
		//Sorting and printing
		Arrays.sort(arr);
		int a=1;
		for (int b=0; b<arr.length;b++) {
			if (arr[b]!=a)
			{
				System.out.println("The Missing Element in an array is "+a);
				break;
			}
			a++;
		}

	}

}
