package circular;

public class ListNode<T> {
	ListNode<T> next;
	public T data;

	
	public ListNode(T d, ListNode<T>n) {
		data = d;
		next = n;
	}

	public void setNext(ListNode<T> n) {
		next = n;
	}
	
	public ListNode<T> getNext() {
		return next;
	}
	
	public void setData(T d) {
		data = d;
	}
	
	public T getData() {
		return data;
	}

}
