package java_by_kunal;

public class swap_using_functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Harshit Gupta";
		changename(name);
		System.out.println(name);
		
		int a=10;
		int b=20;
		swap(a,b);
		System.out.println("a=" +a +"b=" +b);

	} 
	
	
	static void changename(String naam) {
		naam="Harshit porwal";//here we are not changing the name, instead we are creating the new object
	}
	//name->HarshitGupta
	//naam->HarshitGupta, but after changing the naam to HarshitPorwal
	//It is pointing to HarshitPorwal, naam->HarshitPorwal
	static void swap(int a,int b) {
		int temp =a;
		a=b;
		b=temp;
		System.out.println("a="+a+"b="+b);
		
	}

}
