package stacks;

public class QueueUsing2Stacks {

	StackArray s1, s2;
	void insert(Object v) throws Exception {
		if (s1.isFull())
			throw new Exception("Stack is full");
		else
			s1.push(v);
	}
	
	public Object remove () throws Exception {
		if(s1.empty())
			throw new Exception("Stack is empty");
		else
		{
			while(s1.getSize()!=1)
				s2.push(s1.pop());
			Object val = s1.pop();
			while(!s2.empty())
				s1.push(s2.pop());
			return val;
		}
	}
}
