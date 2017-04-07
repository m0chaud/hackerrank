package day24;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}

}

/**
 * @author: chaudharimehul
 * @date:	Apr 6, 2017
 * Sample Input

6
1
2
2
3
3
4
Sample Output

1 2 3 4 
 */
class Solution
{
	public static Node removeDuplicates(Node head) {
		//Write your code here
		if(head == null) {return null;}

		Node currNode = head;

		while(currNode != null){
			Node nextDuplicateNode = currNode.next;
			//System.out.println(currNode.data + " " + nextDuplicateNode.data);
			while(nextDuplicateNode != null){
				if(currNode.data == nextDuplicateNode.data){
					currNode.next = nextDuplicateNode.next;
					nextDuplicateNode = null;
					nextDuplicateNode = currNode.next;
					//System.out.println(currNode.data + " " + nextDuplicateNode.data);
				}
				else{
					nextDuplicateNode = null;
				}
			}
			currNode = currNode.next;
		}

		return head;
	}
	public static  Node insert(Node head,int data)
	{
		Node p=new Node(data);			
		if(head==null)
			head=p;
		else if(head.next==null)
			head.next=p;
		else
		{
			Node start=head;
			while(start.next!=null)
				start=start.next;
			start.next=p;

		}
		return head;
	}
	public static void display(Node head)
	{
		Node start=head;
		while(start!=null)
		{
			System.out.print(start.data+" ");
			start=start.next;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Node head=null;
		int T=sc.nextInt();
		while(T-->0){
			int ele=sc.nextInt();
			head=insert(head,ele);
		}
		head=removeDuplicates(head);
		display(head);
		sc.close();
	}
}