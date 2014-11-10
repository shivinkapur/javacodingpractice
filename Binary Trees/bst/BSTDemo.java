package bst;

import java.util.Scanner;

public class BSTDemo {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		BST x=new BST();
		int choice;
		do
		{
			System.out.println("enter 1 to insert 2 to delete 3 to quit ");
			choice=sc.nextInt();
			if(choice==1)
			{
			  System.out.print("Enter Node ");
			  x.insert(sc.nextInt());
			}
			else if (choice==2)
			{
				System.out.print("Enter Node to be deleted ");
				x.delete(sc.nextInt());
			}
				
			else if(choice==3)
			break;  
		}while(true);
		x.preorder();
		System.out.println();
		x.inorder();
		System.out.println();
		x.postorder();
		System.out.println();
		sc.close();
	}
}
