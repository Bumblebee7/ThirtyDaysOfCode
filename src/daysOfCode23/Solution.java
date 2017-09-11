package daysOfCode23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	static void levelOrder(Node root) {

		Queue<Integer> order = new LinkedList<Integer>();

		if (root != null) {
			order.add(root.data);
			if (root.left != null)
				levelOrder(root.left);
			if (root.right != null)
				levelOrder(root.right);
		}
		if (root.left == null && root.right == null)
			System.out.println(order);
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
		levelOrder(root);
	}
}
