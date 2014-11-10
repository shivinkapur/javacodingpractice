package priorityQueue;

public class PriorityQueue {
	Node first;
	void insert(Object v,int q)
	{
		Node x=new Node();
		x.setData(v);
		x.setPri(q);
		if(first==null||first.getPri()>q)
		{
			x.setNext(first);
			first=x;
		}
		else
		{
			Node p=first,prev=null;
			while(p!=null)
			{
				if(p.getPri()>q)
					break;
				prev=p;
				p=p.getNext();	
			}
			x.setNext(p);
			prev.setNext(x);	
		}
	}
	Object remove()throws Exception
	{
		if(first==null)
			throw new Exception("Empty");
		else
		{
			Node p=first;
			first=first.getNext();
			return p.getData();
		}	
	}
	void display()
	{
		Node p=first;
		while(p!=null)
		{
			System.out.print(p+" ");
			p=p.getNext();
		}
	}
}
