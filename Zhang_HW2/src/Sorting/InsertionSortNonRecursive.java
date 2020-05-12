package Sorting;

import java.util.Arrays;

public class InsertionSortNonRecursive {
	public static void insertionSort(int[] arr) {
		int temp, j;
		int size = arr.length;
	
		for(int i = 1; i < size; i++) {
			j = i;
			while(arr[j] < arr[j - 1]) {
				temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				
				if(j > 1)
					j--;	
			}
		}	
	}
	
	public static void main(String[] args) {
		int arr[] = { 4, 77, 98, 30, 20, 50, 77, 22, 49, 2 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
