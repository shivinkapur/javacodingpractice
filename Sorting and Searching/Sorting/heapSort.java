package Sorting;

public class heapSort {
	static void heapSorting(int []a)
	{
		for(int i=(a.length/2)-1;i>=0;i--)
		{
			heapify(a,i,a.length);
		}
		for(int i=a.length-1;i>=0;i--)
		{
			int t=a[0];
			a[0]=a[i];
			a[i]=t;
			heapify(a,0,i);
		}
	}
	static void heapify(int []a,int p,int n)
	{
		int t=a[p];
		int i;
		for(i=2*p+1;i<n;i=2*i+1)
		{
			if((i+1)<n && a[i]<a[i+1])
				i++;
			if(a[i]>t)
				a[(i-1)/2]=a[i];
			else break;		
		}
		a[(i-1)/2]=t;
	} 
		public static void main(String arg[])
	{
		int a[]={10,34,22,4,12};
		heapSorting(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
