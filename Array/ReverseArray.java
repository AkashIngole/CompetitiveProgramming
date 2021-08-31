package Array;

import java.util.Scanner;
public class ReverseArray {
	
	static void reverseArray(int[] arr) {
		int len = arr.length;
		int start = 0;
		int end = len - 1;
		int temp;
		
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}
	
	static void reverseArrayRecursive(int[] arr, int start, int end) {
		if (start >= end) return;
		
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		reverseArrayRecursive(arr, start + 1, end - 1);
	}
	
	static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int len = scanner.nextInt();
		int[] arr = new int[len];
		
		for(int i = 0; i < len; i++) {
			System.out.print("Enter element at index " + i + ": ");
			arr[i] = scanner.nextInt();
		}
		
		reverseArray(arr);
		
		System.out.println("The reversed array is:\n");
		printArray(arr);
		
		reverseArrayRecursive(arr, 0, len - 1);
		
		System.out.println("Again reversing the second time:\n");
		printArray(arr);
		
		scanner.close();

	}

}
