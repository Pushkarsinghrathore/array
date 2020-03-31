package arra;

public class copyarray {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4};
		
		int[] b = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println("THE ARRAY ELEMENTS BEFORE ARE:");
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		System.out.println("THE ARRAY ELEMENTS Afterwards ARE:");
		for(int i=0;i<b.length;i++)
		System.out.println(b[i]);	
	}

}
