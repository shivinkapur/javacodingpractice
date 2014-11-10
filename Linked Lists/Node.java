
public class Node {
	private Node next;
	private Object data;
	public Object getData()
	{
		return data;
	}
	public Node getNext()
	{
		return next;
	}
	public void setData(Object d)
	{
		data=d;
	}
	public void setNext(Node n)
	{
		next=n;
	}
}
