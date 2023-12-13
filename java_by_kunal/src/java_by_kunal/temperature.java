package java_by_kunal;
import java.util.Scanner;
public class temperature {
	public static void main(String[] args) {
		System.out.println("Enter temperture in C: ");
		Scanner sc = new Scanner(System.in);	
		float tempC=sc.nextFloat();
		float tempF=(tempC* 9/5) +32;
		System.out.println("The temperature in Fahrenhite is: " +tempF);
		}

}
