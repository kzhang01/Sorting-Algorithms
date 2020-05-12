package Arrays;
import java.util.ArrayList;


public class ShortestOfStrings {
	public static ArrayList<String> findShortest(String sentence){
		String[] words = null;
		words = sentence.split(" ");
		ArrayList<String> shortest = new ArrayList<String>();
			for(int i = 0; i < words.length - 2; i = i + 3) {
				
				int a = words[i].length();
				int b = words[i + 1].length();
				int c = words[i + 2].length();
				if(a < b && a < c) 
					shortest.add(words[i]);
				else if(b < a && b < c)
					shortest.add(words[i + 1]);
				else if(c < a && c < b)
					shortest.add(words[i + 2]);
				}
			
		return shortest;
	}
	public static void main(String[] args) {
		String example = "Other entries include "
						+ "a historic district "
						+ "in Charlottesville Virginia "
						+ "cut-flower greenhouse complex";
		for(String a:findShortest(example)) {
			System.out.println(a);
		}
	}
}
