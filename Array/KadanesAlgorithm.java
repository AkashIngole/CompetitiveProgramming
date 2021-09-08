package Array;

import java.util.Arrays;

/**
 * Find maximum sum subarray in given sorted/unsorted array
 * @author blankspace
 *
 */
public class KadanesAlgorithm {

	public static int kadane(int[] arr) {
		int global_max = Integer.MIN_VALUE;
		int local_max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			local_max += arr[i];
			
			if(global_max < local_max) {
				global_max = local_max;
			}
			
			if(global_max < 0) {
				global_max = 0;
			}
		}
		
		return global_max;
	}
	
	public static void main(String[] args) {
		int[] arr = {-2, 1, 3, 4, -1, 2, 1, 5, 4};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("The maximum sum of subarray is " + kadane(arr));

	}

}
