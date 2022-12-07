import java.util.*;

public class AgeException extends Exception{
	public String toString(){
		return super.toString();
	}
	public String getMessage(){
		return super.getMessage();
	}
}
class Main {
	public static void age() throws AgeException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		if(age<18 || age>65){
			throw new AgeException();
		}
		else{
			System.out.println("You are allowed in the Party!!");
		}
	}
	public static void main(String[] args) {
		try{
			age();
		}
		catch(Exception ex){
			System.out.println("Error = "+ex);
		}
	}
}