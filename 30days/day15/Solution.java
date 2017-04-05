package day15;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
		next = null;
	}
}

/**
 * @author: chaudharimehul
 * @date:	Apr 5, 2017
 * Sample Input

The following input is handled for you by the locked code in the editor: 
The first line contains T, the number of test cases. 
The  subsequent lines of test cases each contain an integer to be inserted at the list's tail.

4
2
3
4
1
Sample Output

The locked code in your editor prints the ordered data values for each element in your list as a single line of space-separated integers:

2 3 4 1
 */
class Solution {
	public static  Node insert(Node head,int data) {
		//Complete this method
		Node insertNode = new Node(data);
		Node currentNode = head;
		if(head == null){
			head = insertNode;
		}else{
			while(currentNode.next != null){
				currentNode = currentNode.next;
			}
			currentNode.next = insertNode;
		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while(start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while(N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head,ele);
		}
		display(head);
		sc.close();
	}
}