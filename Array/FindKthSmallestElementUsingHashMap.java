package Array;

import java.util.HashMap;
import java.util.Map;

public class FindKthSmallestElementUsingHashMap {
	
	public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 4, 19, 26 };
        int k = 3;
        System.out.print("K'th smallest element is " + kthSmallest(arr, 0, arr.length - 1, k));
    }
	
	private static int kthSmallest(Integer[] array, int low, int high, int k) {
		Map<Integer, Integer> elementFreq = new HashMap<>();
		
		for(int i = 0; i < array.length; i++) {
			
			if(elementFreq.containsKey(array[i])) {
				elementFreq.put(array[i], elementFreq.get(array[i]) + 1);
			} else {
				elementFreq.put(array[i], 1);
			}
		}
		
		for( Integer e : elementFreq.keySet()) {
			System.out.println("(" + e + ", " + elementFreq.get(e) + ")");
		}
		int sum = 0;
		for( Integer e : elementFreq.keySet()) {
			sum += elementFreq.get(e);
			if(sum >= k) {
				return e;
			}
		}
		
		return Integer.MAX_VALUE;
		
	}
	
}