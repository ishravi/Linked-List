package ctci;

import linkedList.Node;
import singlyLList.LList;
import java.util.*;
public class RemoveDupLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LList list = new LList(1); 
			list.append(1);
			list.append(3);
			list.append(2);
			list.append(4);
			list.append(5);
			list.append(1);
			list.append(3);
			list.append(2);
		
		Node current = list.head;


		removeDups(current);
		System.out.println("after removal");
		while(current.next != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.print(current.data+" ");
		System.out.println();

	}
	
	public static void removeDups(Node head){
		// 1 -> 1 -> 3 -> 2 -> 4 -> 5 -> 1 -> 3 -> 2
//		ArrayList<Integer> uniqList = new ArrayList();
//		Node result = head;
//		while(head.next != null){
//			if(uniqList.contains(head.data)){
//				result.next = head.next;
//			}else{
//				uniqList.add(head.data);
//				result=head;
//			}
//			
//			head = head.next;
//		}
//		if(uniqList.contains(head.data)){
//			result.next = head.next;
//		}else{
//			uniqList.add(head.data);
//			result=head;
//		}

		while(head.next != null){
			Node pointer = head;
			while(pointer.next != null){
				if(pointer.next.data == head.data){
					pointer.next = pointer.next.next;
				}else {
					pointer = pointer.next;
				}
				
			}
			
			head = head.next;
		}


	}
	
	

}
