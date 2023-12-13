package java_by_kunal;
import java.util.Arrays;
public class change_value {

	public static void main(String[] args) {
		//create an array
		int[] arr= {1,2,3,5,4};
		change(arr);
		System.out.println(Arrays.toString(arr));
		//here the value at index three will get change because some object modified by nums
		//than original object will also get modified 

	}
	
	static void change(int[] nums) {
		nums[3]=10;
	}

}
//for scopes -> If there is anything initialized outside you can use or modify it inside,
//but if anything is initialized inside you cannot use it or modify it outside