package arra;

public class max_array {
	static void max ( int arr[]) {
		 int max= arr[1];
		 for(int i=0;i<arr.length;i++)

			 if(max<arr[i])
				 // for(int i=0;i<arr.length;i++)
				  max=arr[i];
		 
			     System.out.println(max);
	}
	       

	public static void main(String[] args) {
		int[] a = {0,2,3,4,5,6,9};
		System.out.println("THE ARRAY ELEMENTS ARE:");
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		
		System.out.println( "The  max value among the array is:");
		max(a);
		
		

	}

}
