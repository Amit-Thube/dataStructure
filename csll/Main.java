package cll;

public class Main {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		
		l1.insertAtBeg(60);
		l1.insertAtBeg(50);
		l1.insertAtBeg(40);
		l1.insertAtBeg(30);
		l1.insertAtBeg(20);
		l1.insertAtBeg(10);
		l1.insertAtBeg(80);
		
		l1.display();
		
		l1.insertAtLast(70);
		l1.insertAtPos(55,5);
		l1.display();
//		l1.deleteAtLast();
		l1.deleteAtPos(10);
		System.out.println();
		l1.display();
//		l1.displayRev();

	}

}
