package dataStructure;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	private BTNode root;

	public BTNode getRoot() {
		return root;
	}

	public void setRoot(BTNode root) {
		this.root = root;
	}

	public BTNode createNode(int data) {
//		BTNode new_node = new BTNode(data);
//		root = new_node;
//		return new_node;
		return new BTNode(data);
	}

	public void insert_levelwise(int data) {
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
				iter.setRight(iter);
				return;
			} else
				q.add(iter.getRight());

		}
	}

	private void value_preOrder(BTNode root) {
		if (root == null)
			return;

		System.out.print(root.getData() + " ");
		value_preOrder(root.getLeft());
		value_preOrder(root.getRight());
	}

	// Wrapper function
	public void preOrder() {

		value_preOrder(root);
	}

	public void display_levelwise() {
		if (root == null) {
			System.out.println("Root is null");
			return;
		}
		BTNode iter;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(root);

		while (!q.isEmpty()) {
			iter = q.remove();
			System.out.print(iter.getData() + " ");
			if (iter.getLeft() != null)
				q.add(iter.getLeft());
			if (iter.getRight() != null)
				q.add(iter.getRight());
		}

	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		//bt.createNode(50);
		
		bt.insert_levelwise(10);
		bt.insert_levelwise(20);
		bt.insert_levelwise(30);
		bt.insert_levelwise(40);
		bt.insert_levelwise(15);
		bt.display_levelwise();
		
	}
}
