import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();  //You have create new object everytime if you are trying to join arrays
		l1.add(5);
		l1.add(8);
		l1.add(3);
		l1.add(7);
		l1.add(9);
		l1.add(3,501); //If we provide index number before the number which we want to add then it will insert that number in between that array of the list of that particular array only
		
		l2.add(201);
		l2.add(301);
		l2.add(401);
		l2.add(9);
		
		
		l1.addAll(0,l2);  //Joins the two arrays
	
	//	l1.set(2,1); //Replaces the value
	
	 //    l1.remove(3);  //Removes a particular element
		
	//	System.out.println(l1.contains(5));  //Checks if the entered element is present or not
		
	//	System.out.println(l1.indexOf(7));  //Checks the array index number of entered number
	
//	System.out.println(l1.lastIndexOf(9));  //Checks the last array index number of entered number
	
	// System.out.println(l1.size());  //Prints the length of the array
	
//	System.out.println(l1.get(2));  //Prints the number of that particular index
		
//		l1.clear();   //Removes all elements

// System.out.println(l1.isEmpty()); //Checks the array is empty or not
		
		//for(int i=0;i<l1.size();i++){
//			if(i<l1.size()-1){
//			System.out.print(l1.get(i)+",");  
//			}
//			else{
//				System.out.print(l1.get(i));
//			}
//		}

System.out.println(l1);
	}
}