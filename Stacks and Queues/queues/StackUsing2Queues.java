package queues;

public class StackUsing2Queues {
	QueueArray q1,q2;
	void push(int value)throws Exception
	{
		if(q1.isFull())
			throw new Exception("Overflow");
		else
		{
			q1.insert(value);
		}
	}
	int pop()throws Exception
	{
		if(q1.empty())
		{
			throw new Exception("Underflow");
		}
		else
		{
			while(q1.getSize()!=1)
				q2.insert(q1.remove());
			int value=q1.remove();
			while(!q2.empty())
				q1.insert(q2.remove());
		return value;
		}
	}
}
