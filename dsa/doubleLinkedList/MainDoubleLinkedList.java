package dsa.doubleLinkedList;
import java.util.Scanner;

public class MainDoubleLinkedList {

	public static void main(String[] args) {
		
		DoubleLinkedList list = new DoubleLinkedList();
		Scanner sc = new Scanner(System.in);
		int choice,elem,pos;
		while(true) {
			System.out.println();
			System.out.println("-----------Double Linked List Operations-------------");
			System.out.println("1.Create or Insert an element at Beginning of list");
			System.out.println("2.Insert an element at valid position");
			System.out.println("3.Insert an element at end of list");
			System.out.println("4.Delete an element at Beginning of list");
			System.out.println("5.Delete an element at valid position");
			System.out.println("6.Delete an element at end of list");
			System.out.println("7.Display all elements of list");
			System.out.println("8.Exit");
			System.out.println("Enter your choice");
			System.out.println();
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter an element to insert at beginning");
				elem = sc.nextInt();
				list.insert(elem, 1);
				break;
			case 2:
				System.out.println("Enter an element to insert at valid position");
				elem = sc.nextInt();
				System.out.println("Enter an position to insert");
				pos = sc.nextInt();
				list.insert(elem, pos);
				break;
			case 3:
				System.out.println("Enter an element to insert at end");
				elem = sc.nextInt();
				list.insertend(elem);
				break;
			case 4:
				list.delete(1);
				break;
			case 5:
				System.out.println("Enter a valid position to delete");
				pos = sc.nextInt();
				list.delete(pos);
				break;
			case 6:
				list.deleteend();
				break;
			case 7:
				list.display();
				System.out.println();
				break;
				
			case 8:
				System.out.println("Exiting..............");
				sc.close();
				return;
				
			default:
				System.out.println("Invalid input try again");
			}
			
		}
		
	}

}
