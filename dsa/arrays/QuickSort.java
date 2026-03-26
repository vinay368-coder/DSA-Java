package dsa.arrays;
import java.util.Scanner;

public class QuickSort {
	
	static void quick_sort(int[] a,int low,int high) {
		if(low<high) {
			int pos = partition(a,low,high);
			quick_sort(a,low,pos-1);
			quick_sort(a,pos+1,high);
		}
	}
	
	static int partition(int[] a,int low,int high) {
		
		int i = low+1;
		int pivot = a[low];
		int j = high;
		int temp;
		
		while(true) {
			
			while(i<=high && pivot>=a[i])
				i++;
			
			while(j>=low && pivot<a[j])
				j--;
			
			if(i>=j)
				break;
			
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
		}
		
		temp = a[low];
		a[low] = a[j];
		a[j] = temp;
		return j;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Enter Number Of elements in array");
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter Elements into array");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		System.out.print("Entered Elements in array");
		System.out.println();
		for(int i:a)
			System.out.print(i+" ");
		long start,end;
		start = System.currentTimeMillis();
		quick_sort(a,0,n-1);
		end = System.currentTimeMillis();
		System.out.println();
		System.out.println("Sorted Elements in array");
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("Time Taken: "+(end-start)+"ms");
		
	}

}
