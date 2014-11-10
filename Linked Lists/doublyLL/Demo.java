package doublyLL;

public class Demo {
	public static void main(String arg[])
	{
		DoublyLL d=new DoublyLL();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.delete(30);
		d.display();
		System.out.println();
	}
}
