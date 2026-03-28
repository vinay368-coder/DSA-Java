package dsa.CircularLinkedList;

public class CircularLinkedList {
	
	Node tail;
	public void insert(int data, int pos) {
	    Node n = new Node(data);

	    if(pos == 1) {
	        if(tail == null) {
	            tail = n;
	            n.next = n;
	        } else {
	            n.next = tail.next;
	            tail.next = n;
	        }
	        System.out.println("Insertion Successful");
	        return;
	    }

	    Node temp = tail.next;
	    int i;

	    for(i = 1; i < pos-1 && temp != tail; i++) {
	        temp = temp.next;
	    }

	    if(i < pos-1) {
	        System.out.println("Invalid position");
	        return;
	    }

	    n.next = temp.next;
	    temp.next = n;

	    if(temp == tail) {
	        tail = n;
	    }

	    System.out.println("Insertion Successful");
	}
	public void insertend(int data) {
		Node n = new Node(data);
		if(tail == null) {
			n.next = n;
			tail = n;
		}
		else {
			n.next = tail.next;
			tail.next = n;
			tail = n;
		}
		System.out.println("Insertion successful");
	}
	
	public void delete(int pos) {

	    if (tail == null) {
	        System.out.println("List is empty");
	        return;
	    }

	    if (pos == 1) {
	        if (tail.next == tail) {
	            System.out.println(tail.data + " is deleted from list");
	            tail = null;
	            return;
	        }

	        Node head = tail.next;
	        tail.next = head.next;
	        System.out.println(head.data + " is deleted from list");
	        return;
	    }

	    Node temp = tail.next;

	    for (int i = 1; i < pos - 1 && temp != tail; i++) {
	        temp = temp.next;
	    }

	    Node p = temp.next;

	    if (p == tail.next) {
	        System.out.println("Invalid position");
	        return;
	    }

	    if (p == tail) {
	        Node prev = tail.next;
	        while (prev.next != tail) {
	            prev = prev.next;
	        }

	        prev.next = tail.next;
	        System.out.println(tail.data + " is deleted from list");
	        tail = prev;
	        return;
	    }

	    temp.next = p.next;
	    System.out.println(p.data + " is deleted from list");
	}
	
	
	public void deleteend() {
		
		if(tail == null) {
			System.out.println("List is empty");
			return ;
		}
		
		else if(tail.next == tail) {
			System.out.println(tail.data+" is deleted from list");
			tail = null;
			return;
		}
		
		else {
			Node temp = tail.next;
			while(temp.next!=tail)
				temp = temp.next;
			temp.next = tail.next;
			System.out.println(tail.data+" is deleted from list");
			tail = null;
			tail = temp;
		}
	}
	
	
	
	
	public void display() {

	    if (tail == null) {
	        System.out.println("List is empty");
	        return;
	    }

	    Node temp = tail.next; 

	    do {
	        System.out.print(temp.data + "  ");
	        temp = temp.next;
	    } while (temp != tail.next);
	}

}
