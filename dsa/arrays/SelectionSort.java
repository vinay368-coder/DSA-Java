package dsa.arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {10,2,3,1,7,6,5,8,9};
		int count=0;
		int n= a.length;
		System.out.println("Before Sorting");
		for(int i:a)
			System.out.print(i+" ");
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min])
					min=j;
			}
			count++;
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		System.out.println();
		
		System.out.println("Number of swaps:"+count);
	
		System.out.println("After Sorting");
		for(int i:a)
			System.out.print(i+" ");
		

	}

}
