
public class CircularLL {

	Node last=null;
	void add(Object o)
	{
		Node t=new Node();
		t.setData(o);
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
	void delete(Object v)
	{
		Node p=last.getNext();
		Node prev=null;
		boolean found=false;
		do{
			if(p.getData().equals(v))
			{
				found=true;
				break;
			}	
			prev=p;
			p=p.getNext();	
		}while(p!=last.getNext());

		if(found==false)
			System.out.println("Data doesnt exist");
		else if(p==last.getNext())
		{
			last.setNext(p.getNext());
		}
		else if(p==last)
		{
			prev.setNext(p.getNext());
			last=prev;
		}
		else
		{
			prev.setNext(p.getNext());
		}	
	}
	void display()
	{
		Node p=last.getNext();
		do{
		    System.out.print(p.getData()+" ");
		    p=p.getNext();
		}
		while(p!=last.getNext());
	}
}
