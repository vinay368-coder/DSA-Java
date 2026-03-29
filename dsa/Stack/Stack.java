package dsa.Stack;

public class Stack {
	
	int max,top=-1;
	int[] s;
	
	Stack(int max){				//constructor
		this.max = max;
		s = new int[max];
	}
	
	public void push(int elem) {
		if(top == max-1) {
			System.out.println("Stack Overflow(Reached Max limit)");
			return;
		}
		else {
			s[++top] = elem;
			System.out.println(s[top]+" is added to the stack");
		}
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stack Underflow (No elements to pop)");
			return ;
		}
		else {
			int elem = s[top--];
			System.out.println(elem+" is deleted from stack");
		}
	}
	
	public void stacktop() {
		if(top == -1) {
			System.out.println("Stack Underflow (No elements to pop)");
			return ;
		}
		else {
			System.out.println(s[top]+" is top most element in stack");
		}
	}
	
	public void isEmpty() {
		if(top == -1) {
			System.out.println("Stack is empty");
			System.out.println("Stack size:"+max);
			return ;
		}
		else {
			System.out.println("Stack is not empty");
			System.out.println("Stack has "+top+1+" elements out of "+max+"Elements" );
		}
	}
	
	
	public void display() {
		int i =top;
		if(i == -1) {
			System.out.println("Stack is empty");
			
			return ;
		}
		else {
			System.out.println("Stack Elements are");
			while(i>-1)
				System.out.println(s[i--]+"  ");
			System.out.println();
		}
	}
}


