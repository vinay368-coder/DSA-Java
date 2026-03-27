package dsa.singleLinkedList;
import java.util.Scanner;

public class MainSingleLinkedList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		int choice,elem,pos;
		
		while(true) {
			
			System.out.println("\n\n--------Singly Linked List Operation-----------\n\n");
			System.out.println("1.Create or Insert at End");
			System.out.println("2.Insert at Beginning");
			System.out.println("3.Insert at a valid Position");
			System.out.println("4.Delete Beginning Element");
			System.out.println("5.Delete Last element");
			System.out.println("6.Delete Element by Position");
			System.out.println("7.Delete Element by value");
			System.out.println("8.Display List Elements");
			System.out.println("9.Exit Program");
			System.out.println("Please enter your choice\n");
			choice = sc.nextInt();
			
			switch(choice) {
				
			case 1:
				System.out.println("Enter element to Insert at end");
				elem = sc.nextInt();
				list.insert(elem);
				break;
			case 2:
				System.out.println("Enter element to Insert at Beginning");
				elem = sc.nextInt();
				list.insertBegin(elem);
				break;
			case 3:
				System.out.println("Enter element to Insert");
				elem = sc.nextInt();
				System.out.println("Enter position to Insert");
				pos = sc.nextInt();
				list.insertAtPos(elem,pos);
				break;
				
			case 4:
				list.deleteBegin();
				break;
			
			case 5:
				list.deleteEnd();
				break;
			
			case 6:
				System.out.println("Enter Position to delete an Element");
				pos = sc.nextInt();
				list.deleteAtPos(pos);
				break;
			
			case 7:
				System.out.println("Enter Element to delete ");
				elem = sc.nextInt();
				list.deleteData(elem);
				break;
			
			case 8:
				list.display();
				break;
				
			case 9:
				System.out.println("Exiting.........");
				sc.close();
				return;
			
			default:
				System.out.println("**Invalid Try Again**");
				
			}
			
		}
		

	}

}
