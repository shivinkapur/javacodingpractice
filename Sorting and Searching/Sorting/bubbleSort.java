package Sorting;

public class bubbleSort {
	static void bubblesort(int a[])
	{
		int temp,j;
		
		for(int i=1;i<a.length;i++)
			 for(j=0;j<a.length-1;j++)
					if(a[j]>a[j+1])			
						{
							temp = a[j];
							a[j] = a[j+1];
							a[j+1]=temp;
						}	
	}
	
	public static void main(String arg[])
	{
		int a[]={4,3,2,8,5,6,7,1};
		bubblesort(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");			
	}
}
