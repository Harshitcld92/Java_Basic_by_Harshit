package java_by_kunal;
import java.util.Arrays;
import java.util.Scanner;
public class multidimensional_array {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		/*
 		     1 2 3
 		     4 5 6
 		     7 8 9
 		 
		 */
		//declaration
		//int[][] arr=new int[3][3];
		
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
        // you can have variable size of columns also
		int[][] arr2= {
				{1,2,3},
				{4,6},
				{7,8,9,3,0}
		};
		
		//input
		int arr3[][]=new int[3][3];
		for(int row=0;row<arr3.length;row++) {
			//for column input
			for(int col=0;col<arr3[row].length;col++) {
				arr3[row][col]=sc.nextInt();
			}
		}
		//printing
		
		for(int row=0;row<arr3.length;row++) {
			//for column input
			for(int col=0;col<arr3[row].length;col++) {
				System.out.print(arr3[row][col] + " ");
			}
			System.out.println();
		}
		
		//Printing using toString Method
		for(int row=0;row<arr3.length;row++) {
			System.out.println(Arrays.toString(arr3[row]));
		}
		System.out.println();
		
		//Printing using enhanced for loop
		for(int[] a:arr3) {
			System.out.println(Arrays.toString(a));
		}
		
		

	}

}
