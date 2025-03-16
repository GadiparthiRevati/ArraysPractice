package Arrayss;

import java.util.Arrays;

public class MergeTwoIntegerArrays {
	public static void main(String[] args) {
		
	
	int a[]= {1,4,5};
	int b[]= {2,4,4};
	int c[]=new int[a.length+b.length];
	for(int i=0;i<a.length;i++)
	{
		c[i]=a[i];
	}
	
	for(int i=0;i<b.length;i++) {
		c[i+a.length]=b[i];
	}
	System.out.println(Arrays.toString(a));
	System.out.println(a[1]);

}
}
