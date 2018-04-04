package circular;

public class CLinked<T> {
	private ListNode<T> head, tail;
	private int size;
	
	public CLinked () {
		head = new ListNode<T> (null,null);
		tail = new ListNode<T> (null,head);
		head.setNext(tail);
		size = 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void addFront(T d) {
		if(isEmpty()) {
			ListNode<T> n = new ListNode(d,null);
			head = n;
			tail = n;
			n.setNext(head);
			size++;
		}
		else {
			ListNode<T> n = new ListNode(d,null);
			ListNode<T> temp = head;
			n.setNext(temp);
			head = n;
			tail.setNext(head);
			size++;
		}
	}
	
	public void addBack(T d) {
		if(isEmpty()) {
			ListNode<T> n = new ListNode(d,null);
			head = n;
			tail = n;
			n.setNext(head);
			size++;
		}
		else {
			ListNode<T> n = new ListNode<T> (d,null);
			ListNode<T> temp = tail;
			temp.setNext(n);
			tail = n;
			tail.setNext(head);
			size++;
		}
	}
	
	public T remove(ListNode<T> n) {
		// Insert code here 
		ListNode<T> temp = head;
		head = head.getNext();
		tail.setNext(head);
		size--;
		return temp.getData();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		ListNode<T> n = head;
		if(isEmpty()) return "List is empty";
		sb.append("(Head)-> ");
		do {
 			sb.append(n.getData()+" ");
 			head = head.getNext();
 			n = head;
		} while(n!=tail.getNext());
		sb.append("<-(Tail)");
		return sb.toString();
	}
}
