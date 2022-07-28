package dataStructruresANDAlgorithms;

public class SelectionSort {

	static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minimumIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minimumIndex]) {
					minimumIndex = j;
				}
			}
			if (minimumIndex != i) {
				int temp = array[i];
				array[i] = array[minimumIndex];
				array[minimumIndex] = temp;
			}
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
