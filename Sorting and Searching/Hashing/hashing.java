package Hashing;

public class hashing {
	public static void main(String []args)
	{
		hashTable x=new hashTable(100);
		x.insertLinear(25,"Hello");
		x.insertLinear(35,"Hi");
		x.insertLinear(45,"wasuuppp");
		Object v=x.searchDoubleHash(35);
		System.out.println(v);
	}
}
