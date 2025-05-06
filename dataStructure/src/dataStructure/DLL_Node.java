package dataStructure;

public class DLL_Node {
	private int data;
	private DLL_Node next, prev;

	public DLL_Node() {
		data = 0;
		next = prev = null;
	}

	public DLL_Node(int data) {
		this.data = data;
		next = prev = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DLL_Node getNext() {
		return next;
	}

	public void setNext(DLL_Node next) {
		this.next = next;
	}

	public DLL_Node getPrev() {
		return prev;
	}

	public void setPrev(DLL_Node prev) {
		this.prev = prev;
	}

}
