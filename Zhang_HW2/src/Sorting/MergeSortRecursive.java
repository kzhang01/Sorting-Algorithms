package Sorting;

import java.util.Arrays;

public class MergeSortRecursive {
	
	public static void mergeSort(int[] a, int n) {
	    if (n < 2)
	        return;
	    
	    int mid = n / 2;
	    int[] arr1 = new int[mid];
	    int[] arr2 = new int[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        arr1[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        arr2[i - mid] = a[i];
	    }
	    mergeSort(arr1, mid);
	    mergeSort(arr2, n - mid);
	 
	    merge(a, arr1, arr2, mid, n - mid);
	}
	
	public static void merge(int[] a, int[] L, int[] R, int left, int right) {
		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (L[i] <= R[j]) {
				a[k] = L[i];
				k++; i++;
			}else {
				a[k] = R[j];
				k++; j++;
			}
		}
		while (i < left) {
			a[k] = L[i];
			k++; i++;
		}
		while (j < right) {
			a[k] =R[j];
			k++; j++;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 4, 77, 98, 30, 20, 50, 77, 22, 49, 2 };
	    mergeSort(arr, arr.length);
	    System.out.println(Arrays.toString(arr));
	}

}
