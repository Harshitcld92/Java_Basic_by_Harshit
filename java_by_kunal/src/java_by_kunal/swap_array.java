package java_by_kunal;
import java.util.Arrays;
public class swap_array {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		swap(arr,1,3);//it will replace the index 3 with index 1 and index 1 with 3 
		System.out.println(Arrays.toString(arr));

	}
	static void swap(int[] arr,int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	

}
