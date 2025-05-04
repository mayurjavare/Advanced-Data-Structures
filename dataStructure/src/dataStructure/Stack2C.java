package dataStructure;

import java.util.Scanner;

public class Stack2C {
	private int arr[];
	private int topA,topB;
	
	public Stack2C()
	{
		arr= new int[5000];
		topA=-1;
		topB=arr.length;
	}
	public Stack2C(int s)
	{
		arr= new int[s];
		topA=-1;
		topB=arr.length;
	}
	
	public boolean isFull()
	{
		if(topB-topA==1)
		{
			System.out.println("Stack if full");
			return true;
		}
		return false;
	}
	public boolean isEmptyA()
	{
		if(topA==-1)
			return true;
		return false;
	}
	public boolean isEmptyB()
	{
		if(topB==arr.length)
			return true;
		return false;
	}
	public void pushA(int d)
	{
		if(!isFull())
			topA += 1;
		arr[topA]=d;
		return;
	}
	public void pushb(int d)
	{
		if(!isFull())
			topB += 1;
		arr[topA]=d;
		return;
	}
	public int popA()
	{
		int d = -999;
		if(isEmptyA())
		{
			d=arr[topA];
			topA -= 1;
		}
		return d;
	}
	public int popB()
	{
		int d = -999;
		if(isEmptyA())
		{
			d=arr[topB];
			topB += 1;
		}
		return d;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Stack2C st = new Stack2C(5);
		int ch;
		
		
		
		do {
			System.out.println("=====Menu=====");
			System.out.println("1.Push\n2.Pop\n3.Exit");
			System.out.println("Enter your choice 1 to 4");
			
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter element to push: ");
				int ele = sc.nextInt();
				st.pushA(ele);
				break;
				
			case 2:
				System.out.println(st.popA());
				break;
				
			}
			
		}while(ch!=4);
		for(int i=0;i<st.arr.length;i++)
		{
			System.out.println(st.arr[i]);
		}
	}

}
