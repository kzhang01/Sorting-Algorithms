package Arrays;

public class CheckReverse {
	public static boolean checkReverse(String one, String two) {
		boolean bool = false;
		if(one.length() == two.length()) {
			for(int i = 0; i < one.length(); i++) {
				if(one.charAt(i) == two.charAt(two.length() - i - 1))
					bool = true;
				else
					bool = false;
			}
			return bool;
		}else
			return false;
		
	}
	public static void main(String[] args) {
		System.out.println(checkReverse("googl", "elgoog"));

	}
}
