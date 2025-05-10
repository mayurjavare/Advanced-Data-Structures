package dataStructure;

class record_info {
	record_type status;
	Student ref;
}

enum record_type {
	EMPTY, OCCUPIED, DELETED
}
//main hash
public class MyHash {
	private record_info table[];

	public MyHash() {
		table = new record_info[100];
		for (int i = 0; i < 100; i++)
			table[i].status = record_type.EMPTY;
	}

	public MyHash(int s) {
		table = new record_info[s];
		for (int i = 0; i < table.length; i++)
			table[i].status = record_type.EMPTY;
	}

	public int hash(int rno) {
		return rno % 100;
	}

	public void insert(Student s) {
		int key;
		key = hash(s.getRno());

		if (table[key].ref.getRno() == s.getRno()) {
			System.out.println("Student alrady present");
			return;
		}

		if ((table[key].status == record_type.EMPTY) || (table[key].status == record_type.DELETED)) {
			table[key].ref = s;
			table[key].status = record_type.OCCUPIED;
			return;
		}

		for (int i = key + 1; i < table.length; i++) {
			if ((table[i].status == record_type.EMPTY) || (table[i].status == record_type.DELETED)) {
				table[i].ref = s;
				table[i].status = record_type.OCCUPIED;
				return;
			}
		}
	}
	
	public void display() {
		for(int i=0;i<table.length-1;i++) {
			System.out.print(table[i]+"  ");
		}
	}

	public static void main(String[] args) {
		MyHash mh = new MyHash(50);
		Student stud = new Student(111, "Mayur", 55, 66, 44);
		mh.insert(stud);
//		mh.display();
	}

}
