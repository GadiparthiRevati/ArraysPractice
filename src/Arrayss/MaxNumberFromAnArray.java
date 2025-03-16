package Arrayss;

public class MaxNumberFromAnArray {
	public static void main(String[] args) {
		
	int a[]= {22,5,111,9,6};
	int max=a[0];
	int maxIndex=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
			maxIndex=i;
		}
	}
	System.out.println(max);
	System.out.println(maxIndex);
	
	
	
	
	
	}

}
