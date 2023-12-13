package java_by_kunal;
import java.util.Scanner;
public class typecasting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		float num=sc.nextFloat();
//		System.out.println(num);
		
		//explicit typecasting
		int num=(int)(54.59f);
		System.out.println(num);
		// automatic type promotion in expressions
//		int a=257;
//		byte b= (byte)(a);
//		System.out.println(b);it is giving the reminder value of a%256
		byte a=10;
		byte b=50;
		byte c=25;
		int d=a*b/c;// java automatically promoting each byte to integer when it evaluating this expression 
		System.out.println(d);
		
		byte x=20;
		//x=x*5;//since x*5 is an integer you cannot assign it into byte
		// all the byte short and character values are getting promoted into integer
		// if any one of the operand that you are evaluating is greater than integer 
		//....than the whole operation will be promoted to that data type for ex-
		System.out.println(3*65.556f );//output will be of type float
	}

}
