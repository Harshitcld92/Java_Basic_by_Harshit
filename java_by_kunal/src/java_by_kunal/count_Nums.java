package java_by_kunal;
import java.util.Scanner;
public class count_Nums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("what is the number in which you have to find the digit count: ");
		long num=sc.nextLong();
		System.out.println("Which digits count you have to find? ");
		int n=sc.nextInt();
        int count=0;
        while(num>0) {
        	long temp=num%10;//gives last digit of num
        	if(temp==n) {
        		count++;
        	}
        	num=num/10;//cuts the last digit of num
        }
        System.out.println(count);
		
		

	}

}
