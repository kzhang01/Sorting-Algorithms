package Recursion;

public class Palindrome {
	static String newInput = "";
	public static String reverseString(String input, int i) {
		if (i == -1)
			return newInput;
		else {
			newInput = newInput + input.charAt(i);
			reverseString(input, i - 1);
		}
		return newInput;
	}
	public static boolean isPalindrome(String input) {
		String onlyLetters = input.replaceAll("[\\W]", "");
		System.out.println(onlyLetters);
		if(onlyLetters.equals(reverseString(onlyLetters, onlyLetters.length() - 1)))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("k.a.y,,,ak"));

	}

}
