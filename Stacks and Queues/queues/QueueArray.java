package queues;

public class QueueArray {
	int a[];
	int front=-1,rear=-1;
	QueueArray(int n)
	{
		a=new int[n];
	}
	public void insert(int v)throws Exception
	{
		if(a.length-1==rear)
			throw new Exception("Queue is full ");
		else
			a[++rear]=v;	
	}
	public int remove()throws Exception
	{
		if(rear==front)
			throw new Exception("Queue is empty ");
		else
			return a[++front];	
	}
	public boolean empty()
	{
		return (front==rear);
	}
	public boolean isFull()throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	public int getSize()throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
}
