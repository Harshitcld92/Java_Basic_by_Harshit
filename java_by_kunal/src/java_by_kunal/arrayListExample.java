package java_by_kunal;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayListExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//syntax for ArrayList
		
		ArrayList<Integer>list=new ArrayList<Integer>(10);
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		list.add(95);
		list.add(105);
		list.add(55);
		list.add(65);
		list.add(75);
		list.add(85);
		
		System.out.println(list);
		//checking that weather an element is present in ArrayList or not
		System.out.println(list.contains(85));//it will return true
		//updating the ArrayList
		list.set(0,100);//it will set 100 at the 0th index
		System.out.println(list);
		//removing an element
		list.remove(0);//it will remove 0th index
		System.out.println(list);
		
		//taking input using for loop
		ArrayList<Integer> list2=new ArrayList<>();
		for(int i=0;i<5;i++) {
			list2.add(sc.nextInt());
		}
		//get item at any index or Printing
		for(int i=0;i<5;i++) {
			System.out.println(list2.get(i));
		}
		System.out.println(list2);
		

	}

}
