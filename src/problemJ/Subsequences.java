package problemJ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Subsequences {

	public static void main(String[] args) {
		Scanner yolo = new Scanner(System.in);

		String a = yolo.next();
		String b = yolo.next();
		
		System.out.print(counts(a,b));
		

	}

	
	private static boolean containsSubsequence(String a, String b) {
		int j = 0;
		for(int i = 0; i < a.length() && j < b.length(); i++)
			if(a.charAt(i) == b.charAt(j))
				j++;
		return (j == b.length());
	}
	
	private static int counts(String a, String b) {
		
		int total = 0;
		ArrayList<int[]> occurences = new ArrayList<int[]>();
		
		for(int i = 0; i < a.length(); i++)
			
			for(int start = 0, end = i; end < a.length(); start++,end++) {
				if()
				if(containsSubsequence(a.substring(start,end+1),b)) {
					total++;
					int[] tmp = {start,end};
					occurences.add(tmp);
				}
					
					
			}
		

		return total;
		
	}
	
}
