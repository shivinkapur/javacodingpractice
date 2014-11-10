package stacks;

public class StackArray {
	int top=-1;
	Object a[];
	StackArray(int n)
	{
		a=new Object[n];
	}
	public void push(Object e)throws Exception
	{
		if(top==a.length-1)
			throw new Exception("Stack is full ");
		else
			a[++top]=e;
	}
	public Object pop()throws Exception
	{
		if(top==-1)
			throw new Exception("Stack is empty ");
		else
			return a[top--];	
	}
	public boolean empty()
	{
		return (top==-1);
	}
	public boolean isFull()
	{
		return top==a.length-1;
	}
	public int getSize()
	{
		return top+1;
	}
	public Object peek()throws Exception
	{
		if(top==-1)
			throw new Exception("Stack is empty ");
		else
			return a[top];	
	}
}