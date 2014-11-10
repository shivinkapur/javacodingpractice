package doublyLL;

public class Node {
	private Object data;
	private Node prev;
	private Node next;
	Object getData()
	{
		return data;
	}
	Node getNext()
	{
		return next;
	}
	Node getPrev()
	{
		return prev;
	}
	void setData(Object v)
	{
		data=v;
	}
	void setNext(Node n)
	{
		next=n;
	}
	void setPrev(Node p)
	{
		prev=p;
	}
}
