package dataStructure;

public class IntQueue {
	private int arr[];
	private int front, rare;
	
	public IntQueue() {
		arr=new int[10];
		front=rare=-1;
	}
	public IntQueue(int s) {
		arr=new int[s];
		front=rare=-1;
	}
	public boolean isFull()
	{
		if(rare==-1)
			return true;
		return false;
	}
	public boolean isEmpty()
	{
		if((front==-1) || (front-rare==1))
			return true;
		return false;
	}
	public void insert(int d)
	{
		if(isFull())
			return;
		if(front == -1)
			front=0;
		
		rare += 1;
		arr[rare]=d;
		return;
	}
	public int remove()
	{
		int d = -999;
		if(isEmpty())
		{
			System.out.println("Underflow");
			return d;
		}
		d=arr[front];
		front += 1;
		return d;
	}
	
	
	public static void main(String[] args) {
		
	}
	
}
