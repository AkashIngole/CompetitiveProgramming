package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnionIntersection {

	public static void main(String[] args) {
		int[] array1 = {1, -8, -5, 5, 69, 45, -88};
		int[] array2 = {1, -1, -11, 23, 20, 54, -56, 69, 45, -88};
		
		findUnion(array1, array2);
		
		findIntersection(array1, array2);

	}
	
	public static void findUnion(int[] array1, int[] array2) {
		Map<Integer, Integer> union = new HashMap<>();
		for(int i = 0; i < array1.length; i++) {
			union.put(array1[i], 1);
		}
		for(int i = 0; i < array2.length; i++) {
			union.put(array2[i], 1);
		}
		List<Integer> unionList = new ArrayList<>(union.keySet());
		System.out.println("The UNION of two arrays is:\n");
		System.out.println(unionList);
		
	}

	public static void findIntersection(int[] array1, int[] array2) {
		Map<Integer, Integer> map1 = new HashMap<>();
		for(int i = 0; i < array1.length; i++) {
			map1.put(array1[i], 1);
		}
		
		Map<Integer, Integer> map2 = new HashMap<>();
		for(int i = 0; i < array2.length; i++) {
			map2.put(array2[i], 1);
		}
		
		System.out.println("The INTERSECTION of two arrays is:\n");
		for(int i = 0; i < array1.length; i++) {
			if(map2.containsKey(array1[i])) {
				System.out.print(array1[i] + ", ");
			}
		}
	}
}
