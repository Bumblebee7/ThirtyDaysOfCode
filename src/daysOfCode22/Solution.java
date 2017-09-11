package daysOfCode22;

import java.util.Scanner;

public class Solution {

	public static int getHeight(Node root) {

		if (root != null) {
			return 1 + Math.max(getHeight(root.left), getHeight(root.right));
		} else
			return -1;
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
		int height = getHeight(root);
		System.out.println(height);
	}
}
