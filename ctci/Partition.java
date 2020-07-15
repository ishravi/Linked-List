package ctci;

import linkedList.Node;
import singlyLList.LList;

public class Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 LList list = new LList(1); 
	list.append(3);
	list.append(2);
	list.append(4);
	list.append(5);
//			list.append(1);
//
//			list.append(1);
//			list.append(3);
//			list.append(2);
		
		Node current = list.head;


		//current = 
		current = partition(current,5);
		
		System.out.println("after partition");
		while(current.next != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.print(current.data+" ");
		System.out.println();

	}
	
//	(1); 
//	(3);
//	(2);
//  (4); 
//  (5);
	public static Node partition(Node n,int val){
		Node head =n;
		Node tail =n;
		
		while(n != null){
			Node next = n.next;
			if(n.data < val){
				n.next = head;
				head=n;
			}else{
				tail.next = n;
				tail=n;
			}

			n= next;

		}
		tail.next=null;
		return head;


	}

}
