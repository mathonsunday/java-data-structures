	class BST {
		Node root;

		public Node find(int data) {
			if(root == null) return null;
			else {
				Node parent = findParent(root, data);
				System.out.println(parent);
				if(parent.data < data && parent.right != null) return parent.right;
				else if(parent.data > data && parent.left != null) return parent.left;
				else return null;
			}
		}

		public void insert(int data) {
			Node newNode = new Node(data);
			if(root == null) root = newNode;
			else {
				Node parent = findParent(root, data);
				if(parent.data < data && parent.right != null) parent.right = newNode;
				else if(parent.data > data && parent.left != null) parent.left = newNode;
				else return;
			}
		}

		// public void delete(int data) {
		// 	Node nodeToDelete = search(root, data);
		// 	if(nodeToDelete != null) {
		// 		// parent needs to delete it as a child

		// 	}
		// }

		public Node findParent(Node current, int data) {
			if((current.data < data && current.right == null) || (current.data > data && current.left == null)) {
				System.out.println(current.data);
				return current;
			}
			else if (current.data < data && current.right != null) return findParent(current.right, data);
			else if (current.data > data && current.left != null) return findParent(current.left, data);
			else return null;
		}

		public static void main(String[] args) {
			BST bst = new BST();
			bst.root = new Node(5);
			// System.out.println(bst.root.data);
			// bst.insert(1);
			// bst.insert(2);
			// bst.insert(6);
			// bst.insert(7);

			System.out.println(bst.find(5).data == 5);

			// bst.delete(2);

			// System.out.println(bst.find(2).data == null);
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