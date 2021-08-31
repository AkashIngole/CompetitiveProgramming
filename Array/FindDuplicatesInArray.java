package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		int[] array = {0, 3, 1, 2};
		int[] array2 = {0, 3, 1, 2};
		ArrayList<Integer> unorderedList = unorderedDuplicates(array);
		System.out.println(unorderedList);
		System.out.println(Arrays.toString(array));
		
		ArrayList<Integer> orderedList = orderedDuplicates(array2);
		System.out.println(orderedList);
		
	}
	
	public static ArrayList<Integer> unorderedDuplicates(int[] array) {
		ArrayList<Integer> list = new ArrayList<>();
		int n = array.length;
		for(int i = 0; i < n; i++) {
			int j = Math.abs(array[i]);
			if(array[j] >= 0) {
				array[j] = -1 * array[j];
			} else {
				list.add(j);
			}
		}
		
		if(list.isEmpty()) list.add(-1);
		
		return list;
	}

	public static ArrayList<Integer> orderedDuplicates(int[] array) {
		ArrayList<Integer> list = new ArrayList<>();
		int n = array.length;
		for(int i = 0; i < n; i++) {
			System.out.println(i);
			System.out.println(array[i]);
			array[array[i] % n] += n;
		}
		
		for(int i = 0; i < n; i++) {
			if(array[i] >= 2*n) {
				list.add(i);
			}
		}
		
		if(list.isEmpty()) list.add(-1);
		
		return list;
	}
}
