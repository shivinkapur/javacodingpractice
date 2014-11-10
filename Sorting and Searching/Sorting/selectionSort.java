package Sorting;

public class selectionSort {
	static void selectionsort(int a[])
	{
		int p;
		for(int i=0;i<a.length-1;i++)
			{
				p=i;
				for(int j=i+1;j<a.length;j++)	
				{
					if(a[p]>a[j])
					p=j;
				}
				int temp=a[i];
				a[i]=a[p];
				a[p]=temp;
			}
	}

	public static void main(String arg[])
	{
		int a[]={3,2,5,6};
		selectionsort(a);
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");	
	}
}
