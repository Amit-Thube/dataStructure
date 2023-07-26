package sll;

public class Main {

	public static void main(String[] args) {

		LinkedList l1=new LinkedList();
		
		l1.insertAtBeg(10);
		l1.insertAtBeg(20);
		l1.insertAtBeg(30);
		l1.insertAtBeg(40);
		l1.insertAtBeg(50);
		l1.insertAtPos(80, 3);
		l1.insertAtLast(90);
		
		l1.display();
//		l1.delete();
//		l1.deleteAtLast();
		l1.deleteAtPos(1);
//		l1.deleteByVal(80);
		
		System.out.println();
		l1.display();
//		l1.displayRev();
//		l1.search(80);
	
	}

}
