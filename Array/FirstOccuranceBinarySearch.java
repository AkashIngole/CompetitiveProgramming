package Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Find first occurance of an element in a sorted integer array using binary search
 * @author blankspace
 * Brute Force Complexity: O(n)
 * Using Binary Search: O(log n)
 */
public class FirstOccuranceBinarySearch {
	
	public static int bruteForce(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int usingBinarySearch(int[] arr, int target) {
		// the search space is from arr[left...right]
		
		int left = 0, right = arr.length - 1;
		int result = -1;
		int mid;
		
		while(left <= right) {
			mid = left + (right - left) / 2;
			
			if(target == arr[mid]) {
				result = mid;
				right = mid - 1;
			} else if (target < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {-4, 5, 6, 6, 6, 7, 10, 15, 15, 18, 20, 20, 20};
		System.out.println(Arrays.toString(arr));
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input the element whose first occurance is to be searched: ");
		int target = scanner.nextInt();
		
		System.out.println("Using Brute Force: " + bruteForce(arr, target));
		System.out.println("Using Binary Search: " + usingBinarySearch(arr, target));
		
		scanner.close();
	}

}
