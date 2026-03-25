package dsa.arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {10,2,3,1,7,5,8,9};
		int temp;
		System.out.println("Before Sorting:");
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting:");
		for(int i:a) {
			System.out.print(i+" ");
		}

	}

}
