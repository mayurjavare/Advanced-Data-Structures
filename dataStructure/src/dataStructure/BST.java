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

	public void search_rec(int d) {
		System.out.println(search(root, d));
	}

	private boolean search(BTNode r, int d) {

		if (r == null)
			return false;

		if (d < r.getData())
			return search(r.getLeft(), d);

		else if (d > r.getData())
			return search(r.getRight(), d);

		else
			return true;
	}

	public void delete(int d) {
		del_rec(root, d);
	}

	public BTNode del_rec(BTNode r, int d) {

		BTNode succ;
		if (r == null) {
			System.out.println("Empty");
			return null;
		}
		if (d < r.getData())
			r.setLeft(del_rec(r.getLeft(), d));

		else if (d > r.getData())
			r.setRight(del_rec(r.getRight(), d));

		else {
			if ((r.getLeft() != null) && (r.getRight() != null)) {
				succ = r.getRight();
				while (succ.getLeft() != null)
					succ = succ.getLeft();

				r.setData(succ.getData());
				r.setRight(del_rec(r.getRight(), succ.getData()));
			} else {
				if (r.getLeft() != null)
					r = r.getLeft();

				else if (r.getRight() != null)
					r = r.getRight();

				else
					r = null;
			}
		}

		return r;
	}

	public void display_preOrder() {
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

	public int finfMin() {
		if (root == null) {
			System.out.println("empty");
			return 0;
		}
		if ((root.getLeft() == null) && (root.getRight() == null)) {
			System.out.println("only one node is there: ");
			return root.getData();
		}
//		BTNode min = root;
		while (root.getLeft() != null)
			root = root.getLeft();

		return root.getData();
	}

	public int maxNode() {
		return findMxa(root);
	}
	private int findMxa(BTNode root) {
		if (root == null)
			return 0;
		else {
			if (root.getRight() == null)

				return root.getData();
			else
				return findMxa(root.getRight());
		}

	}

	public static void main(String[] args) {
		BST b = new BST();

//		b.insert_nonrec(55);
//		b.insert_nonrec(22);
//		b.insert_nonrec(66);
//		b.insert_nonrec(98);
//		b.insert_nonrec(24);
//		b.insert_rec(54);
//		b.insert_rec(21);
//		b.insert_rec(66);
//		b.insert_rec(2);
//		b.insert_rec(55);
//		b.insert_rec(23);
//		b.insert_rec(1);

		b.insert_rec(2);
		b.insert_rec(4);
		b.insert_rec(3);
		b.insert_rec(9);
		b.insert_rec(6);
		b.insert_rec(5);
		b.insert_rec(1);
		b.insert_rec(8);
		b.insert_rec(7);

		b.display_preOrder();
		System.out.println();
		b.search_rec(21);
		b.display_preOrder();
		System.out.println();
		b.delete(1);
		b.display_preOrder();
		System.out.println("\n===============================================");
		System.out.println(b.finfMin());
		System.out.println("\n===============================================");
		System.out.println(b.maxNode());
	}
}
