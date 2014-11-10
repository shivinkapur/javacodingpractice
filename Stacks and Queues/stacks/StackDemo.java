package stacks;

public class StackDemo {
	public static void main(String []args)
	{
		//StackArray x=new StackArray(30);
		StackLL x=new StackLL();
		try
		{
			x.push(20);
			x.push(34);
			x.push(45);
			x.push(10);
			x.push(54);
			while(!x.empty())
				System.out.println(x.pop());
		}
		catch(Exception e){}	
	}
}
