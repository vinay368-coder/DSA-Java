package dsa.arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] num = {10,5,25,30,40,3,2};
		int key = 40;
		BubbleSort(num);
		int pos = BinarySearch(num,key,0,num.length-1);
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
