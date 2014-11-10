package Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class binarySearch {
	public static void main(String []args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of elements");
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		System.out.println("enter elements in ascending order ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("enter element ");
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.print("enter element to be searched ");
		int v=Integer.parseInt(br.readLine());
		int m=binarysearch(a,0,n,v);
		System.out.println("element found at postition "+m);
	}
	
	static int binarysearch(int a[],int low,int high ,int v)
	{
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==v)
				return (mid+1);
			if(a[mid]>v)
				high=mid-1;
			else
				low=mid+1;		
		}
		return -1;
	}
}
