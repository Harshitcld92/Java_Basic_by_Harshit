package java_by_kunal;
import java.util.Scanner;
import java.util.Arrays;
public class input_arr {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr = new int[5];
		arr[0]=40;
		arr[1]=41;
		arr[2]=42;
		arr[3]=43;
		arr[4]=44;
		//[40,41,42,43,44]
		System.out.println(arr[4]);
		
		//input using for loop
		int[] arr2=new int[5];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		//printing an array
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		//Printing enhanced for loop
		for(int num:arr2) {//for every element in the array print the element 
			System.out.print(num+" ");//num represent the elements of an array
		}
		System.out.println();
		
		// Printing using toString() method
		System.out.println(Arrays.toString(arr2));//it will add brackets and commas
		
		// creating a String Array (or NonPrimitive) type Array
		String[] str=new String[5];
		for(int i=0;i<str.length;i++) {
			str[i]= sc.next();
		}
		System.out.println(Arrays.toString(str));
		
		//modifying the Array
		str[1]="Harshit";
		System.out.println("After Modification..");
		System.out.println(Arrays.toString(str));
		

	}

}
