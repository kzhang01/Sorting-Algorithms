package Sorting;

import java.util.Arrays;

public class BubbleSortRecursive {
	public static int[] bubbleSort(int[] arr, int n) {
		int temp;
		if(n == 1) {
			System.out.println(Arrays.toString(arr));
			return arr;
		}else {
			for(int i = 0; i < n - 1; i++) {
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			return bubbleSort(arr, n - 1);
		}

	}
	
	public static void main(String[] args) {
		int arr[] = { 4, 77, 98, 30, 20, 50, 77, 22, 49, 2 };
		bubbleSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
}
 