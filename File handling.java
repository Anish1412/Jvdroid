import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) {
		//Creating a File
	//	try{
//			File f1 = new File("The_Rock.txt");
//			f1.createNewFile();
//		}
//		catch(Exception ex){
//			System.out.println("Error = "+ex);
//		} 
//		
//		//Writing a File
//		try{
//			FileWriter f2 = new FileWriter("The_Rock.txt");
//			f2.write("Hello Everyone!!! How are you?\nWelcome to my new Home!!");
//			f2.close();
//		}
//		catch(Exception ex){
//			System.out.println("Error = "+ex);
//		}  
//		
//		//Reading a File
//		File f3 = new File("The_Rock.txt");
//		try{
//			Scanner sc = new Scanner(f3);
//			while(sc.hasNextLine()){
//				String line = sc.nextLine();
//				System.out.println(line);
//			}
//		}
//		catch(Exception ex){
//			System.out.println("Error = "+ex);
//		}  
//		
		File f4 = new File("The_Rock.txt");
		if(f4.delete()){
			System.out.println("Your File has been deleted successfully!!");
		}
		else{
			System.out.println("Some occurred while deleting the file!!");
		} 
	}
}