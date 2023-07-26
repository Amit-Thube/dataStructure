package stackLl;

public class Linked {
	
	
	private Node top=null;
	
	public void push(int data)
	{
		Node nn=new Node(data);
		if(top == null)
		{
			top=nn;
		}
		else
		{
			nn.setNext(top);
			top=nn;
		}
		
	}
	
	public void pop()
	{
	
		if(top==null)
		{
			System.out.println("stack empty");
		}
		else
		{
			
			
				top=top.getNext();
			
		}
	}
	
	public void peek()
	{
		Node temp=top;
		if(temp==null)
		{
			System.out.println("stack is empty");
		}
		else
		{
			while (temp!=null)
			{
				System.out.println(temp.getData());
				temp=temp.getNext();
			}
		}
	}

}
