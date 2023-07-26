package stack;

import java.util.Scanner;

public class Array {

	private int top= -1;
	private int n=10;
	int[] arr = new int[n];
	
	public void push(int data) {
		
		if(top == (n-1))
		{
			System.out.println("stack overflow");
		}
		else
		{
			top= top+1;
			arr[top]=data;
		}
	}
	
	public void pop()
	{
		if(top== -1)
		{
			System.out.println("stack empty");
		}
		else
		{
			top=top-1;
		}
	}
	
	public void display()
	{
		for (int i=(top);i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	

	

}
