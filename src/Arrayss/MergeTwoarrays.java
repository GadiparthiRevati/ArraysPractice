package Arrayss;

import java.util.Arrays;

public class MergeTwoarrays {
	public static void main(String[] args) {
		String a[]= {"chai","coffee"};
		String b[]= {"milk","water","coke"};
		
		String c[]=new String[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		
		for(int i=0;i<b.length;i++)
		{
			c[i+a.length]=b[i];
		}
		
		System.out.println(Arrays.toString(c));
	}

}
