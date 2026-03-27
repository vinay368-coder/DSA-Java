package dsa.arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter Number of Elements in an array");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter elements into array");
		for(int i=0;i<n;i++)
			a[i]  = sc.nextInt();
		System.out.println("Before Sorting");
		
		for(int i:a)
			System.out.print(i+" ");
		
		System.out.println();
		long start,end;
		start = System.currentTimeMillis();
		merge_sort(a,0,n-1);
		end = System.currentTimeMillis();

		System.out.println("After Sorting");
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("Time Required:"+(end-start));
	}
	static void merge_sort(int[] a,int low,int high) {
		if(low<high) {
			int mid = (low+high)/2;
			merge_sort(a,low,mid);
			merge_sort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	static void merge(int[] a,int low,int mid,int high) {
		int[] b = new int[a.length],c = new int[a.length];
		
		for(int i=low;i<=mid;i++)
			b[i] = a[i];
		
		for(int j = mid+1;j<=high;j++)
			c[j] = a[j];
		
		int i,j,k;
		i=low; // for b
		j=mid+1; // for c
		k=low; //for a
		
		while(i<=mid && j<=high) {
			if(b[i]<=c[j])
				a[k++] = b[i++];
			else
				a[k++] = c[j++];
		}
		
		while(i<=mid)
			a[k++] = b[i++];
			
		while(j<=high)
			a[k++] = c[j++];
	}
}
