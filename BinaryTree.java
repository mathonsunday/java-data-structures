class BinaryTree {
	Node root;

	public inOrderTraveral() {
// Traverse the left subtree.
// Visit the root.
// Traverse the right subtree.
	}

	public postOrderTraveral() {
// Traverse the left subtree.
// Traverse the right subtree.
// Visit the root.
	}

	public preOrderTraveral() {
// Visit the root.
// Traverse the left subtree.
// Traverse the right subtree
	}

	public static void main(String[] args) {
		BinaryTree btree = new BinaryTree();

	}

	private static class Node {
		int data;
		Node left;
		Node right; 

		private Node(int data) {
			this.data = data;
		}
	}
}