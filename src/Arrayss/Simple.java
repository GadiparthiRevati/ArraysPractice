package Arrayss;

import java.util.Arrays;

public class Simple {
	
	public static void main(String[] ar) {
		int a[]= {2,4,6,9};
		int b[]= {10,11};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int j=0;j<b.length;j++) {
			c[j+a.length]=b[j];
		}
		System.out.println(Arrays.toString(c));
		
	}
}