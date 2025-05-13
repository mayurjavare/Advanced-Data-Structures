package dataStructure;

public class LinkedListPract {

	private static IntNode head;

	public LinkedListPract() {
		head = null;
	}

	public LinkedListPract(IntNode head) {
		this.head = head;
	}

	public static int LLadd(LinkedList ll) {
		if (ll.head == null) {
			System.out.println("List is empty");
			return 0;
		}

		int sum = 0;
		IntNode iter = ll.head;

		while (iter != null) {
			sum = (sum * 10) + iter.getData();
			iter = iter.getNext();
		}

		return sum;
	}

	public static LinkedList makeList(int num) {
		LinkedList ll1 = new LinkedList();
		while (num != 0) {
			int data = num % 10;
			ll1.insertFirst(data);
			num = num / 10;
		}

		return ll1;
	}

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		LinkedList ll2 = new LinkedList();
		ll.insertFirst(1);
		ll.insertFirst(8);
		ll.insertFirst(5);
		ll.insertFirst(1);
		ll.insertFirst(9);
		ll.insertFirst(4);

		ll2.insertFirst(5);
		ll2.insertFirst(8);
		ll2.insertFirst(1);
		ll2.insertFirst(0);
		ll2.insertFirst(9);

		System.out.println(LLadd(ll));
		System.out.println(LLadd(ll2));
//		ll.display();
		LinkedList ll1 = makeList(LLadd(ll));
		ll1.display();

		System.out.println("======================================");
		LinkedList l2 = makeList(LLadd(ll2));
		l2.display();

		System.out.println("======================================");
		System.out.println(LLadd(ll) + LLadd(ll2));
		LinkedList newLL = makeList(LLadd(ll) + LLadd(ll2));
		newLL.display();

	}
}
