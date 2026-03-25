package dsa.arrays;

public class BinarySearch {
	static int steps=0;
	public static void main(String[] args) {
		int[] num = {10,20,30,40,5,3,33,54,23};
		int key = 3;
		BubbleSort(num);
		int pos = BinarySearch(num,key,0,num.length-1);
		System.out.println("Number of steps for Searching elem in Binary search:"+steps);
		if(pos!=-1) {
			System.out.println(key+" Found at position "+pos);
		}
		else {
			System.out.println("Element Not found");
		}
	}
	
	static void BubbleSort(int [] num) {
		int i,j,temp;
		for(i=0;i<num.length-1;i++) {
			for(j=0;j<num.length-i-1;j++) {
				if(num[j]>num[j+1]) {
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
	}
	
	static int BinarySearch(int[] a,int key,int low,int high) {
		steps++;
		if(low>high)
			return -1;
		int mid=(low+high)/2;
		
		if(a[mid]==key) 
			return mid;
		
		else if (a[mid]>key)
			return BinarySearch(a,key,low,mid-1);
		
		else if (a[mid]<key)
			return BinarySearch(a,key,mid+1,high);
		else
			return -1;
		
	}

}
