package arra;

public class Anonymous {
	static void Array(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		Array(new int[] {10,20,30});
		

	}

}
