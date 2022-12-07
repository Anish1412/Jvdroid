import java.util.*;

class Throws
{
	public static void divide(int a,int b) throws ArithmeticException{		
			int c = a/b;
			System.out.println("Answer : "+c);
	}
	public static void main(String [] args){
		try{
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter number 1 : ");
			int e = sc.nextInt();
			System.out.println("Enter number 2 : ");
			int f = sc.nextInt();
			divide(e,f);
		}
		catch(Exception ex){
			System.out.println("Error = "+ex);
		}
	}
}