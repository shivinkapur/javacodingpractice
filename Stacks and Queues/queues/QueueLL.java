package queues;

public class QueueLL {
	Node front=null,rear=null;
	void insert(Object v)
	{
		Node t=new Node();
		t.setData(v);
		if(rear==null)
		{
			rear=t;
			front=rear;
		}
		else
		{
			rear.setNext(t);
			rear=t;
		}
	}
	Object remove()throws Exception
	{
		if(rear==null)
			throw new Exception("Queue is empty ");
		else
		{
			Node p=front;
			front=p.getNext();
			if(front==null)
				rear=null;
			return p.getData()	;
		}		
	}
	boolean empty()
	{
		return (front==null||rear==null);
	}
}