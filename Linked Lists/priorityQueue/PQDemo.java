package priorityQueue;

public class PQDemo {
	public static void main(String []args)throws Exception
	{
		PriorityQueue x=new PriorityQueue();
		x.insert(20,5);
		x.insert(40,10);
		x.insert(35,7);
		x.insert(54,15);
		x.insert(105,3);
		x.insert(5,32);
		x.display();
		System.out.println(x.remove());
		System.out.println();
		x.display();
		System.out.println();
	}
}
