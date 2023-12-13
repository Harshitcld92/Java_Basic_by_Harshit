package java_by_kunal;
import java.util.Scanner;
public class loops {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/*
		    SYntx of for loop
		    for (initialization; condition; increament/decreament){
		        //body
		     }
		 */
		//Ques Print no. from 1-10
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		//print no. from 1 to n
		System.out.println("Write the value of n..");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		/*
		    Syntax for while loop:
		    while(condition){
		       //body
		    }
		    
		 */
		//Ques Print no. from 1 to n using while loop
		System.out.println("What is the Value of M..");
		int m=sc.nextInt();
		int i=1;
		while(i<=m) {
			System.out.print(i+ " ");
			i++;
		}
		System.out.println();
		// do while loop 
		/*
		    do{
		       //body
		    }while(condition);
		     
		 */
		int x=1;
		do {
			
			System.out.println(x);
			x++;
		}while(x<=10);
	}

}
