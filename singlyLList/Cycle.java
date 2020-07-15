package singlyLList;

import linkedList.Node;

public class Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LList list = new LList(10);
		list.append(1);
		list.append(3);
		list.append(2);
		
		Node current = list.head;
		
		while(current.next != null) {
			current = current.next;
		}
		current.next = current;
		System.out.println(hasCycle(list));

	}
	public static boolean hasCycle(LList list) {
		Node fast = list.head;
		while(fast != null  && fast.next != null) {
			fast = fast.next.next;
			list.head = list.head.next;
			if(fast == list.head) return true;
			
		}
		
		return false;
	}

}
