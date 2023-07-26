package array;

public class Array {
	
	private int f=-1;
	private int r=-1;
	
	private int n=5;
	int[] arr=new int[n];
	
	public void enqueue(int data)
	{
		if(f==-1 && r==-1)
		{
			f=0;
			r=0;
			
			arr[r]=data;
		}
		else
		{
			r=r+1;
			arr[r]=data;
		}
	}
	
	public void dequeue()
	{
		if(r==-1)
		{
			System.out.println("Queue empty");
		}
		else
		{
			f=f+1;
		}
	}
	
	public void display()
	{
		if(r==-1)
		{
			System.out.println("Queue empty");
		}
		else
		{
			for(int i=f;i<=r;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
