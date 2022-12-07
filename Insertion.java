import java.util.*;

class Main {
	void display(int num[],int n){
		System.out.print("Array : ");
		for(int i=0;i<n;i++){
			if(i<n-1){
			System.out.print(num[i]+",");
			}
			else{
				System.out.print(num[i]);
			}
		}
	}
	
void elemInsertion(int num[],int size,int ind,int ele,int capacity){
	if(size>=capacity){
		System.out.println("Space is not available!!");
		System.exit(0);
	}
	for(int i=size-1;i>=ind;i--){
		num[i+1] = num[i];
	}
	num[ind] = ele;
}
}

class A
{
	public static void main(String[] args) {
		int num[] = new int[100];
   	Scanner sc = new Scanner(System.in);
/*	System.out.print("Enter using space out of 100 : ");
		int size = sc.nextInt();
		if(size>num.length){
			System.out.println("Space is not available");
			System.exit(0);
		}
		else{
		System.out.println("\nEnter "+size+" numbers : ");
		for(int i=0;i<size;i++){
			num[i] = sc.nextInt();
		}
		} */
		num[0] = 12;
		num[1] = 34;
		num[2] = 56;
		num[3] = 78;
		num[4] = 90;
		int len = 5;
		Main m = new Main();
		m.display(num,len);
		for(int i=0;i<3;i++){
		System.out.print("\n\nEnter index number : ");
		int index = sc.nextInt();
		System.out.print("Enter element number : ");
		int elem = sc.nextInt();
		m.elemInsertion(num,len,index,elem,num.length);
		len += 1;
		}
		System.out.print("\n");
		m.display(num,len);
	}
}