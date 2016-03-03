package dahal.sakshyam.practice;

public class DoublyLinkedList<E> {
	
	class LinkNode<E> {
		LinkNode<E> prev;
		LinkNode<E> next;
		E data;
		
		public LinkNode(E data) { this.data = data; }
	}
	
	private LinkNode<E> head;
	private LinkNode<E> tail;
	private int size;
	
	public DoublyLinkedList() {
		head = new LinkNode(null);
		tail = new LinkNode(null);
		size = 0;
		
		head.next = tail;
		tail.prev = head;
	}
	
	public void add(E val) {
		LinkNode<E> newNode = new LinkNode<E>(val);
		if (size == 0) {
			head.next = newNode;
			tail.prev = newNode;
			newNode.prev = head;
			newNode.next = tail;
		} else {
			head.next.prev = newNode;
			newNode.next = head.next;
			head.next = newNode;
			newNode.prev = head;
		}
		
		size++;
	}
	
	public void see()
	{
		LinkNode<E> pointer = head;
		while(pointer.next != tail)
		{
			System.out.println(pointer.next.data + "\n");
			pointer = pointer.next;
		}
		
	}
	
	public static void main(String[] args)
	{
		DoublyLinkedList<Integer> a = new DoublyLinkedList<Integer>();
		a.add(2);
		a.add(3);
		a.add(4);
		a.see();
	}
	
}
