package daysOfCode24;

import java.util.Scanner;

public class Solution {

	public static Node removeDuplicates(Node head) {

		Node current = head;
		// Evaluates true if the head is not empty or according to line 19 the new next
		// node is not null
		while (current != null && current.next != null) {
			// Evaluates true if there is a next node beside the head node or according to
			// line 17 there is a next.next node and a next.next.next node and so on with
			// the same data as the current node
			while (current.next != null && current.data == current.next.data) {
				current.next = current.next.next;
			}
			current = current.next;
		}
		return head;
	}

	public static Node insert(Node head, int data) {

		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node head) {

		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		Node head = null;
		int T = scan.nextInt();
		while (T-- > 0) {
			int ele = scan.nextInt();
			head = insert(head, ele);
		}
		scan.close();
		head = removeDuplicates(head);
		display(head);

	}
}
