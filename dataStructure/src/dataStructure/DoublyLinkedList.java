package dataStructure;

public class DoublyLinkedList {
	private DLL_Node head;

	public DoublyLinkedList() {
		head = null;
	}

	public void insertFirst_DLL(int d) {
		DLL_Node new_node = new DLL_Node(d);
		if (head == null) {
			System.out.println("list is empty so inserting your node as head");
			head = new_node;
			return;
		}
		new_node.setNext(head);
		head.setPrev(new_node);
		head = new_node;
		return;
	}

	public void insertLast_DLL(int d) {
		DLL_Node new_node = new DLL_Node(d);
		if (head == null) {
			System.out.println("list is empty so inserting your node as head");
			head = new_node;
			return;
		}
		DLL_Node iter = head;
		while (iter.getNext() != null)
			iter = iter.getNext();
		new_node.setPrev(iter);
		iter.setNext(new_node);
		return;
	}

	public int deleteFirst_DLL() {
		int d = -999;
		if (head == null) {
			System.out.println("List is Empty");
			return d;
		}
		if (head.getPrev() == null && head.getNext() == null) {
			d = head.getData();
			head = null;
			System.out.println("Only one node was their and now list is empty");
			return d;
		}
		d = head.getData();
		DLL_Node deletable = head;
		head = head.getNext();
		head.setPrev(null);
		deletable.setNext(null);
		deletable = null;
		return d;

	}

	public int deleteLast_DLL() {
		int d = -999;
		if (head == null) {
			System.out.println("List is Empty");
			return d;
		}
		if (head.getPrev() == null && head.getNext() == null) {
			d = head.getData();
			head = null;
			System.out.println("Only one node was their and now list is empty");
			return d;
		}
		DLL_Node iter = head;
		while (iter.getNext() != null)
			iter = iter.getNext();

		DLL_Node deletable = iter;
		d = iter.getData();
		iter.getPrev().setNext(null);
		deletable.setPrev(null);
		return d;
	}

	public void display_DLL() {
		if (head == null) {
			System.out.println("Empty");
			return;
		}
		DLL_Node iter = head;
		while (iter != null) {
			System.out.print(iter.getData() + " -> ");
			iter = iter.getNext();
		}
		return;
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertFirst_DLL(66);
		dll.insertFirst_DLL(44);
//		dll.display_DLL();
		System.out.println("\n");
		dll.insertFirst_DLL(88);
		dll.insertLast_DLL(77);
		dll.display_DLL();
		System.out.println();
//		dll.deleteLast_DLL();
//		dll.deleteLast_DLL();
//		dll.deleteLast_DLL();
//		dll.deleteLast_DLL();
		System.out.println(dll.deleteLast_DLL());
//		System.out.println(dll.deleteFirst_DLL());
//		System.out.println(dll.deleteFirst_DLL());
//		System.out.println(dll.deleteFirst_DLL());
		System.out.println(dll.deleteFirst_DLL());
		dll.display_DLL();
	}
}