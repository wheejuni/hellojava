package hellojava;

public class AverageCalc {
	
	double computeAverage (int a[]){
		double result = 0;
		int arraySum = 0;
		double divider = a.length;
		
		for (int i = 0; i<a.length; i++){
			arraySum += a[i];
			
		}
		
		result = arraySum / divider; 
		return result;
	}
	
	public static void main (String args[]){
		AverageCalc newAverage = new AverageCalc();
		
		
		 // 테스트 1
        int[] testArray1 = {3, 7, 3};
        System.out.println(newAverage.computeAverage(testArray1));

        // 테스트 2
        int[] testArray2 = {1, 3, 4, 7};
        System.out.println(newAverage.computeAverage(testArray2));

        // 테스트 3
        int[] testArray3 = {4};
        System.out.println(newAverage.computeAverage(testArray3));

        // 테스트 4
        int[] testArray4 = {1, 2, 3, 4, 5};
        System.out.println(newAverage.computeAverage(testArray4));
		
	}

}
