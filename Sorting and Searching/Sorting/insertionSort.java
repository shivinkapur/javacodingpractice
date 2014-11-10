package Sorting;

public class insertionSort {
	static void insertionsort(int a[])
	{
		int m,j;
		for(int i=1;i<a.length;i++)
		{ 
			m=a[i]; 
			for( j=i;j>0&&a[j-1]>a[j];j--)
			{
				a[j]=a[j-1];
				a[j-1]=m;
			}
		}	
	}
	
	public static void main(String arg[])
	{
		int a[]={5,2,4,6,1,3};
		insertionsort(a);
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
	}
}
