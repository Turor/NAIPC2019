import java.util.Scanner;

public class ZeroOneSequences {
	
	public static void main(String[] args) {
		Scanner yolo = new Scanner(System.in);
		String s = yolo.next();
		
		int[] ones = new int[s.length()];		
		int[] zeroes = new int[s.length()+1];
		zeroes[s.length()] = 0;
		for(int i = s.length()-1; i > 0; i--) 
			if(s.charAt(i) == '0')
				zeroes[i] = zeroes [i+1];
		
		for(int i = 0; i < s.length(); i++)
			if(i == 0 && s.charAt(0) == '1')
				ones[i] = 1;
			else
				ones[i] = ones[i-1]++;
		
		int k = 0;
		int baseInversions = 0;
		for(int i = 0; i < s.length();i++)
			if(s.charAt(i)== '1')
				baseInversions += zeroes[i];
			else if(s.charAt(i) == '0')
				baseInversions += ones[i];
			else if( s.charAt(i) == 'k')
				k++;
		
		int inversionsCreated = 0;
		for(int i = 2; i <= k; i++)
			inversionsCreated += pow(2,i)/2;
		
		
		
		
		
		//String length 1: 0 inversions 1 0 2 sequences 0 inversions
		//String length 2: 0 inversions or 1 inversions 10 01 00 11 4 sequences 1 inversion
		//String Length 3: 0 inversions, 2 inversions, or 1 inversions 101 110 100 010 -> 1, 2, 2, 1 8 sequences 6 inversions
		//4: 16 sequences, 1000 0100 0010 1100 0110 1110 1101 1011 1001 -> 3 2 1 4 2 3 2 1 2
		
	}
	
	private static long pow(int base, int pow) {
		long value = 1;
		for(int i = 1; i <= pow; i++)
			value*=base;
		return value;
	}

}
