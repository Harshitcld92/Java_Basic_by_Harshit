package java_by_kunal;
import java.util.Scanner;
public class largest_among_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		//Ques: Find the largest among 3 numbers
		int max=a;
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		System.out.println(max);
		//another Method
		
		int maximum=Math.max(c,Math.max(a, b));
		System.out.println(maximum);
		

	}

}
