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
		for(int i=0; i<num.length;i++) {
			if(num[i] == key)
				return (i+1);
		}
		return -1;
	}

}
