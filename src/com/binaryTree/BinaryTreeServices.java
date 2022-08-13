package com.binaryTree;

public class BinaryTreeServices {
	
	Node root;
	
	public void insert(int data) {
		
		Node newNode = new Node(data);
		this.root = insertAll(root, newNode);
		display(this.root);
		System.out.println();
	}

	public Node insertAll(Node root, Node node) {
		
		if (root == null) 
			return node;
		else if(root.compareTo(node) > 0) {

			root.left = insertAll(root.left, node);
		}
		
		else if(root.compareTo(node) < 0) {

			root.right = insertAll(root.right, node);
		}
		

		return root;
	}
	
	public void display(Node root) {
		if(root == null)
			return;
		
		display(root.left);
		System.out.print(" " + root.data);
		display(root.right);
	}
	
	public void size() {
		System.out.println(" The size of the tree is: " + sizeAll(root));
	}
	
	public int sizeAll(Node root) {
		
		if (root == null)
			return 0;
		
		return sizeAll(root.left) + sizeAll(root.right) + 1;
	}
}
