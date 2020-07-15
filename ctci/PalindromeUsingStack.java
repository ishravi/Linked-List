package ctci;

import java.util.Stack;

import linkedList.Node;
import singlyLList.LList;

public class PalindromeUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LList list = new LList(1); 
		list.append(1);
		list.append(3);
		list.append(2);
		list.append(3);
		list.append(1);
		list.append(1);

	
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

		Node slowPointer = head;
		Node fastPointer = head;
		Stack<Integer> stack = new Stack();
		while(fastPointer != null && fastPointer.next != null){
			stack.push(slowPointer.data);
			slowPointer = slowPointer.next;
			
			fastPointer = fastPointer.next.next;
		}
		if(fastPointer != null) slowPointer = slowPointer.next;
		
		while(slowPointer != null){
			int val = Integer.valueOf(stack.pop());
			if(val != slowPointer.data) return false;
			slowPointer = slowPointer.next;
			
		}
		return true;

	}



}
