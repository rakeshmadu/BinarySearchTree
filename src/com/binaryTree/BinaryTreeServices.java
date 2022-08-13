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
//			System.out.print(" inserted " + node.data + " in the left");
			root.left = insertAll(root.left, node);
		}
		
		else if(root.compareTo(node) < 0) {
//			System.out.print(" inserted " + node.data + " in the right");
			root.right = insertAll(root.right, node);
		}
		
//		System.out.println(" something else has happened");
		return root;
	}
	
	public void display(Node root) {
		if(root == null)
			return;
		
		display(root.left);
		System.out.print(" " + root.data);
		display(root.right);
	}
}
