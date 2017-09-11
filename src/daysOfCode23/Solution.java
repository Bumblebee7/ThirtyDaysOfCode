package daysOfCode23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	static void levelOrder(Node root) {

		Queue<Node> levelO = new LinkedList<Node>();
		levelO.add(root);

		while (!levelO.isEmpty()) {
			Node current = levelO.remove();
			System.out.print(current.data + " ");

			if (current.left != null)
				levelO.add(current.left);
			if (current.right != null)
				levelO.add(current.right);
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		levelOrder(root);
	}
}
