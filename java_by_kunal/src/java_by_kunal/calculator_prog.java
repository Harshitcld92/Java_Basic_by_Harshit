package java_by_kunal;
import java.util.Scanner;
public class calculator_prog {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ans=0;
		
		//take input from the user till user press X or x
		while(true) {
			//taking operator as an input
			
			System.out.println("Enter the Operator: ");
			char ch=sc.next().trim().charAt(0);
			
			
			
			if(ch=='+' || ch=='-' || ch=='*' || ch=='/'|| ch=='%') {
				//taking two character as an input
				System.out.print("Enter two Numbers: ");
				int a=sc.nextInt();
				int b=sc.nextInt();
				if(ch=='+') {
					ans=a+b;
				}
				if(ch=='-') {
					ans=a-b;
				}
				if(ch=='*') {
					ans=a*b;
				}
				if(ch=='/') {
					if(b!=0) {
					  ans=a/b;
					}
				}
				if(ch=='%') {
					ans=a%b;
				}
				if(ch=='+') {
					ans=a+b;
				}
			}else if(ch=='x' || ch=='X') {
				break;
			}else {
				System.out.println("Invalid Operator");
			}
			System.out.println(ans);
		}
		

	}

}
