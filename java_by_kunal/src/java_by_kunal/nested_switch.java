package java_by_kunal;
import java .util.Scanner;
public class nested_switch {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int EmpID=sc.nextInt();
		String department=sc.next();
		switch(EmpID) {
		case 1:
			System.out.println("Harshit Gupta");
			break;
		case 2:
			System.out.println("Mansi Gupta");
			break;
		case 3:
			System.out.println("Adhyansh Gupta");
			//Another Switch
			switch(department) {
			case "IT":
				System.out.println("IT department");
				break;
			case "Management":
				System.out.println("Mangement Department");
				break;
			default:
				System.out.println("No Department Entered");
					
			}
			break;
		default:
			System.out.println("Enter Correct EmpID");
		}

	}

}
