package queues;

public class QueueDemo {
	public static void main(String []args)
	{
		//QueueArray x=new QueueArray(20);
		QueueLL x=new QueueLL();
		//CircularQueue z=new CircularQueue(3);
		try
		{
			x.insert(20);
			x.insert(40);
			x.insert(30);
			x.insert(15);
			x.insert(24);
			//x.remove();
			while(!x.empty())
				System.out.println(x.remove());
		}
		catch(Exception e){}
	}
}
