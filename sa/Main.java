package stack;

public class Main {

	public static void main(String[] args) {
		Array a=new Array();
		
		a.push(10);
		a.push(20);
		
//		a.display();
		
		a.push(30);
		a.push(40);
		a.display();
		a.pop();
		a.display();
	}

}
