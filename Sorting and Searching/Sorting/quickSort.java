package Sorting;

public class quickSort {
	static void  quicksort(int a[],int low,int high)
	{
		if(low<high)
		{
			int d=pivot(a,low,high);
			quicksort(a,low,d-1);
			quicksort(a,d+1,high);
		}	
	}
	
	static int pivot(int a[],int low,int high)
	{
		int p=a[low];
		int l=low+1;
		int h=high;
		while(true)
		{
			while(l<=high && a[l]<p)
			l++;

			while(h>=0 && a[h]>p)
			h--;

			if(l<h)
			{ 
				int t=a[l];
				a[l]=a[h];
				a[h]=t;
			}		
			else
			{
				a[low]=a[h];
				a[h]=p;
				break;
			}
		}// while ends
		return h;
	}

	static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		System.out.println();
	}	

	public static void main(String arg[])
	{
		int a[]=new int[7];
		a[0]=842;
		a[1]=97;
		a[2]=115;
		a[3]=34;
		a[4]=127;
		a[5]=83;
		a[6]=45;
		quicksort(a,0,a.length-1);
		display(a);
	}
}