package ctci;

import linkedList.Node;
import singlyLList.LList;

public class DeleteNode {

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


		deleteNode(current);
		System.out.println("after removal");
		while(current.next != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.print(current.data+" ");
		System.out.println();

	}
	public static boolean deleteNode(Node n){
		if(n == null || n.next == null) return false;
		Node next = n.next;
		n.data = next.data;
		n.next = next.next;
		return true;
	}

}
