package java_by_kunal;
import java.util.Scanner;
public class print_arr_IfCol_isNotFixedSize {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[][] arr= {
				{1,2,3},
				{2,5},
				{8,9,10,88}
		};
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col] +" ");
			}
			System.out.println();
		}
				

	}

}
