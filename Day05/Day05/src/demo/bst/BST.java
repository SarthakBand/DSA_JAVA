package demo.bst;

public class BST {

	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			left = right = null;
		}
	}

	private Node root;

	public BST() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {

		// Create a newnode with a given value
		Node newnode = new Node(value);

		// If BST is empty, add newnode into root itself
		if (root == null) {
			root = newnode;
		}
		// If BST is not empty
		else {
			// Create trav and start at root node
			Node trav = root;

			while (true) {

				// If value is less than current node
				if (trav.data > value) {

					// If left of current node is empty
					if (trav.left == null) {
						// Add newnode into left of current node
						trav.left = newnode;
						break;
					}
					// If left in not empty
					else {
						// Go on left of current node
						trav = trav.left;
					}
				}
				// If value is greater than current node
				else {

					// If right of current node is empty
					if (trav.right == null) {
						trav.right = newnode;
						break;
					}
					// If right of current node is not empty
					else {
						trav = trav.right;
					}
				}
			}
		}

	}

	// Three Ways to Print Trees

	private void preOrder(Node trav) { // Original Method

		if (trav == null) {
			return;
		}
		System.out.print(" " + trav.data);
		preOrder(trav.left);
		preOrder(trav.right);

	}

	public void preOrder() { // Wrapper Method
		System.out.print(" PreOrder : ");
		preOrder(root);
		System.out.println();
	}
	
	private void inOrder(Node trav) {

		if (trav == null) {
			return;
		}
		inOrder(trav.left);
		System.out.print(" " + trav.data);
		inOrder(trav.right);
		
	}
	
	public void inOrder() { // Wrapper Method
		System.out.print(" inOrder : ");
		inOrder(root);
		System.out.println();
	}
	
	private void postOrder(Node trav) {

		if (trav == null) {
			return;
		}
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(" " + trav.data);
		
	}
	
	public void postOrder() { // Wrapper Method
		System.out.print(" postOrder : ");
		postOrder(root);
		System.out.println();
	}
	
	 // Search Node in Tree
	public String searchNode(int key) {
		
		Node trav = root;
		while(y)
	}
	
}
