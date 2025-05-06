package dataStructure;

public class CircularLL {
	IntNode last;

	public CircularLL() {
		last = null;
	}

	public void setLast(IntNode last) {
		this.last = last;
	}

	public IntNode getLast() {
		return last;
	}

	public void insertFirstD(int d) {
		IntNode new_node = new IntNode(d);
		if (last == null) {
			last = new_node;
			last.setNext(new_node);
			return;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		return;
	}

	public void insertLastD(int d) {
		IntNode new_node = new IntNode(d);
		if (last == null) {
			last = new_node;
			last.setNext(new_node);
			return;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		last = new_node;
		return;
	}

	public void insert_by_pos(int d, int pos) {
		IntNode new_node = new IntNode(d);
		if (last == null) {
			last = new_node;
			last.setNext(last);
			return;
		}
		if (pos == 1) {
			new_node.setNext(last.getNext());
			last.setNext(new_node);
			return;
		}
		IntNode iter = last.getNext();
		for (int i = 1; (i < pos - 1) && (iter.getNext() != last.getNext()); i++) {
			iter = iter.getNext();
		}

		if (iter.getNext() == last.getNext()) {
			System.out.println("am in insert_by_pos");
//			insertLastD(new_node.getData());
			new_node.setNext(iter.getNext());
			iter.setNext(new_node);
			last = new_node;
			return;
		}
		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;
	}

	public int deleteFirstD() {
		int d = -999;
		if (last == null) {
			System.out.println("list is Empty");
			return d;
		}
		if (last.getNext() == last) {
			System.out.println("barobr");
			d = last.getData();
			last.setNext(null);
			last = null;
			return d;
		}
		d = last.getNext().getData();
		IntNode deletable = last.getNext();
		last.setNext(last.getNext().getNext());
		deletable.setNext(null);
		deletable = null;
		return d;
	}

	public int deleteLastD() {
		int d = -999;
		if (last == null) {
			System.out.println("list is Empty");
			return d;
		}
		if (last.getNext() == last) {
			System.out.println("barobr");
			d = last.getData();
			last.setNext(null);
			last = null;
			return d;
		}
		IntNode iter = last.getNext();
//		do {
//			iter = iter.getNext();
//			if(iter.getNext()==last)
//				break;
//		}while(true);

		while (iter.getNext() != last)
			iter = iter.getNext();

		d = iter.getNext().getData();
		iter.setNext(last.getNext());
		last.setNext(null);
		last = iter;
		return d;
	}

	public int delete_by_pos(int pos) {
		int d = -999;
		if (last == null) {
			System.out.println("list is Empty");
			return d;
		}
		if (pos == 1) {
			System.out.println("barobr");
			if (last.getNext() == last) {
				d = last.getData();
				last.setNext(null);
				last = null;
				return d;
			}
			d = last.getData();
			IntNode deletable = last.getNext();
			last.setNext(deletable.getNext());
			deletable.setNext(null);
			deletable = null;
			return d;
		}
		IntNode iter = last.getNext();
		for (int i = 1; (i < pos - 1) && (iter.getNext() != last.getNext()); i++)
			iter = iter.getNext();
		if (iter.getNext() == last.getNext()) {
			System.out.println("wrong postion inserted");
			return d;
		}
		if (iter.getNext() == last) {
			d = iter.getNext().getData();
			iter.setNext(last.getNext());
			last.setNext(null);
			last = iter;
			return d;
		}
		d = iter.getNext().getData();
		IntNode deletable = iter.getNext();
		iter.setNext(deletable.getNext());
		deletable.setNext(null);
		deletable = null;
		return d;
	}

	public void display() {
		if (last == null) {
			System.out.println("Empty");
			return;
		}
		IntNode iter = last.getNext();
		do {
			System.out.println(iter.getData() + "  ");
			iter = iter.getNext();
		} while (iter != last.getNext());
	}

	public static void main(String[] args) {
		CircularLL ll1 = new CircularLL();
//		ll1.insertFirstD(10);
//		ll1.insertFirstD(20);
//		ll1.insertFirstD(50);
//		ll1.insertFirstD(66);
//
//		// ll1.display();
//		System.out.println("\n");
//
		ll1.insertLastD(33);
		ll1.insertLastD(44);

		ll1.display();
		System.out.println("\n");
		// ll1.deleteFirstD();
		// ll1.deleteLastD();

		// ll1.delete_by_pos(1);
		ll1.insert_by_pos(55, 3);
		ll1.display();
	}

}