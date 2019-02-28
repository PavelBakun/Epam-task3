package task3;

public class ArrayMethods {
	static void printArray(double[][] a) {
		for (double[] row: a) {
			for (double elem: row) {
				System.out.printf("%2.2f  ", elem);
			}//close for(elem)
			System.out.println();
		}//close for(row)
	}
	
	static void minMaxArr(double[][] a) {
		double min = a[0][0];
		double max = a[0][0];
		for (double[] row: a) {
			for (double elem: row) {
				if (elem < min) {
					min = elem;
				}//close if;
				if (elem > max) {
					max = elem;
				}//close if;
			}//close for(elem)
		}//close for(row)
		System.out.printf("Min value of array = %.2f \n" +
				"Max value of array = %.2f  \n", min, max);
	}//close minMaxArr
	
	static void meanArithGeom(double[][] a){
		double sum = 0;
		double multipl = 1;
		int lengthArray = a.length * a[0].length;
		for (double[] row: a) {
			for (double elem: row) {
				sum += elem;
				multipl *= elem;
			}//close for(elem)
		}//close for(row)
		sum /= lengthArray;
		if ((multipl < 0) && (lengthArray % 2 == 0)) {
			System.out.printf("Arithmetic mean = %.2f \n" 
					+ "Geometric mean - complex number\n", sum);
		} else {
		multipl = Math.pow(multipl, 1.0 / lengthArray);
		System.out.printf("Arithmetic mean = %.2f \n" +
				"Geometric mean = %.2f  \n", sum, multipl);
		}//close if-else
	}//close meanArithGeom()
	
	static void localMin(double[][] a){
		double localMin = -1; 
		int iFirstMin = -1;
		int jFirstMin = -1;
		for (int i = 1; i < a.length - 1; i++) {
			for (int j = 1; j < a[i].length - 1; j++) {
				if ((a[i][j] < a[i][j-1]) && (a[i][j] < a[i-1][j]) 
						&& (a[i][j] < a[i+1][j]) && (a[i][j] < a[i][j-1])) {
					localMin = a[i][j];
					iFirstMin = i;
					jFirstMin = j;	
					i = a.length-1;//finish for(i)
					j = a[0].length-1;//finish for(j)
				}//close if min;
			}//close for(j)
		}//close for(i)
		System.out.printf("Local min = %.2f (i = %d, j = %d) \n",
					localMin, iFirstMin, jFirstMin);
	}//close localMin

	static void localMax(double[][] a){
		double localMax = -1;
		int iFirstMax = -1;
		int jFirstMax = -1;
		for (int i = 1; i < a.length - 1; i++) {
			for (int j = 1; j < a[i].length - 1; j++) {
				if ((a[i][j] > a[i][j-1]) && (a[i][j] > a[i-1][j]) 
						&& (a[i][j] > a[i+1][j]) && (a[i][j] > a[i][j-1])) {
					localMax = a[i][j];
					iFirstMax = i;
					jFirstMax = j;
					i = a.length-1; //finish for(i)
					j = a[0].length-1; //finish for(j)
				}//close if max;
			}//close for(j)
		}//close for(i)
		System.out.printf("Local max = %.2f (i = %d, j = %d) \n",
					localMax, iFirstMax, jFirstMax);
	}//close localMax
	
	static double[][] transpon(double[][] a) {
		if (a.length == a[0].length) {// M=N - it is square matrix
			double temp;
			for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a[i].length; j++) {
					temp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = temp;
				}//close for(j)
			}//close for(i)
			return a;
		} else {
			double[][] b = new double[a[0].length][a.length];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					b[j][i] = a[i][j];
				}//close for(j)
			}//close for(i)
			return b;
		}//close if-else
	}//close transpon
}
