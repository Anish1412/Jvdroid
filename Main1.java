import java.util.*;

class LinearSearch {
		public void display(int arr[],int len){
			for(int i=0;i<len;i++){
				if(i<len-1){
					System.out.print(arr[i]+",");
				}
				else{
					System.out.print(arr[i]);
				}
			}
		}
		
		public void linearSearch(int arr[],int len,int elem){
			int ind = 0;
			for(int i=0;i<len;i++){
				if(elem == arr[i]){
					ind = i;
				}
			}
			if(ind != -1){
			System.out.println("\n"+elem+" is present at index "+ind+" in the array!!");
			}
			else{
				System.out.println("\n"+elem+" is not present in the array!!");
			}
		}
}
class Main1
{
	public static void main(String[] args) {
		int arr[] = {12,34,56,78,90,98,76,54,32,10};
		int size = arr.length;
		long start1 = System.currentTimeMillis();
		LinearSearch l1 = new LinearSearch();
		l1.display(arr,size);
		long end1 = System.currentTimeMillis();
		System.out.println("\n\nTime taken to execute array : "+(end1 - start1)+" ms");
		
		Scanner sc = new Scanner(System.in);
		long start2 = System.currentTimeMillis();
		System.out.print("\nEnter number : ");
		int num = sc.nextInt();
		l1.linearSearch(arr,size,num);
		long end2 = System.currentTimeMillis();
		System.out.println("\nTime taken to find "+num+" in the array : "+(end2 - start2)+" ms");
	}
}