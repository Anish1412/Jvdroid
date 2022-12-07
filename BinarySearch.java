import java.util.*;

class Main {
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
		
	public void binarySearch(int arr[],int len,int elem){
		int ind = -1;
		int low,high;
		low = 0;
		high = len-1;
		while(low<=high){
		double cen = Math.floor((low+high)/2);
		int mid = (int)cen;
			if(elem == arr[mid]){
				 ind = mid;
			}
			if(elem>arr[mid]){
				low = mid+1;
			}
			else{
				high = mid-1;
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
class BinarySearch
{
	public static void main(String[] args) {
		int arr[] = {12,21,32,34,54,56,76,78,90,98};
		int size = arr.length;
		long start1 = System.currentTimeMillis();
		Main b1 = new Main();
		b1.display(arr,size);
		long end1 = System.currentTimeMillis();
		System.out.println("\n\nTime taken to execute array : "+(end1 - start1)+" ms");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter value : ");
		int num = sc.nextInt();
		long start2 = System.currentTimeMillis();
		b1.binarySearch(arr,size,num);
		long end2 = System.currentTimeMillis();
		System.out.println("\nTime taken to find "+num+" in the array : "+(end2 - start2)+" ms");
	}
}