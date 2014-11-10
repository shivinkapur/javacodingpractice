package doublyLL;

public class DoublyLL {
	Node first=null;
	void add(Object v)
	{
		Node t=new Node();
		t.setData(v);
		if(first==null)
		{
			t.setPrev(first);
			first=t;
		}
		else
		{
			Node p=first;
			while(p.getNext()!=null)
				p=p.getNext();
			t.setPrev(p);
			p.setNext(t);
		}
	}
	void display()
	{
		Node p=first;
		while(p!=null)
		{
			System.out.print(p.getData()+" ");
			p=p.getNext();
		}
	}
	boolean delete(Object v)
	{
		Node p=first;
		Node prev=null;
		while(p!=null)
		{
			if(p.getData().equals(v))
				break;
			p=p.getNext();
			prev=p;	
		}
		if(p==null)
			return false;
		else if(p.getNext()==null)
		{
			prev.setNext(null);
		}	
		else if(p==first)
		{
			first=p.getNext();
			p.getNext().setPrev(null);
		}	
		else
		{
			p.getPrev().setNext(p.getNext());
			p.getNext().setPrev(p.getPrev());
		}	
			return true;
	}
}
