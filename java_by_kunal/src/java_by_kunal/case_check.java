package java_by_kunal;
import java.util.Scanner;
public class case_check {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//This is how we take Character as a input
		char ch=sc.next().trim().charAt(0);
		if(ch>='a' && ch<='z') {
			System.out.println("It is LowerCase");
		}else {
			System.out.println("It is UpperCase");
		}
		

	}

}
