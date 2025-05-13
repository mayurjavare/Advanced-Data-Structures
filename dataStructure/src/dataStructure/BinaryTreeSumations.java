package dataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeSumations {

	private static BTNode root;

	public BTNode getRoot() {
		return root;
	}

	public void setRoot(BTNode root) {
		this.root = root;
	}

	public BTNode createNode(int data) {
		return new BTNode(data);
	}

	public void insertByLevel(int data) {
		BTNode new_node = new BTNode(data);
		if (root == null) {
			root = new_node;
			return;
		}

		BTNode iter;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(root);
		while (true) {
			iter = q.remove();
			if (iter.getLeft() == null) {
				iter.setLeft(new_node);
				return;
			} else
				q.add(iter.getLeft());

			if (iter.getRight() == null) {
				iter.setRight(new_node);
				return;
			} else
				q.add(iter.getRight());
		}
	}

	public void displayByLevel() {
		if (root == null) {
			System.out.println("Empty");
			return;
		}

		BTNode iter;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(root);

		while (!q.isEmpty()) {
			iter = q.remove();
			System.out.println(iter.getData() + " -> ");
			if (iter.getLeft() != null)
				q.add(iter.getLeft());

			if (iter.getRight() != null)
				q.add(iter.getRight());
		}
		return;
	}

	public int additionAll() {
		if (root == null) {
			System.out.println("Empty");
			return 0;
		}
		int sum = 0;
		BTNode iter;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(root);

		while (!q.isEmpty()) {
			iter = q.remove();
			sum = sum + iter.getData();
			if (iter.getLeft() != null)
				q.add(iter.getLeft());

			if (iter.getRight() != null)
				q.add(iter.getRight());

		}

		return sum;
	}

	public int additionAllLeaf() {

		if (root == null) {
			System.out.println("Empty");
			return 0;
		}
		int sum = 0;
		BTNode iter;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(root);

		while (!q.isEmpty()) {
			iter = q.remove();

			if ((iter.getLeft() == null) && (iter.getRight() == null))
				sum = sum + iter.getData();

			if (iter.getLeft() != null)
				q.add(iter.getLeft());

			if (iter.getRight() != null)
				q.add(iter.getRight());
		}
		return sum;
	}

	public int additionAllNonleaf() {

		if (root == null) {
			System.out.println("Empty");
			return 0;
		}
		int sum = 0;
		BTNode iter;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(root);

		while (!q.isEmpty()) {
			iter = q.remove();

			if ((iter.getLeft() != null) && (iter.getRight() != null))
				sum = sum + iter.getData();

			if (iter.getLeft() != null)
				q.add(iter.getLeft());

			if (iter.getRight() != null)
				q.add(iter.getRight());
		}
		return sum;
	}
	
	public static int height(BinaryTreeSumations bt) {
		return heightOfBT(root);
	}

	private static int heightOfBT(BTNode root) {

		if (root == null)
			return 0;

		int leftHt = heightOfBT(root.getLeft());
		int rightHt = heightOfBT(root.getRight());
		if (leftHt > rightHt)
			return leftHt + 1;
		else
			return rightHt + 1;
	}

	public static void main(String[] args) {
		BinaryTreeSumations bts = new BinaryTreeSumations();
		bts.insertByLevel(10);
		bts.insertByLevel(20);
		bts.insertByLevel(30);
		bts.insertByLevel(40);
		bts.insertByLevel(50);
		bts.insertByLevel(100);
		bts.insertByLevel(66);
		bts.insertByLevel(88);

//		bts.displayByLevel();
		System.out.println(bts.additionAllLeaf());
		System.out.println(bts.additionAllNonleaf());
		
		System.out.println(height(bts));
	}
}
