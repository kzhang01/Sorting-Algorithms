package Sorting;

import java.util.Arrays;

public class SelectionSortNonRecursive {
	public static void selectionSort(int[] arr) {
		int temp, minimum;
		int size = arr.length;
		
		for(int i = 0; i < size; i++) {
			minimum = i;
			for(int j = i + 1; j < size; j++) {
				if(arr[j] < arr[minimum])
					minimum = j;
			}
			temp = arr[minimum];
			arr[minimum] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 4, 77, 98, 30, 20, 50, 77, 22, 49, 2 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
