package dsa.arrays;

public class LinearSearch{

	public static void main(String[] args) {
		
		int num[] = {10,20,30,40,5,3,33,54,23};
		int key = 3;
		
		int index = search(num,key);
		
		if(index!=-1) {
			System.out.println(key + " Found at position "+index);
		}
		else {
			System.out.println("Element not found");
		}

	}
	
	static int search(int[] num,int key) {
		int steps=0;
		for(int i=0; i<num.length;i++) {
			steps++;
			if(num[i] == key)
				return (i+1);
		}
		System.out.println("Number of Steps:"+steps);
		return -1;
	}

}
