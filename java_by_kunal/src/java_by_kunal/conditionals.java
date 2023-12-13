package java_by_kunal;

public class conditionals {
	public static void main(String[] args) {
		/*
		    Syntax of if statement 
		    if(boolean expression T or F){
		        //body
		    }
		    else{
		         //do this
		    }
		 */
		int sal = 12500;
		if(sal>10000) {
			sal=sal+2000;
		}else {
			sal=sal+1000;
		}
		System.out.println(sal);
		//multiple if else statements
		if(sal>10000) {
			sal+=5000;
		
		}else if(sal>20000) {
			sal+=3000;
		}else {
			sal+=1000;
			
		}
		System.out.println(sal);
	}

}
