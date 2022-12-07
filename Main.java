import java.util.*;

public class MyException extends Exception{
	//public String toString(){
//		return "Age should be greater than 18 and less than 65";
//	}
	public String getMessage(){
		return "Age should be greater than 18 and less than 65";
	}
}

//The class in which you are using user-defined exception should not be public

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
			if(age<18 || age>65){
				
				//try-catch block should always be inside if block
				
			try{
			throw new MyException();
		}
		catch(Exception ex){
			//System.out.println(ex.toString());
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		}
		else{
			System.out.println("You are allowed in the Party!!!");
		}		
	}
}