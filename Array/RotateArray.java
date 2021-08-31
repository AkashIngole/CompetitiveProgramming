package Array;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Original Array is: ");
		printArray(array);
		System.out.println("Enter number of rotations: ");
		int rotations = scanner.nextInt();
		
		rotateArray(array, rotations);
		rotateArrayUsingSwaps(array, rotations);
		
		
	}
	
	public static void rotateArray(int[] array, int rotations) {
		if(rotations <= 0) {
			System.out.println("Invalid input.");
		} else {
			System.out.println("Printing array after " + rotations + " rotations.");
			while(rotations > 0) {
				int sendToLast = array[0];
				for(int i = 0; i < array.length - 1; i++) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
				array[array.length - 1] = sendToLast;
				rotations--;
			}
			 printArray(array);
		}
	}
	
	public static void rotateArrayUsingSwaps(int[] array, int rotations) {
		while(rotations > 0) {
			int i = 0;
			int j = array.length-1;
			while(i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
//				i++; // for clockwise rotations
				j--; // for anti-clockwise rotations
			}
			rotations--;
		}
		System.out.println("Rotating using swapping:");
		printArray(array);
	}
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
