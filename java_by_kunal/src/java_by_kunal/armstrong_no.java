package java_by_kunal;
import java.util.Scanner;
public class armstrong_no {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		boolean ans=armstrong(num);
		System.out.println(ans);
		
		//for printing armstrong numbers in given range
		for(int i=100;i<1000;i++) {
			if(armstrong(i)) {
				System.out.println(i+ " ");
			}
		}
		}
	static boolean armstrong(int num) {
		
		int original=num;
		
		int sum=0;
		while(num>0) {
			int rem=num%10;
			num=num/10;
			sum=sum+rem*rem*rem;
			
			
		}
		
		return sum==original;

	}

}
