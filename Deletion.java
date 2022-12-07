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
	
void elemDeletion(int num[],int size,int ind){
	for(int i=ind+1;i<size;i++){
		num[i-1] = num[i];
	}
}
}

class A
{
	public static void main(String[] args) {
		int num[] = new int[100];
   	Scanner sc = new Scanner(System.in);
		num[0] = 12;
		num[1] = 34;
		num[2] = 56;
		num[3] = 78;
		num[4] = 90;
		int len = 5;
		Main m = new Main();
		m.display(num,len);
		System.out.print("\nEnter index number : ");
		int index = sc.nextInt();
		m.elemDeletion(num,len,index);
		len -= 1;
		System.out.print("\n");
		m.display(num,len);
	}
}