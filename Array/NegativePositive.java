package Array;

import java.util.Arrays;

public class NegativePositive {

	public static void printArray( int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void sortArray( int[] array) {
		System.out.println("-->>Using default Arrays.sort() method (dual-pivot quicksort).\n");
		Arrays.sort(array);
		printArray(array);
	}
	
	public static void twoPointer(int[] array) {
		System.out.println("-->> Using two pointer technique & additional array to store the result.\n");
		int left = 0;
		int right = array.length -1;
		int[] result = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < 0) {
				result[left] = array[i];
				left++;
			}
			if(array[i] >= 0) {
				result[right] = array[i];
				right--;
			}
		}
		
		printArray(result);
	}
	
	public static void twoPointerOptimized(int[] array ) {
		System.out.println("-->> Using two pointer technique & in-place swapping to store the result.\n");
		int i = 0;
		int j = array.length - 1;
		
		while(i < array.length - 1 && j >= 0) {
			if(array[i] < 0 && array[j] >= 0) {
				i++;
				j--;
			}
			if(array[i] < 0 && array[j] < 0) {
				i++;
			}
			if(array[i] >= 0 && array[j] < 0) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
			if(array[i] > 0 && array[j] >= 0) {
				j--;
			}
			System.out.println(i);
			System.out.println(j);
			System.out.println("========================");
		}
		System.out.println(i);
		System.out.println(j);
		
		printArray(array);
	}
	public static void main(String[] args) {
		int[] array = {-8, 9, 8, -2, 1, -7, -8, 5, 42, -3, -6, 12, -13};
		
		sortArray(array);
		
		twoPointer(array);
		
		twoPointerOptimized(array);

	}

}
