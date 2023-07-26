package cll;

import java.util.Stack;

import sll.Node;

public class LinkedList {
	
	private Node head;
	private Node tail;
	
	
	public LinkedList() {
	
		this.head=null;
		this.tail=null;
	}
	
	public void insertAtBeg(int data)
	{
		Node nn=new Node(data);
		
		if(head==null)
		{
			head=nn;
			tail=nn;
			nn.setNext(head);
		}
		else
		{
			nn.setNext(head);
			head=nn;
			tail.setNext(head);
		}
	}
	
	public void insertAtLast(int data) {
		Node temp=head.getNext();
		Node nn=new Node(data);
		
		if(head==null)
		{
			head=nn;
			tail=nn;
			nn.setNext(head);
		}
		else
		{
			while(temp.getNext() !=  head)
			{
				temp=temp.getNext();
			}
			temp.setNext(nn);
			nn.setNext(head);
			tail=nn;
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
			if(prev==head)
			{
				System.out.println(" position out of index");
				return false;
			}
		}
		nn.setNext(prev.getNext());
		prev.setNext(nn);
		return true;
		
	}
	
	public void display()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("list is Empty");
		}
		else
		{
			do {
				System.out.print(temp.getData()+" ");
				temp=temp.getNext();
			}while(temp != head);
		}
		System.out.println();
	}
	
	public void displayRev()
	{
		Node temp=head;
		Stack<Node> s=new Stack<>();
		if(head==null)
		{
			System.out.println("list is Empty");
		}
		else
		{
			do {
				s.push(temp);
				temp=temp.getNext();
			}while(temp != head);
		}
		
		System.out.println("rev list");
		while(!s.isEmpty())
		{
			System.out.print(s.pop().getData()+" ");
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
			tail.setNext(head);
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
		
		while(temp.getNext() != head)
		{
			prev=temp;
			temp=temp.getNext();
		
			
		}
		prev.setNext(head);
	}
	
	public void deleteAtPos(int pos) {
		Node temp=head;
		
		Node prev=null;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		if(pos<=0 || (head==null&&pos>1))
		{
			
		}
		
		else
		{
			for(int i=0;i<(pos-1);i++)
			{
			prev=temp;
			temp=temp.getNext();
			if(temp==head)
			{
				System.out.println("pos not found in list!!");
			return;
			}
		}
			
		prev.setNext(temp.getNext());
	}

}}
