
public class CircularQLL {
	Node last;
	void insert(int v)
	{
		Node t=new Node();
		t.setData(v);
		if(last==null)
		{
			last=t;
			t.setNext(last);
		}
		else
		{
			t.setNext(last.getNext());
			last.setNext(t);
			last=t;
		}
	}
	int remove()throws Exception
	{
		if (last==null)
			throw new Exception("Queue is empty ");
		else
		{
			Node p=last.getNext();
			last.setNext(p.getNext());
			if(p==last)
				last=null;
			return (Integer)p.getData();	
		}	
	}
	void display()
	{
		Node p=last.getNext();
		do
		{
			System.out.print(p.getData()+" ");
			p=p.getNext();
		}
		while(p!=last.getNext());
	}
}
