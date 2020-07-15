package ctci;

import linkedList.Node;
import singlyLList.LList;

public class CycleDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 LList list = new LList(1); 
			list.append(2);
			list.append(3);
			list.append(4);
			list.append(5);
			list.append(6);
//			list.append(1);
//			list.append(3);
//			list.append(2);
		
		Node current = list.head;
		current.next.next = current.next;
		Node res = starOfCycle(current);
		if(res != null) System.out.println(res.data);
		else System.out.println("no cycle");
		
	}
	
	public static Node starOfCycle(Node head){
		boolean result = false;
		Node slowPointer = head;
		Node fastPointer = head;
		
		while(fastPointer != null && fastPointer.next != null){
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if(slowPointer == fastPointer){
				result = true;
				break;
			}

		}
		
		if(result){
			slowPointer = head;
			while(slowPointer != fastPointer){
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next;
			}
			return slowPointer;
		}
		return null;

	}


}
