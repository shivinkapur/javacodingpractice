package priorityQueue;

public class Node {
	private Object data;
	private int pri;
	private Node next;
	public Object getData()
	{
		return data;
	}
	public int getPri()
	{
		return pri;
	}
	public Node getNext()
	{
		return next;
	}
	public void setData(Object d)
	{
		data=d;
	}
	public void setPri(int z)
	{
		pri=z;
	}
	public void setNext(Node n)
	{
		next=n;
	}
	public String toString()
	{
		return data+"\t"+pri;
	}
}
