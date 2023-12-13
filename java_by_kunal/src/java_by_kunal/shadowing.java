package java_by_kunal;

public class shadowing {
	static int x=90;//this will be shadowed at line 10
	public static void main(String[] args) {
		 
		//variable of the higher level scope is hidden
		System.out.println(x);//90
		int x;
		//System.out.println(x); scope will begin when the variable is initialized
		x=60;
		System.out.println(x);//60
		fun();

	}
	static void fun() {
		System.out.println(x);
	}
}
