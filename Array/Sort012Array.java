package Array;

public class Sort012Array {
	
	public static void linearPartition(Integer[] array) {
		int low = 0;
		int mid = 0;
		int end = array.length - 1;
		int pivot = 1;
		int temp;
		
		while(mid <= end) {
			if(array[mid] < pivot) {
				temp = array[low];
				array[low] = array[mid];
				array[mid] = temp;
				low++;
				mid++;
			} else if(array[mid] > pivot) {
				temp = array[mid];
				array[mid] = array[end];
				array[end] = temp;
				end--;
				//mid++;
			} else { // if array[mid] == 1
				mid++;
			}
		}
		System.out.println("Sorting using linear partition. \n The sorted array is:\n");
		printArray(array);
	}

	public static void sortArray(Integer[] array) {
		/*The problem with this approach is
		 * 1. It requires two traversals of array
		 * 2. REquires O(n) time.
		 * 
		 * This approach is in-place sorting, so no extra memory is required.		 * 
		 */
		
		// Initialize counter variables for frequency of 0, 1 and 2
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int i;
		
		// Find the count of each element and store it
		for(i = 0; i < array.length; i++) {
			if(array[i] == 0) count0++;
			else if (array[i] == 1) count1++;
			else count2++;
		}
		
		i = 0;
		
		// Store all 0 elements in array
		while(count0 > 0) {
			array[i++] = 0;
			count0--;
		}
		// Store all 1 elements after 0 elements
		while(count1 > 0) {
			array[i++] = 1;
			count1--;
		}
		// Store all 2 elements after 1 elements
		while(count2 > 0) {
			array[i++] = 2;
			count2--;
		}
		
		System.out.println("\nSortring with counting method. \nThe sorted array is:\n ");
		printArray(array);
	}
	
	
	public static void main(String[] args) {
		Integer[] array = {0, 1, 2, 0, 1, 2};
		System.out.print("The original array is:");
		printArray(array);
		
		sortArray(array);
		
		linearPartition(array);

	}

	public static void printArray(Integer[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n---------------\n");
	}
	
	

}
