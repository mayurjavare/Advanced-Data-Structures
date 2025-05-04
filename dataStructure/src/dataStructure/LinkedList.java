package dataStructure;



public class LinkedList {

	private IntNode head;

	

	public LinkedList()

	{

		head = null;

	}

	

	public void insertFirst(int d)

	{

		IntNode new_node = new IntNode(d);

		if(head == null)

		{

			head = new_node;

			return;

		}

		new_node.setNext(head);

		head = new_node;

		return;

	}

	

	public void insertLast(int d)

	{

		IntNode new_node = new IntNode(d);

		if(head == null)

		{

			head = new_node;

			return;

		}

		IntNode iter = head;

		while(iter.getNext()!=null)

			iter = iter.getNext();

		iter.setNext(new_node);

		return;

	}

	

	public int deleteFirst()

	{

		int d = -999;

		if(head == null)

		{

			System.out.println("their is no node in list id available");

			return d;

		}

		IntNode deletable = head;

		head = head.getNext();

		deletable = null;

		return d;

	}

	

	public int deleteLast()

	{

		int d = -999;

		if(head == null)

		{

			System.out.println("their is no node in list id available");

			return d;

		}

		if(head.getNext() == null)

		{

			head = null;

			return d;

		}

		IntNode iter = head;

		while(iter.getNext().getNext() != null)

			iter = iter.getNext();

		d = iter.getNext().getData();

		IntNode deletable = iter.getNext();

		iter.setNext(null);

		deletable = null;

		

		return d;

	}

	

	public void insert_by_position(int d, int pos)

	{

		IntNode new_node = new IntNode(d);

		if(head==null)

		{

			System.out.println("List was empty node inserted as head");

			head = new_node;

			return;

		}

		if(pos==1)

		{

			System.out.println("inserting your node at head possition");

			new_node.setNext(head);

			head = new_node;

			return;

		}

		IntNode iter = head;

		for(int i = 1; (i<pos-1)&&(iter.getNext()!=null);i++)

			iter = iter.getNext();

		

		if(iter.getNext() == null)

		{

			System.out.println("the position is not avilable so inserting your node at last");

		}

		new_node.setNext(iter.getNext());

		iter.setNext(new_node);

		return;

	}

	

	public int delete_by_posiotion(int pos)

	{

		int d = -999;

		if(head == null)

		{

			System.out.println("List is Empty");

			return d;

		}

		if(pos==1)

		{

			System.out.println("pos is so changing head to next node");

			d = head.getData();

			head = head.getNext();

			return d;

		}

		IntNode iter = head;

		for(int i = 1; i<pos-1; i++)

			iter = iter.getNext();

		

	}

	

	public void display()

	{

		if(head==null)

		{

			System.out.println("Empty");

			return;

		}

		IntNode iter = head;

		int cnt = 0;

		while(iter!=null)

		{

			System.out.println(iter.getData()+" -> "+" "+iter.getNext());

			iter = iter.getNext();

			cnt++;

		}

		System.out.println("\nNo. of node in Linked List are: "+cnt);

	}

	

	public static void main(String[] args) {

		

		LinkedList ll = new LinkedList();

		

		System.out.println("\n");

		ll.insertFirst(12);

		ll.insertLast(17);

		//ll.insert_by_position(50, 5);

		ll.insertLast(14);

		ll.insertFirst(20);

		ll.insert_by_position(70, 2);

		ll.insert_by_position(90, 1);

		ll.deleteFirst();

		

		

		System.out.println("\n");

		ll.display();

		

		

	}

}