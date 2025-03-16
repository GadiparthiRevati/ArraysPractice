package Arrayss;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		
		String a[]= {"java","c","c++","java","phython","c","c++"};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate element:" + a[i]);
				}
			}
		}
	}

}
