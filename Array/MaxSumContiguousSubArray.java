package Array;

public class MaxSumContiguousSubArray {

	public static void main(String[] args) {
//		int[] array = {1, 4, 5, -1, -6, 2, 8, 4, -3};
		int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		System.out.println("The Maximum sum is: " + maxSum(array));

	}
	
	private static int maxSum(int[] array) {
		int sum = 0;
		int max_sum = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
			if(max_sum < sum) {
				max_sum = sum;
			}
			if(sum < 0) {
				sum = 0;
			}
		}
		return max_sum;
	}

}
