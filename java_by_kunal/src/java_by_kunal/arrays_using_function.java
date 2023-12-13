package java_by_kunal;
import java.util.Arrays;
public class arrays_using_function {

	public static void main(String[] args) {
		int[] nums = {1,3,4,5,6};
		System.out.println(Arrays.toString(nums));
		change(nums);
		System.out.println(Arrays.toString(nums));
		

	}
	static void change(int[] num) {
		num[0]=50;
	}

}
