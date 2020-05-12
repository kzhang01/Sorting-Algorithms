package Sorting;

import java.util.Arrays;

public class BubbleSortNonRecursive {
	public static void bubbleSort(int arr[]){
		for (int i = 0; i < arr.length - 1; i++){
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args){
		int arr[] = { 4, 77, 98, 30, 20, 50, 77, 22, 49, 2 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
