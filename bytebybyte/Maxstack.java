package bytebybyte;

public class Maxstack {
	private class Node{
		private int data;
		private Node next;
		private  Node oldmax;
	}

	public Node stack;
	public Node max;

	public Maxstack(){}

	public void push(int value){
		Node newNode = new Node();
		newNode.data =value;
		if(stack == null){
			stack = newNode;
		}else{
			newNode.next = stack;
			stack = newNode;

			if(max == null || newNode.data > max.data){
				newNode.oldmax=max;
				 max = newNode;
			}
		}
	}

	public int pop(){
		Node n = stack;
		if(stack == null) throw new NullPointerException();
		if(stack.oldmax != null) max = stack.oldmax;
		stack = n.next;
		return n.data;
		
	}

	public int max(){
		if(max == null) throw new NullPointerException();
		return max.data;
	}




}
