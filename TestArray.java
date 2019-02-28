package task3;

public class TestArray {

	public static void main(String[] args) {
		ArrayCreator arr = new ArrayCreator();
		
		double[][] massiv = arr.arrayInit(); 

		double[][] arrTest = arr.test();
		/* arrayTest = {{1,1,1,0,1,1}, // Min value of array = 0,00 
				        {1,0,1,1,2,1}, // Max value of array = 3,00 
				        {1,1,1,1,1,1}, // Arithmetic mean = 1,00 
				        {1,0,1,3,1,1}, // Geometric mean = 0,00  
				        {1,1,1,1,1,1}, // Local min = 0,00 (i = 1, j = 1)
				        {1,1,1,1,1,1}} // Local max = 2,00 (i = 1, j = 4)
		*/
		
		ArrayMethods.minMaxArr(massiv);
		ArrayMethods.meanArithGeom(massiv);
		ArrayMethods.localMin(massiv);
		ArrayMethods.localMax(massiv);
		ArrayMethods.printArray(massiv);
		System.out.println();
		ArrayMethods.printArray(ArrayMethods.transpon(massiv));
		
		ArrayMethods.minMaxArr(arrTest);
		ArrayMethods.meanArithGeom(arrTest);
		ArrayMethods.localMin(arrTest);
		ArrayMethods.localMax(arrTest);
		ArrayMethods.printArray(arrTest);
		System.out.println();
		ArrayMethods.printArray(ArrayMethods.transpon(arrTest));
		
	}//close main
} //close class TestArray
