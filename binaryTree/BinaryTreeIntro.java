package binaryTree;

import java.util.Scanner;

public class BinaryTreeIntro {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		Node root = createTree();
		
		System.out.println("\nIn-order traversal:");
		inOrder(root);

		System.out.println("\nPre-order traversal:");
		preOrder(root);

		System.out.println("\nPost-order traversal:");
		postOrder(root);

	}
	
	static Node createTree() {
		Node root = null;
		System.out.println("Enter value for node: ");
		int value = scanner.nextInt();
		
		if (value == -1) return null;
		
		root = new Node(value);
		
		System.out.println("Enter left node for " + value);
		root.leftNode = createTree();
		
		System.out.println("Enter right node for " + value);
		root.rightNode = createTree();

		return root;
	}
	static void inOrder(Node root) {
		// Left-Node-Right
		if(root == null) return;
		
		inOrder(root.leftNode);
		System.out.println(root.data);
		inOrder(root.rightNode);
	}
	static void preOrder(Node root) {
		// Node-Left-Right
		if(root == null) return;
		
		System.out.println(root.data);
		preOrder(root.leftNode);
		preOrder(root.rightNode);
	}
	static void postOrder(Node root) {
		// Left-Right-Node
		if(root == null) return;
		
		postOrder(root.leftNode);
		postOrder(root.rightNode);
		System.out.println(root.data);
	}

}


class Node {
	Node leftNode;
	Node rightNode;
	int data;
	
	Node(int value) {
		data = value;
	}
	
}