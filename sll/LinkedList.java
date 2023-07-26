package sll;

import java.util.Stack;

public class LinkedList {
	
	private Node head;
	
	public LinkedList() {

		this.head=null;
	}
	
	public void insertAtBeg(int data)
	{
		Node nn=new Node(data);
		Node temp=head;
		if(head==null)
		{
			head=nn;
		}
		else {
			nn.setNext(temp);
			head=nn;
		}
	}
	
	public boolean insertAtPos(int data,int pos) 
	{
		Node nn=new Node(data);
		if(pos<0 || (head==null&&pos>1))
		{
			return false;
		}
		
		if(pos==0)
		{
			head=nn;
			return true;
		}
		Node prev=head;
		for(int i=1;i<pos-1;i++)
		{
			prev=prev.getNext();
		}
		nn.setNext(prev.getNext());
		prev.setNext(nn);
		return true;
		
	}
	
	public void insertAtLast(int data)
	{
		Node nn=new Node(data);
		if(head==null)
		{
			System.out.println("list is empty inserting at beg!");
			head=nn;
		}
		else
		{
			Node temp=head;
			while(temp.getNext() != null)
			{
				temp=temp.getNext();
			}
			temp.setNext(nn);
		}
	}
	
	public void delete()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			head=head.getNext();
		}
	}
	
	public void deleteAtLast()
	{
		Node temp=head;
		Node prev=temp;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		
		while(temp.getNext() != null)
		{
			prev=temp;
			temp=temp.getNext();
		
			
		}
		prev.setNext(null);
	}
	
	public void deleteAtPos(int pos) {
		Node temp=head;
		
		Node prev=temp;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		
		if(pos==1)
		{
			delete();
		}
		
		else
		{
			for(int i=0;i<(pos-1);i++)
			{
			prev=temp;
			temp=temp.getNext();
			}
		}
			
		prev.setNext(temp.getNext());
	}
	
	public void display()
	{
		Node temp=head;
		while(temp != null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	public void displayRev()
	{
		Stack<Node> s=new Stack<>();
		Node temp=head;
		
		while(temp !=null)
		{
			s.push(temp);
			temp=temp.getNext();
			
		}
		
		while(!s.isEmpty())
		{
			System.out.print(s.pop().getData()+" ");
		}
		
	}
	
	public void search(int data)
	{
		Node temp=head;
		if (head==null)
		{
			System.out.println("list is empty!");
		}
		else
		{
			int count=1;
			while(temp !=null)
			{
				if(temp.getData()==data)
				{
					System.out.println(temp.getData()+"found at pos "+count);
					return;
				}
				count++;
				temp=temp.getNext();
			}
				System.out.println("Not found!!!");			
		}
	}
	
	public void deleteByVal(int data)
	{
		Node temp=head;
		Node prev=temp;
		if(head==null) {
			System.out.println("list is empty");
		}
		else
		{
			
			while(temp.getNext() !=null)
			{
				
				if(temp.getData()==data)
				{
					
					prev.setNext(temp.getNext());
					System.out.println(temp.getData()+" deleted");
					return;
				}
				prev=temp;
				
				temp=temp.getNext();
			}
				System.out.println("value Not found!!!");			
		}
		}
	
	
	

}
