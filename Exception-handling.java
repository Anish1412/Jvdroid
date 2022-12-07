import java.util.*;

public class Main {
	public static void main(String[] args) {
		try{
			int a[] = new int[4];
			 a[0] = 5;
			 a[1] = 7;
			 a[2] = 4;
			 a[3] = 8;
			 
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter array index number : ");
			 int i = sc.nextInt();
			 System.out.println("Enter number you want to divide with : ");
			 int e = sc.nextInt();
			 int ans = a[i]/e;
			 System.out.println("Answer : "+ans);
		}
		catch(ArithmeticException ex){
			System.out.println("\nError = "+ex);
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("\nError = "+ex);
		}
	}
}