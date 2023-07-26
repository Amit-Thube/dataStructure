package linkedList;

public class Ll {
	
	private Node f;
	private Node r;
	
	public void enqueue(int data)
	{
		Node nn=new Node(data);
		if(f==null)
		{
			f=nn;
			r=nn;
		}
		else
		{
			r.setNext(nn);
			r=nn;
		}
	}
	
	public void dequeue()
	{
		if(f==null)
		{
			System.out.println("underflow");
		}
		else
		{
			f=f.getNext();
		}
	}
	
	public void display()
	{
		Node temp=f;
		if(f==null)
		{
			System.out.println("Queue Empty");
		}
		else
		{
			while(temp!=null)
			{
				System.out.println(temp.getData());
				temp=temp.getNext();
			}
		}
	}

}
