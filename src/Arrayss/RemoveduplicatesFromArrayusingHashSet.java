package Arrayss;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveduplicatesFromArrayusingHashSet {
	
	public static void main(String[] args) {
		int a[]= {2,3,2,4,5,3,6};
		
		Set<Integer> set= new HashSet<>();
		
		for(Integer ele : a) {
			set.add(a[ele]);
		}
		
		Integer b[]=set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(b));
	}

}
