package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

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

	public void insert_rec(int d) {
		root = insert(root, d);
	}

	private BTNode insert(BTNode r, int d) {
		if (r == null) {
			return new BTNode(d);
		}

		if (d < r.getData())
			r.setLeft(insert(r.getLeft(), d));

		else if (d > r.getData())
			r.setRight(insert(r.getRight(), d));

		else
			System.out.println("Duplicates are not allowed");

		return r;
	}

	public int search_rec(int d) {
		return search(root, d).getData();
	}

	private BTNode search(BTNode r, int d) {

		if (r == null)
			return null;

		if (d < r.getData())
			return search(r.getLeft(), d);

		else if (d > r.getData())
			return search(r.getRight(), d);

		else
			return r;
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
		BST b = new BST();

//		b.insert_nonrec(55);
//		b.insert_nonrec(22);
//		b.insert_nonrec(66);
//		b.insert_nonrec(98);
//		b.insert_nonrec(24);
		b.insert_rec(54);
		b.insert_rec(21);
		b.insert_rec(66);
		b.insert_rec(2);
		b.insert_rec(55);
		b.insert_rec(23);
		b.insert_rec(1);
		b.display_levelwise();
		System.out.println();
		System.out.println(b.search_rec(27));

	}
}
