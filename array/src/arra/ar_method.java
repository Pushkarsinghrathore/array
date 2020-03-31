package arra;

public class ar_method {
	        static   void min( int arr[]) {
		      int min = arr[0];
		      for(int i=0;i<arr.length;i++)
		    	  if(min>arr[i])
		    		  min = arr[i];
		      System.out.println(min);
		      
	   }

	public static void main(String[] args) {
		int[]  a= {11,5,44,99};
		min(a);
		

	}

}
