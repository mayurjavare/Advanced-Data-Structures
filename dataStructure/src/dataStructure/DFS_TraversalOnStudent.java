package dataStructure;

public class DFS_TraversalOnStudent {

	Student arr[];
	int adj[][];
	int status[];
	int n;
	
	public DFS_TraversalOnStudent(int d) {
		n=d;
		arr=new Student[n];
		adj=new int[n][n];
		status=new int[n];
		for(int i =0;i<n;i++) {
			status[i]=0;
		}
	}
	
	public void insert_edge(int origin, int destin) {
		
	}
	
	public static void main(String[] args) {
		Student stud;
		DFS_TraversalOnStudent dfs = new DFS_TraversalOnStudent(10);
		
	}
	
}
