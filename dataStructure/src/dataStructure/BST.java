package dataStructure;

public class BST {
	private BTNode root;

	public void setRoot(BTNode root) {
		this.root = root;
	}

	public BTNode getRoot() {
		return root;
	}

	public void insert_nonrec(int d) {
		BTNode new_node = new BTNode(d);
		if (root == null) {
			root = new_node;
			return;
		}
		BTNode iter = root;
		while (true) {
			if (d < iter.getData()) {
				if (iter.getLeft() == null) {
					iter.setLeft(new_node);
					return;
				} else {
					iter = iter.getLeft();
				}
			} else if (d > iter.getData()) {
				if (iter.getRight() == null) {
					iter.setRight(new_node);
					return;
				} else {
					iter = iter.getRight();
				}
			} else {
				System.out.println("you are inserting duplicate data");
				return;
			}
		}
	}

	public void displayBST() {
		
	}
	
	public static void main(String[] args) {
		BST b = new BST();
		
		b.insert_nonrec(55);

	}
}
