package Arrayss;

public class SumOfIntegers {
	public static void main(String[] args) {
		int a[]= {2,5,1,9,6};
		
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
