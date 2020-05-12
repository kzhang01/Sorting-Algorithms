package Recursion;

public class FindZeros {
	static int num = 0;
	public static int findZeros(int a, int counter) {
		//Assume that it goes from 1-15
		//Counter ensures that leading zeros are accounted for
		if(a == 0 && counter == 4) {//To change range, increase counter to match the number of bits to check
			return num;
		}else {
			if(a % 2 == 0) {;
				num++;
			}
			int b = findZeros(a/2, ++counter);
		}
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println("Number of zeros in this binary number: " + findZeros(7, 0));
	}
}
