package Searching;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class linearSearch {
	public static void main(String []args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of elements");
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("enter element ");
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.print("enter element to be searched ");
		int v=Integer.parseInt(br.readLine());
		int m=linearsearch(a,v);
		if(m!=-1)
		System.out.println("element found at postition "+m);
		else
		System.out.println("element not found");	
	}
	
	static int linearsearch(int x[],int v)
	{
		int i=0;
		while(i<x.length&&x[i]!=v)
			i++;
		if(x.length>i)
			return i+1;
		else
			return -1;		
	}
}
