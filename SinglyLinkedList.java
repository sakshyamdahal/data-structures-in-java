package dahal.sakshyam.practice;

public class SinglyLinkedList<E> {
	
	class ListNode<E> {
		private E data;
		private ListNode<E> next;
		
		// constructor
		public ListNode(E data) { this.data = data; }
		
		public void setData(E data) { this.data = data; }
		public E getData() { return data; }
		
		public void setNext(ListNode<E> next ) { this.next = next; }
		public ListNode<E> getNext() { return next; }
	}
	
	private int length;
	private ListNode<E> head;
	
	public SinglyLinkedList() { length = 0; }
	
	public synchronized E getHead() {
		return head.data;
	}
	
	// insert an element at the beginning
	public synchronized void insertAtBegin(E val) {
		ListNode<E> node = new ListNode<E>(val);
		node.setNext(head);
		head = node;
		length++;
	}
	
	// insert an element at the end of the list 
	public synchronized void insertAtEnd(E val) {
		ListNode<E> node = new ListNode<E>(val);
		
		if (head == null) { head = node; }
		else {
			ListNode<E> p, q;
			for(p = head; (q = p.getNext()) != null; p = q);
			p.setNext(node);
		}
		
		length++;
	}
	
	
}
