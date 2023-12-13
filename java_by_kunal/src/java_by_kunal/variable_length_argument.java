package java_by_kunal;
import java.util.Arrays;
public class variable_length_argument {

	public static void main(String[] args) {
		fun(1,2,3,4,5,6,7,8,9,0);
		fun();
		multipleArgs(1,2,"Harshit","Mansi","Adhyansh","Shobha","Vishnu");
		demo(1,2,3,4,5,9,0);
		demo("sdfsef","sdferg","imoi","oifmomi");

	}
	static void demo(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	
	static void demo(String ...v) {//Method overloading
		System.out.println(Arrays.toString(v));
	}
	
	static void multipleArgs(int a,int b, String ...v) {//variable length argument should always at the end
		System.out.print(Arrays.toString(v));
		System.out.println(a +","+ b);
	}
	static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}

}
