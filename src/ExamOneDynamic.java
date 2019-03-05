
public class ExamOneDynamic {
	
	
	
	public static boolean recSol(int n) {
		if(n < 0)
			return false;
		else if( n == 0)
			return true;
		boolean sev = recSol(n-7);
		boolean thr = recSol(n-3);
		
		return sev || thr;
	}
	
	
	public static boolean dynSol(int n) {
		boolean [] table = new boolean[n+7];
		
		for(int i = 0; i < 6; i++)
			table[i] = false;
		
		table[6] = true;
		
		for(int i = 7; i < n + 7; i++)
			table[i] = table[i-3]|| table[i-7];
		return table[n+6];
	}

}
