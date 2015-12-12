import java.io.IOException;
import java.util.Scanner;

import stack.ashwin.rao.*;

public class StackTest
{


	public static void main(String[] args) throws IOException {
		boolean done=true;
		int choice;
		Stack stk = new Stack(5);

		do {
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			Scanner sc= new Scanner(System.in);
			choice= sc.nextInt();


			switch(choice) {
				case 1: stk.push();
				break;
				case 2: stk.pop();
				break;
				case 3: stk.display();
				break;
				case 4: done = false;
				break;
				default: System.out.println("Invalid Choice");
			}
		}
		while(done == true);
	}

}