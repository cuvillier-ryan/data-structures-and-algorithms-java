package dataStructruresANDAlgorithms;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

//		SingleDimensionArray sda = new SingleDimensionArray(3);
//		sda.insert(0, 10);
//		sda.insert(1, 20);
//		sda.insert(2, 30);
//
//		var firstElement = sda.arr[0];
//		System.out.println(firstElement);
//		sda.traverseArray();
//		sda.searchInArray(20);
//		sda.deleteInArray(2);
//		System.out.println(sda.arr[2]);
		
		TwoDimensionalArray sda = new TwoDimensionalArray(3, 3);
		sda.insertValueInTheArray(0, 0, 10);
		sda.insertValueInTheArray(0, 1, 20);
		sda.insertValueInTheArray(1, 0, 30);
		sda.insertValueInTheArray(2, 0, 40);
		
		
		System.out.println(Arrays.deepToString(sda.arr));
		sda.deleteValueFromArray(0, 0);
		System.out.println(Arrays.deepToString(sda.arr));
		
	}	

}
