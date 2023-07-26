package stackLl;

public class Main {

	public static void main(String[] args) {
		Linked l=new Linked();
		
		l.push(10);
		l.push(20);
		l.push(30);
		l.push(40);
		l.display();
		l.pop();
		System.out.println();
		l.peek();

	}

}
