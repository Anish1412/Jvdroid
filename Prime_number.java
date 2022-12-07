import java.util.*;

public class Prime_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		String ans = "";
		for(int i=2;i<101;i++){
			if(i==num){
				continue;
				}
			if(num%i==0){
				ans = "It is not a prime number!!";
				break;
				}
				else{
					ans = "It is a prime number!!";
				}
		}
		System.out.println(ans);
		
//int a =0;
//for(int i=1;i<11;i++){
//	a=i;
//	
//	}	
//	System.out.println(a);
	}
}