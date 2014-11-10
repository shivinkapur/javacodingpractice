package reverseLL;

public class ReverseLL {
	
	public static void Print(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	public static Node Insert(Node head, int d)
	{
		Node newNode=new Node();
		newNode.data=d;
		newNode.next=head;
		return newNode;
	}
	public static Node Reverse(Node head)
	{
		if(head==null || head.next==null)
			return head;
		Node prevNode=null;
		Node curNode=head;
		while(curNode!=null)
		{
			Node nextNode=curNode.next;
			curNode.next=prevNode;
			prevNode=curNode;
			curNode=nextNode;
		}
		return prevNode;
	}
	public static void main(String args[])
	{
		Node head=null;
		head=Insert(head,1);
		head=Insert(head,2);
		head=Insert(head,3);
		head=Insert(head,4);
		head=Insert(head,5);
		Print(head);
		head=Reverse(head);
		Print(head);
	}
}
