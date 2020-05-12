package Recursion;

public class FindMax {

	public static int findMax(int[] a, int start, int end) {
		if (end == start)
			return a[start];
		int mid=(start+end)/2;
		int max1=findMax(a, start, mid);
		int max2=findMax(a, mid+1, end);
			
		if (max1 >= max2)
			return max1;
		else
			return max2;
	}
	
	public static void main(String[] args) {
		int[] a = {4,5,1,7};
		System.out.println(findMax(a, 0, 3));
	}
}
