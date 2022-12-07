import java.util.*;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();  //You have create new object everytime if you are trying to join arrays
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
		
		
		
//*************** Works Same****************

       l1.push(7001);  //Adds elements at the starting but after addFirst(); element

		l1.addFirst(1001);  //Adds element at the first position and will at the first position only even if new elements are inserted
		
		l1.addLast(2001);  //Adds element at the last position and will at the last position only even if new elements are inserted
	
//	l1.offer(3001);  //Works same like l1.add(3001); inserts at the end of the array

      //  l1.offerFirst(4001);  //Works same like l1.addFirst(4001) but has more priority than addFirst();
        
       // l1.offerLast(5001);  //Works same like l1.addFirst(5001) but has more priority than addLast();
       
//**********************************************
	
	// System.out.println(l1.isEmpty()); //Checks the array is empty or not
	
	//	l1.set(2,1); //Replaces the value in the array even if new array is joined
	
	
//*************** Works Same****************

     //	l1.pop();  //Removes the First element even if it is addFirst(); element

	 //   l1.remove(3);  //Removes a particular array index number
	  
	  	//	l1.removeFirst();  //Removes first element of the array
		
	//	l1.removeLast();  //Removes Last element of the array
	
   // 	l1.poll();  //Removes the first element of the array
    	
	//	l1.pollFirst();   //Removes the first element of the array
		
	//	l1.pollLast();   //Removes the Last element of the array

//*********************************************		
		
	//	System.out.println(l1.contains(5));  //Checks if the entered element is present or not
		
//		System.out.println(l1.indexOf(7));  //Checks the array index number of entered number
	
//	System.out.println(l1.lastIndexOf(9));  //Checks the last array index number of entered number
	
	// System.out.println(l1.size());  //Prints the length of the array
	
	
	
//*************** Works Same****************

//	System.out.println(l1.get(2));  //Prints the number of that particular index

// System.out.println(l1.getFirst());  //Prints the number which is at the First position

// System.out.println(l1.getLast());   //Prints the number which is at the Last position

 //System.out.println(l1.peek());   //Prints the first element
      
//       System.out.println(l1.peekFirst());  //Prints the First element
       
      // System.out.println(l1.peekLast());  //Prints the Last element
      
//*********************************************
		

		
//		l1.clear();   //Removes all elements
		
//		for(int i=0;i<l1.size();i++){
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