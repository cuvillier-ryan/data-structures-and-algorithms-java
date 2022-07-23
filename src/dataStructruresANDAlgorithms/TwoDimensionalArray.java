package dataStructruresANDAlgorithms;

public class TwoDimensionalArray {
	int arr[][] = null;

	// Constructor
	public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
		this.arr = new int[numberOfRows][numberOfColumns];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}
	
	
	// Inserting value in the Array
	public void insertValueInTheArray(int row, int col, int value) {
		try {
			if(arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("The value is succesfully inserted");
			} else {
				System.out.println("This cell is already occupied");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index for 2D array");
		}
	}
	
	// Traverse 2D Array
	public void traverse2DArray() {
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[0].length; col++) {
				System.out.println(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	
}
