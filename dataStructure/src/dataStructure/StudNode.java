package dataStructure;

public class StudNode {
	private Student data;
	private StudNode next;
	
	public StudNode()
	{
		data=null;
		next = null;
	}
	public StudNode(Student data)
	{
		this.data=data;
		next = null;
	}
	
	public Student getData() {
		return data;
	}
	public void setData(Student data) {
		this.data = data;
	}
	public StudNode getNext() {
		return next;
	}
	public void setNext(StudNode next) {
		this.next = next;
	}
	
	
}
