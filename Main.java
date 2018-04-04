package circular;

public class Main {
	public static void main (String[] args) {
		CLinked<Integer> list = new CLinked<Integer> ();
		ListNode<Integer> tmp = null;
		
		for (int i=0; i<=10; i++) {
			list.addBack(i*5);
		} // test adder
		System.out.println("Before Removal: " + list.toString() + "\n");
		
		for(int i=0; i<=5; i++) {
			list.remove(tmp);
		}
		
		
		System.out.println("The amount of items in the list are: " + list.getSize());
		System.out.println("After Removal: " + list.toString());
		
	}
}
