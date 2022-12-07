import java.util.*;

class Main {
	void display(int num[],int n){
		System.out.print("\nArray : ");
		for(int i=0;i<n;i++){
			if(i<n-1){
			System.out.print(num[i]+",");
			}
			else{
				System.out.print(num[i]);
			}
		}
	}
}

class Traversal
{
	public static void main(String[] args) {
		int num[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter using space out of 100 : ");
		int size = sc.nextInt();
		if(size>num.length){
			System.out.println("\nSpace is not available!!");
			System.exit(0);
		}
		else{
		System.out.println("\nEnter "+size+" numbers : ");
		for(int i=0;i<size;i++){
			num[i] = sc.nextInt();
		}
		}
		Main m = new Main();
		m.display(num,size);		
	}
}