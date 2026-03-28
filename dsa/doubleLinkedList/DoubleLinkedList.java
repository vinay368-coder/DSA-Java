package dsa.doubleLinkedList;

public class DoubleLinkedList {

	Node head;
	
	public void insert(int data,int pos) {
		Node n  = new Node(data);
		if(pos==1) {
			if(head == null) {
				head = n;
				System.out.println("Insertion Successful");
				return ;
			}
			else {
				head.prev = n;
				n.next = head;
				head = n;
			}
		}
		else {
			Node temp = head;
			
			for(int i=1;i<pos-1 && temp!=null; i++)
				temp=temp.next;
			if(temp == null) {
				System.out.println("Invalid position");
				return;
			}
			else if(temp.next == null){
				insertend(data);
				return;
			}
			else {
				Node q = temp.next;
				n.prev = temp;
				n.next = q;
				temp.next = n;
				q.prev = n;
			}
		}
		System.out.println("Insertion Successful");
	}
	
	public void insertend(int data) {
		if(head == null) {
			insert(data,1);
			return;
		}
		else {
			Node temp = head;
			while(temp.next!=null)
				temp = temp.next;
			Node n = new Node(data);
			temp.next = n;
			n.prev = temp;
			System.out.println("Insertion successfull");
		}
	}
	
	public void delete(int pos) {
		if(pos==1) {
			if(head == null) {
				System.out.println("List is empty");
				return;
			}
			else {
				if(head.next == null) {
				    System.out.println(head.data + " is deleted from list");
				    head = null;
				    return;
				}
				else {
				Node temp = head.next;
				temp.prev = null;
				System.out.println(head.data + " is deleted from list");
				head = temp;
				}
			}
		}
		else {
			Node temp = head;
			for(int i=1;i<pos-1 && temp!=null;i++)
				temp = temp.next;
			if(temp == null) {
				System.out.println("Invalid position");
				return;
			}
			else if(temp.next == null) {
				deleteend();
				return;
			}
			else {
				Node p,q;
				p = temp.next;
				q = p.next;
				temp.next = p.next;
				q.prev = temp;
				System.out.println(p.data+" is deleted from list");
				p = null;
				return;
			}
		}
	}
	
	public void deleteend() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		else if(head.next == null) {
			delete(1);
			return;
		}
		else {
			Node temp = head;
			while(temp.next!=null)
				temp = temp.next;
			Node p = temp.prev;
			p.next = null;
			System.out.println(temp.data+" is deleted from list");
			temp = null;
		}
	}
	
	public void display() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		do {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}while(temp!=null);
	}
}
