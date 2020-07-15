package bytebybyte;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maxstack maxstack = new Maxstack();
		maxstack.push(1);
		maxstack.push(4);
		maxstack.push(3);
		System.out.println("before pop "+maxstack.max());
		maxstack.pop();
		System.out.println("after pop "+maxstack.max());
	}

}
