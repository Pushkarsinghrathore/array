
package arra;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new  int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		System.out.println("THE ARRAY ELEMENTS OF FIRST ARRAY ARE:");
		     for(int i=0;i<5;i++)
		    	 System.out.println(a[i]);
		int[] b = new  int[5];
		b[0]=a[0];
		b[1]=a[1];
		b[2]=a[2];
		b[3]=a[3];
		b[4]=a[4];
		System.out.println("THE COPIED ELEMENTS OF  ARRAY ARE:");
	     for(int i=0;i<5;i++)
	    	 System.out.println(b[i]);
		

	}

}
