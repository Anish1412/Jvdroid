import java.util.*;

public class Main {
	public static int divide(){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number 1 : ");
			int a = sc.nextInt();
			System.out.println("Enter number 2 : ");
			int b = sc.nextInt();
			int c = a/b;
			return c;
		}
		catch(Exception ex){
			System.out.println("Error = "+ex);
		}
		
		/* If the Exception doesn't occurs then the below line will not get executed it will only get executed when Exception occurs...
		System.out.println("This is finally got executed!!!"); */
		
		//So we are surrounding it in a finally block whether Exception occurs or not finally block get executed
		
		finally{
			System.out.println("This is finally got executed!!!");
		}
		return 0;
	}
	public static void main(String[] args) {
		int k = divide();
		System.out.println("Answer : "+k);
	}
}