package problemD;

import java.util.Scanner;

public class ModWorld {

	public static void main(String[] args) {
		Scanner yolo = new Scanner(System.in);
		int cases = yolo.nextInt();
		int[][] values = new int[cases][3];

		for(int i = 0; i < cases; i++) {

			values[i][0] = yolo.nextInt();
			values[i][1] = yolo.nextInt();
			values[i][2] = yolo.nextInt();

		}
		long[] solutions = new long[cases];
		for(int c = 0; c < cases; c++) {
			int n = values[c][2];
			int p = values[c][0];
			int q = values[c][1];
			solutions[c] = mySolution(p,q,n);


		}
		for(int i = 0; i < cases; i++)
			System.out.println(solutions[i]);

	}

	public static long mySolution(int p, int q, int n) {
		long cycleSum = 0;
		if(p%q == 0)
			return 0;

		p = p%q;
		int iterations = 0;
		long sum = 0;
		int offset = 0;
		while(iterations < n) {
			int exec = q/(q-p);	
			if(n-iterations < exec )
				exec = n-iterations;
			sum +=	q*exec+(p-q)*exec*(exec+1)/2+offset*exec;
			offset++;

			iterations += exec;
		}

		System.out.println("M: " +p + " " + q + " " + n + " " +  cycleSum + " "  + sum);

		return sum;
	}

	public static long correct(int p, int q, int n) {
		long sum = 0;
		for(int i = 1; i <= n; i++)
			sum += (p*i)%q;
		//System.out.println("C: " + p + " " + q + " " + n + " " + sum);
		return sum;
	}

}
