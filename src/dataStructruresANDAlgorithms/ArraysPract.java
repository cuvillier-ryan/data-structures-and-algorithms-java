package dataStructruresANDAlgorithms;

import java.util.Arrays;

public class ArraysPract {

	public static void main(String[] args) {
		
		int[] arr;
		arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[2] = Integer.MIN_VALUE);
		
		int[] newArr = new int[6];
		newArr[0] = 1;
		newArr[1] = 2;
		newArr[2] = 3;
		
		System.out.println(Arrays.toString(newArr));
		System.out.println(newArr[4] = Integer.MIN_VALUE);
		

	}
	
	public void missingNumber(int[] intArray) {
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i : intArray) {
			sum1 += i;
		}
		sum2 = 10*(10+1)/2;
		int difference = sum2 - sum1;
		System.out.println("Missing number is: " + difference);
	}


}
