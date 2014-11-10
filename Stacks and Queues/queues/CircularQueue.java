package queues;

public class CircularQueue {
	int rear=-1,front=-1,count=0;
	int a[];
	CircularQueue(int n)
	{
		a=new int[n];
	}
	void insert(int v)throws Exception
	{
		if(a.length==count)
			throw new Exception("Queue is full ");
		else
		{
			rear=(rear+1)%a.length;
			a[rear]=v;
			count++;
		}	
	}
	int remove()throws Exception
	{
		if(count==0)
			throw new Exception("Queue is empty ");
		else
		{
			front=(front+1)%a.length;
			count--;
			return a[front];
		}	
	}
	boolean empty()
	{
		return count==0;
	}
}
