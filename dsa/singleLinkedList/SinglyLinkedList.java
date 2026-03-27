package dsa.singleLinkedList;

public class SinglyLinkedList {
	
	private Node head;
	
	public void insertBegin(int data) {
	
		Node n  = new Node(data);
		if(head == null) {
			head = n;
		}
		else {
			n.next = head;
			head = n;
		}
		System.out.println("Insertion Seccessful");
	}
	
	public void insert(int data) {
		
		Node n = new Node(data);
		
		if(head == null)
			head = n;
		
		else {
			Node temp = head;
			
			while(temp.next != null)
				temp = temp.next;
			
			temp.next = n;
			System.out.println("Insertion Seccessful");
		}
	}
	
	public void insertAtPos(int data,int pos) {
		
		if(pos==1) {
			insertBegin(data);
			return;
		}
		
		Node temp = head;
		for(int i=1;i<pos-1 && temp!=null;i++)
			temp = temp.next;
		
		if(pos<1 || temp == null) {
			System.out.println("Invalid position");
			return;
		}
		
		Node n = new Node(data);
		
		n.next = temp.next;
		temp.next = n;
		System.out.println("Insertion Seccessful");
	}
	
	public void deleteAtPos(int pos) {
		
		if(pos<1) {
			System.out.println("Invalid position");
			return;
		}
		else if(head == null) {
			System.out.println("List is empty");
			return;
		}
		else if (pos==1) {  //for one elem
			System.out.println(head.data +" is deleted from the list");
			head = head.next;
			return;
		}
		else{
			Node temp = head;
			
			for(int i=1;i<pos-1 && temp!=null ;i++)
				temp = temp.next;
			
			if(temp == null || temp.next == null) {
				System.out.println("Invalid position");
				return;
			}
			else {
				Node deleteNode = temp.next;
				temp.next = deleteNode.next;
				deleteNode.next = null;
				System.out.println(deleteNode.data+" is deleted from the list");
				return;
			}
		}
	}


	public void deleteBegin() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println(head.data+" is deleted from list");
		if(head.next == null) {
			System.out.println("Now the list is empty");
			head = head.next;
			return;
		}
		else {
			Node temp = head.next;
			head = temp;
			return;
		}
	
	}
	
	void deleteData(int key) {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		else {
			
			if(head.data == key) {
				System.out.println(head.data+" is deleted from list");
				head = head.next;
				return;
			}
			Node temp = head;
			Node prev = null;
			while(temp!=null && temp.data!=key) {
				prev = temp;
				temp=temp.next;
			}
			if(temp == null) {
				System.out.println("Element not found");
				return;
			}
			else{
				prev.next=temp.next;
				System.out.println(temp.data+" is deleted from list");
				temp = null;
				return;
			}
		}
	}
	
	void deleteEnd() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		else if(head.next==null) {
			System.out.println(head.data+" is deleted from list");
			System.out.println("List is empty");
			head = null;
			return;
		}
		Node temp = head;
		Node prev = null;
		while(temp.next!=null) {
			prev = temp;
			temp=temp.next;
		}
		prev.next = null;
		System.out.println(temp.data+" is deleted from list");
		temp = null;
	}
	
	void display() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		Node temp = head;
		System.out.println();
		System.out.println("List Elements are");
		do {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}while(temp!=null);
	}
}







