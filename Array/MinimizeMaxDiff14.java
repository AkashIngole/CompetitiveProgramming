package Array;

import java.util.Arrays;

public class MinimizeMaxDiff14 {

	public static void main(String[] args) {
		int[] array = {4, 5, 3, 8, 2, 9};
		int k = 3;
		
		System.out.println("The minimized difference between max and min is: " + minimize(array, k));

	}
	
	public static int minimize(int[] array, int k) {
		
		Arrays.sort(array);
		
		int arrayMin = array[0];
		int arrayMax = array[array.length - 1];
		
		int exp1 = (arrayMax - k) - (arrayMin + k);
		int exp2 = (arrayMax + k) - (arrayMin - k);
		int baselineDiff = Math.max(exp1, exp2);
		int minDiff = baselineDiff;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i != j) {
					exp1 = Math.max((array[i] - k) - (array[j] + k), 0);
					exp2 = Math.max((array[i] + k) - (array[j] - k), 0);
					
					minDiff = Math.min(Math.max(exp1, exp2), baselineDiff);
				}
			}
		}
		
		return minDiff;
		
		
		
	}

}
