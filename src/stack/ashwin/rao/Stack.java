package stack.ashwin.rao;

import java.io.IOException;
import java.util.Scanner;



public class Stack
{
	private int tos;
	private int item[];

	public Stack(int size)
	{
		tos = -1;
		item = new int[size];
	}


	public void push()
	{
		int data;
		int size=5;

		if(tos==size-1)
		{
			System.out.println("Stack is full");
		}
		else
		{
			System.out.println("Enter the element");
			Scanner sc= new Scanner(System.in);
			data= sc.nextInt();
			item[++tos] = data;
			//System.out.println("Pushed Item :" + item[tos]);
			//System.out.println("tos :"+tos);
		}
	}

	public void pop()
	{
		int data;
		if(tos==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			data=item[tos];
			tos=tos-1;
			//System.out.println("Deleted item is"+data);
		}
	}

	public void display()
	{
		int i;
		if(tos==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Stack elements are :");
			for(i=tos;i>=0;i--)
			{
				System.out.println(""+item[i]);
			}
			//   System.out.println("Stack elements are :..........");
			//  for(i=0;i<=tos;i++)
			// {
			//  System.out.println(""+item[i]);
			// }
		}
	}

}