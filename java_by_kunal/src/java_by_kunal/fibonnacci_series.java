package java_by_kunal;
import java.util.Scanner;
public class fibonnacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("write the value of N...");
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			int c=a+b;
			a=b;
			b=c;
		}
		System.out.println(b);

	}

}
