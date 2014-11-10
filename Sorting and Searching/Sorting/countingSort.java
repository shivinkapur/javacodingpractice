package Sorting;

public class countingSort {
	public static void main(String args[])
	{
		int a[]={2,5,3,0,2,3,0,3};
		int b[]=new int[a.length];
		int k=6; //range of elements is between 0 and k
		int c[]=new int[k];

		for (int i=0;i<k ;i++ )
			c[i]=0;	
		
		for (int j=1;j<a.length;j++)
			c[a[j]]= c[a[j]]+1;
		//c[i] now contains the number of elements equal to i

		for(int i=1;i<k;i++)
			c[i]=c[i]+c[i-1];
		//c[i] now contains the number of elements less than or equal to i

		for(int j=a.length-1;j>0;j--)
		{
			b[c[a[j]]]=a[j];
			c[a[j]]=c[a[j]]-1;
		}
		
		for(int i=0;i<b.length;i++)
		System.out.print(b[i]+" ");
		System.out.println();
	}
}
