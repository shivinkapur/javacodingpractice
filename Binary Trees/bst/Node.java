package bst;

public class Node {
	private int data;
	private Node left,right;
	int getData()
	{
		return data;
	}
	Node getLeft()
	{
		return left;
	}
	Node getRight()
	{
		return right;
	}
	void setData(int d)
	{
		data=d;
	}
	void setLeft(Node l)
	{
		left=l;
	}
	void setRight(Node r)
	{
		right=r;
	}
}
