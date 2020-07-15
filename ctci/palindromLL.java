package ctci;

import linkedList.Node;
import singlyLList.LList;

public class palindromLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LList list = new LList(1); 
		//list.append(1);
		//list.append(3);
		list.append(2);
		//list.append(3);
		list.append(1);
		//list.append(1);

	
	Node current = list.head;


	System.out.println(isPalindrome(current));
	System.out.println("after removal");
	while(current.next != null) {
		System.out.print(current.data+" ");
		current = current.next;
	}
	System.out.print(current.data+" ");
	System.out.println();


	}
	
	public static boolean isPalindrome(Node head){
		Node reversedNode = reversed(head);
		return isEqual(head,reversedNode);
		


	}

	public static  Node reversed(Node n){
		Node head = null;
		while(n != null) {
			Node newNode = new Node(n.data);
			newNode.next = head;
			head = newNode;
			n=n.next;
		}
		return head;
	}


	public static  boolean isEqual(Node a, Node b){
		while(a.next != null || b.next != null){
			if(a.data != b.data) return false;
			a= a.next;
			b=b.next;
		}
		return a != null && b != null;

	}

}
