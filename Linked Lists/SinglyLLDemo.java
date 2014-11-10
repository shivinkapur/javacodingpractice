
public class SinglyLLDemo {
	public static void main(String []args)
	{
		SinglyLL x=new SinglyLL();
		x.add(25);
		x.add(35);
		x.add(10);
		x.add(40);
		x.add(23);
		x.display();
		System.out.println();
		System.out.println(x.search(21));
		x.insertA(35,20);
		x.display();
		System.out.println();
		x.insertB(5);
		x.display();
		System.out.println();
		x.delete(5);
		x.delete(40);
		x.display();
		System.out.println();
		x.insertP(5,1);
		x.insertP(24,3);
		x.display();
		System.out.println();
	}
}
