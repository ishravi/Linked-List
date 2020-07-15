package ctci;

import linkedList.Node;
import singlyLList.LList;

class Index{
	public int value=0;
}


public class GetValueRecursive {
	
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


		System.out.println(kthToLast(current,1));


	}
	
	
	public static int kthToLast(Node head,int k){
		Index idx = new Index();
		Node res = kthToLast(head,k,idx);
		return res.data;
	}
	 public static Node kthToLast(Node head,int k,Index idx){
		if(head == null){
			return null;
		}
		Node node = kthToLast(head.next,k,idx);
		idx.value= idx.value+1;
		if(idx.value == k) return head;
		return node;	
	}
   
}
