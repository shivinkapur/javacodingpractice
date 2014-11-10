package stacks;

import java.util.Scanner;

public class TwoStackDemo {
	public static void main (String arg[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements you want in the stack");
		int n=sc.nextInt();
		TwoStacks s=new TwoStacks(n);
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element ");
			int v=sc.nextInt();
			s.pushup(v);
		}
		while(!s.emptybot())
			System.out.print(s.popbot()+" ");
		System.out.println();
		while(!s.emptyup())
			System.out.println(s.popup()+" ");	
		sc.close();
	}
}
