package java_by_kunal;
import java.util.Scanner;
public class sum_suing_functions {

	public static void main(String[] args) {
		sum();
		int ans=sum2();//calling sum2 function
		System.out.println(ans);
		

	}
	/*
	    access modifiers (we'll look after), return type, Name(){
	      ///body
	       return statement;
	    }
	 */
	 static void sum() { //function with void return type
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter Num2: ");
		int num2= sc.nextInt();
		int sum=num1+num2;
		System.out.println("The sum is: "+sum);
	}
	 
	// function with integer as return type
	 
	 static int sum2() {
		 Scanner sc= new Scanner(System.in);
			System.out.println("Enter num1: ");
			int num1=sc.nextInt();
			System.out.println("Enter Num2: ");
			int num2= sc.nextInt();
			int sum=num1+num2;
			return sum; //here we are returning the sum instead of printing it
			//System.out.println("This will never Execute");
	 }

}
