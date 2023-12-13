package java_by_kunal;
import java.util.Scanner;
public class function_with_argument {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int result=sumByPassingValue(10,20);
		System.out.println(result);
		
		//Taking name as input
		System.out.println("Enter your name: ");
		String name= sc.next();
		
		//calling message function
		String Message=message(name);
		System.out.println(Message);

	}
	
	static int sumByPassingValue(int a,int b) {//two parameters a and b
		int sum= a+b;
		return sum;
	}
	
	//function returning string 
	static String message(String name) {
		String Private_message="Hello "+name;
		return Private_message;
		}

}
