package Array;

import java.util.Scanner;
import java.util.Arrays;

public class FindMinMaxArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of elements of array: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter element at index " + i + " : ");
			array[i] = scanner.nextInt();		
		}
		
		usingBubbleSort(array);
		
		usingBruteForce(array);
		
		usingArraySort(array);
		
		scanner.close();
		
	}

	private static void usingArraySort(int[] array) {
		System.out.println("\nUsing Arrays.sort()........");
		if( array.length == 0) {
			System.out.println("Empty input array");
			return;
		}
		Arrays.sort(array);
		System.out.println("The sorted array is " + Arrays.toString(array));
		System.out.println("The smallest element in array is : " + array[0]);
		System.out.println("The largest element in array is : " + array[array.length - 1]);
	}

	private static void usingBruteForce(int[] array) {
		System.out.println("\nUsing Brute Force Approach........");
		int min, max;
		if(array.length == 0) {
			System.out.println("Empty input array.");
			return;
		}
		
		if(array.length == 1) {
			min = array[0];
			max = array[0];
		} else if(array[0] > array[1]) {
			max = array[0];
			min = array[1];
		} else {
			min = array[0];
			max = array[1];
		}
		
		for(int i = 2; i < array.length; i++) {
			if( array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.println("The smallest element is: " + min);
		System.out.println("The largest element is: " + max);
		
	}

	private static void usingBubbleSort(int[] array) {
		System.out.println("\nUsing Bubble Sort........");
		int len = array.length;
		if(len == 0) {
			System.out.println("Empty input array");
			return;
		}
		int temp = 0;
		for(int i = 0; i < len-1; i++) {
			for(int j = i + 1; j < len; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println("The sorted array using bubble sort is: ");
		for(int i = 0; i < len; i++) {
			System.out.print(array[i] + "\t");
		}
		
		System.out.println("The smallest element is: " + array[0]);
		System.out.println("The largest element is: " + array[array.length - 1]);
	}

}
