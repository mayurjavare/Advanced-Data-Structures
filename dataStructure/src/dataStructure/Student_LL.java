package dataStructure;

public class Student_LL {
	Student arr[];
	static StudNode head;

	public Student_LL() {
		arr = new Student[100];
		head = null;
	}

	public void setHead(StudNode head) {
		this.head = head;
	}

	public StudNode getHead() {
		return head;
	}

	public static void insertStudentAtLast(Student stud) {
		StudNode new_node = new StudNode(stud);
		if (head == null) {
			head = new_node;
			return;
		}

		if (head.getNext() == null) {
			if (head.getData().getRno() == stud.getRno()) {
				System.out.println("Student alrady prasent");
				return;
			}
			head.setNext(new_node);
			return;
		}

		StudNode iter = head;
		if (head.getData().getRno() == stud.getRno()) {
			System.out.println("Student alrady prasent");
			return;
		}

		while (iter.getNext() != null) {
			if (iter.getNext().getData().getRno() == stud.getRno()) {
				System.out.println("Student alrady prasent");
				return;
			}
			iter = iter.getNext();
		}

//		if(iter==null)
//			return;
		iter.setNext(new_node);
		return;
	}

	public static void insertStudentAtFirst(Student stud) {
		StudNode new_node = new StudNode(stud);
		if (head == null) {
			head = new_node;
			return;
		}

		new_node.setNext(head);
		head = new_node;
		return;
	}

	public static Student deleteFirstStudent() {
		if (head == null) {
			System.out.println("List is empty");
			return null;
		}
		if (head.getNext() == null) {
			Student data = head.getData();
			StudNode deletable = head;
			head = null;
			deletable.setNext(null);
			return data;
		}
		Student data = head.getData();
		StudNode deletable = head;
		head = (head.getNext());
		deletable.setNext(null);
		return data;

	}

	public static Student deleteLastStudent() {
		if (head == null) {
			System.out.println("List is empty");
			return null;
		}
		if (head.getNext() == null) {
			Student data = head.getData();
			head = null;
			return data;
		}

		StudNode iter = head;

		while (iter.getNext().getNext() != null)
			iter = iter.getNext();

		Student data = iter.getNext().getData();
		StudNode deletable = iter.getNext();
		iter.setNext(null);
		deletable = null;
		return data;

	}

	public static void reverseLL() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (head.getNext() == null) {
			System.out.println("There if only one record in the list");
			return;
		}

		StudNode prev = null;
		StudNode curr = head;
		StudNode next;

		while (curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		head = prev;
		return;
	}

	public static void display() {
		System.out.println("The List:- ");
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		StudNode iter = head;
		while (iter != null) {
			System.out.println(iter.getData());
			iter = iter.getNext();
		}
		return;
	}

	public static void main(String[] args) {

		Student_LL sll = new Student_LL();

		insertStudentAtLast(new Student(10, "Mayur", 55, 99, 44));
		insertStudentAtLast(new Student(10, "Mayur", 55, 99, 44));
		insertStudentAtLast(new Student(10, "Mayur", 55, 99, 44));
		insertStudentAtLast(new Student(10, "Mayur", 55, 99, 44));
//		insertStudentAtFirst(new Student(11, "Mayur", 55, 99, 44));
		insertStudentAtLast(new Student(17, "jay", 55, 99, 44));
		insertStudentAtLast(new Student(17, "jay", 55, 99, 44));
		insertStudentAtLast(new Student(17, "jay", 55, 99, 44));
		insertStudentAtLast(new Student(17, "jay", 55, 99, 44));

		insertStudentAtLast(new Student(11, "Mayur", 55, 99, 44));
		insertStudentAtLast(new Student(11, "Mayur", 55, 99, 44));
		insertStudentAtLast(new Student(11, "Mayur", 55, 99, 44));
		insertStudentAtLast(new Student(11, "Mayur", 55, 99, 44));

		insertStudentAtLast(new Student(15, "Mayur", 55, 99, 44));
		insertStudentAtLast(new Student(15, "Mayur", 55, 99, 44));
		insertStudentAtLast(new Student(13, "Mayur", 55, 99, 44));
		insertStudentAtLast(new Student(13, "Mayur", 55, 99, 44));
		insertStudentAtLast(new Student(13, "Mayur", 55, 99, 44));

		insertStudentAtLast(new Student(10, "Mayur", 55, 99, 44));
		insertStudentAtLast(new Student(11, "Mayur", 55, 99, 44));
		insertStudentAtLast(new Student(17, "jay", 55, 99, 44));

		insertStudentAtLast(new Student(11, "Mayur", 55, 99, 44));
		insertStudentAtLast(new Student(11, "Mayur", 55, 99, 44));

//		display();
//		System.out.println("=========================");
//
//		System.out.println("=========================\n\n");
//		System.err.println("Deleted");
//		System.err.println(deleteFirstStudent());
//		System.err.println(deleteLastStudent());
		System.out.println("=========================\n\n");
		display();

		reverseLL();
		display();
	}
}
