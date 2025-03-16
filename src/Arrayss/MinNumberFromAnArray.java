package Arrayss;

public class MinNumberFromAnArray {
	public static void main(String[] args) {
		int a[]= {2,34,5,6};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
