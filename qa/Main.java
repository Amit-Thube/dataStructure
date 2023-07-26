package array;

public class Main {

	public static void main(String[] args) {
		Array a=new Array();
		
		a.enqueue(10);
		a.enqueue(20);
		a.enqueue(30);
		a.enqueue(40);
		a.enqueue(50);
		a.dequeue();
		a.enqueue(60);
		a.display();
//		a.dequeue();
//		a.display();

	}

}
