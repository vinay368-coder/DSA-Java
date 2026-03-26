package dsa.arrays;

public class InsertionSort {
	
	static int[] insertionsorting(int a[],int n) {
		int i,j,temp;
		for(i=1;i<n;i++) {
			j=i-1;
			temp=a[i];
			while(j>=0 && temp<a[j]) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
			
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] a= {23,5,4,19,3,1,44};
		int n = a.length;
		System.out.println("Before Sorting");

		for(int i:a) {
			System.out.print(i+" ");
		}
		a=insertionsorting(a,n);
		System.out.println();
		System.out.println("After Sorting");
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
