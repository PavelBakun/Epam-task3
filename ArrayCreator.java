package task3;

import java.util.Random;
import java.util.Scanner;

public class ArrayCreator {
	private int m, n;
	private double minVal, maxVal;
	
	public double[][] arrayInit() {
		System.out.println("Enter array size M x N");
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
		n = scan.nextInt();
		do {System.out.println("Enter minValue and maxValue of array");
		minVal = scan.nextDouble();
		maxVal = scan.nextDouble();
		} while (minVal > maxVal);
		scan.close();
		Random random = new Random();
		double[][] arr = new double [m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = minVal + (maxVal - minVal) * random.nextDouble();
			}//close for(i)
		}//close for(j)
		return arr;
	}//close arrayInit 
	
	public double[][] test() {
		double[][] arrayTest = {{1,1,1,0,1,1}, // Min value of array = 0,00 
				                {1,0,1,1,2,1}, // Max value of array = 3,00 
				                {1,1,1,1,1,1}, // Arithmetic mean = 1,00 
				                {1,0,1,3,1,1}, // Geometric mean = 0,00  
				                {1,1,1,1,1,1}, // Local min = 0,00 (i = 1, j = 1)
				                {1,1,1,1,1,1}};// Local max = 2,00 (i = 1, j = 4)
		return arrayTest;
	}
}

