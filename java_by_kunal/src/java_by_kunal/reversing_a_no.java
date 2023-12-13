package java_by_kunal;
import java.util.Scanner;
public class reversing_a_no {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		int ans=0;
		while(num>0) {
			int temp=num%10;//gives last digit
			ans=ans*10+temp;//0*10+temp
			num=num/10;
		}
		System.out.println(ans);
	

	}

}
