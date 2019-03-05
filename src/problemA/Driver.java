package problemA;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner yolo = new Scanner(System.in);
		
		//Receive the coordinates in clockwise order
		
		int vertices = yolo.nextInt();
		int kVerts = yolo.nextInt();
		
		//Clockwise ordered List
		double[][] vList = new double[vertices][2];
		for(int i = 0; i < vertices; i++) {
			vList[i][0] = yolo.nextDouble();
			vList[i][1] = yolo.nextDouble();
		}
		
		
		//Calculate the area of each polygon 
		//Counterclockwise List
		double[][] cList = new double[kVerts+1][];
		cList[0] = vList[0];
		
		//Populates a polygon starting at 0 and moving counter clockwise until k points have been added
		for(int i = 1; i <= kVerts; i++)
			cList[i] = vList[vertices-i];
		cList[kVerts] = vList[0];
		
		
		int leftDeterm = 0;
		int rightDeterm = 0;
		
		//Area of one polygon
		for(int x = 0; x <= kVerts; x++) {
			if( x <= kVerts-1) {
				leftDeterm += cList[x][0]*cList[x+1][1];
				rightDeterm += cList[x][1]*cList[x+1][0];
			}else {
				leftDeterm += cList[x][0]*cList[0][1];
				rightDeterm += cList[x][1]*cList[0][0];
			}
		}
		double area = .5*(leftDeterm-rightDeterm);
		
		
		System.out.printf("%.7f",area);
	}

}
