package stacks;

public class StackLL {
	Node first=null;
	void push(Object e)
	{
		Node t=new Node();
		t.setData(e);
		Node p=first;
	    first=t;
	    t.setNext(p);
	}
	Object pop()throws Exception
	{
		if(first==null)
			throw new Exception("Stack is empty ");
		else
		{
			Node p=first;
			first=p.getNext();
			return p.getData();
		}	
	}
	boolean empty()
	{
		return (first==null);
	}
}
