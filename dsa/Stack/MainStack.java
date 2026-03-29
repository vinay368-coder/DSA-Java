package dsa.Stack;
import java.util.Scanner;

public class MainStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Please Enter size of Stack");
		n = sc.nextInt();
		if(n<1 || n>100000) {
			System.out.println("Invalid size");
			return;
		}
		Stack s = new Stack(n);
		int choice,elem;
		while(true) {
			System.out.println("\n\n");
			System.out.println("Select Stack Operations to perform");
			System.out.println("1.Add an element(Push)");
			System.out.println("2.Remove an element(Pop)");
			System.out.println("3.Get the top Most element from the stack(Stacktop or peek)");
			System.out.println("4.Status of stack (Is empty or Number of elements in stack)");
			System.out.println("5.Display elements of stack");
			System.out.println("6.Exit program");
			System.out.println("Please Enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Element to push");
				elem = sc.nextInt();
				s.push(elem);
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.stacktop();
				break;
			case 4:
				s.isEmpty();
				break;
			case 5:
				s.display();
				break;
			case 6:
				System.out.println("Exiting---");
				return ;
			default:
				System.out.println("Invalid choice");
			}
		}
	}

}
