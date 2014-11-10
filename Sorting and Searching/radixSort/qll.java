package radixSort;

public class qll {
Node front,rear;
	
	void insert(int v)
	{
		Node a =new Node();
		a.elem=v;
		
		if(front==null)
		{
			front=a;
			rear=a;
		}
		else
		{
			rear.next=a;
			rear=a;
		}
	}

	int del()
	{
		int r=front.elem;
		front=front.next;
		
		if(front==null)
			rear=null;
		return r;
	}

	boolean isEmpty()
	{
		return front==null&&rear==null;
	}
}
