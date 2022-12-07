import java.util.*;

class Time{
	public void force(int m1,int a1){
		int force = m1*a1;
		System.out.println("\nForce : "+force+" N");
	}
}
class A
{
	public static void main(String[] args) {
		Time t1 = new Time();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mass : ");
		int m = sc.nextInt();
		System.out.print("Enter acceleration : ");
		int a = sc.nextInt();
		long start2 = System.currentTimeMillis();
		t1.force(m,a);
		long end2 = System.currentTimeMillis();
		System.out.println("\nElapsed Time in milli seconds: "+ (end2-start2));
	}
}