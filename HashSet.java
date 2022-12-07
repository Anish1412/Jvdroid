import java.util.*;

public class Main {
	public static void main(String[] args) {
		HashSet<Integer> l1 = new HashSet<>();
		HashSet<Integer> l2 = new HashSet<>();  //You have create new object everytime if you are trying to join arrays
		
		
		//In ArrayDeque you cannot give index number before the number which you want to insert it does not it's own
		l1.add(5);
		l1.add(8);
		l1.add(3);
		l1.add(7);
		l1.add(9);
		l1.add(501); 
		
		l2.add(201);
		l2.add(301);
		l2.add(401);
		l2.add(9);
		
		l1.addAll(l2);  //Joins the two arrays
		
		
		

//	System.out.println(l1.isEmpty()); //Checks the array is empty or not
	
		
	//	System.out.println(l1.contains(5));  //Checks if the entered element is present or not

	
//	System.out.println(l1.size());  //Prints the length of the array	

		
	//	l1.clear();   //Removes all elements
		
System.out.println(l1);
	}
}