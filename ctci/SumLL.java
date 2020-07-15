package ctci;

import linkedList.Node;
import singlyLList.LList;

public class SumLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LList list = new LList(7); 
		list.append(1);
		list.append(6);

	
		Node first = list.head;
		Node firstT = list.head;
		System.out.println("first ");
		while(firstT.next != null) {
			System.out.print(firstT.data+" ");
			firstT = firstT.next;
		}
		System.out.print(firstT.data+" ");
		
		System.out.println();
		
		LList sec = new LList(5); 
		sec.append(9);
		sec.append(2);
		Node second = sec.head;
		Node secondT = sec.head;
		
		System.out.println("sec ");
		while(secondT.next != null) {
			System.out.print(secondT.data+" ");
			secondT = secondT.next;
		}
		System.out.print(secondT.data+" ");
		System.out.println();
		
		System.out.println("after sum");
		
		
		Node res =addList(first,second,0);
		
		while(res.next != null) {
			System.out.print(res.data+" ");
			res= res.next;
		}
		System.out.print(res.data+" ");

	}
	public static Node addList(Node first,Node second,int carry){
		if(first == null && second == null && carry == 0) return null;
		Node result = new Node();
		int val = carry;
		if(first != null) val += first.data;
		if(second != null) val+=second.data;
		result.data = val % 10;
		if(first != null || second != null){
			first = first == null ? null : first.next;
			second = second == null ? null : second.next;
			val = val >= 10 ? 1 : 0;
			Node more = addList(first,second,val);
			result.next = more;
		}
		return result;
	}
	

}
