package Sorting;

public class heap2 {
	static int left(int i)
	{
		return 2*i;
	}
	static int right(int i)
	{
		return 2*i+1;
	}
	static int parent(int i)
	{
		return i/2;
	}
	static void MaxHeapify(int a[],int i)
	{
		int largest=0;
		int l=left(i);
		int r=right(i);
		int hsize=a.length-1;

		if(l<=hsize && a[l]>a[i])
			largest=l;
		else largest=i;

		if(r<=hsize && a[r]>a[largest])
			largest=r;

		if(largest!=i)
		{
			int temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
			MaxHeapify(a,largest);
		}	
	}
	static void BuildMaxHeap(int a[])
	{
		int hsize=a.length-1;
		for(int i=hsize/2;i>0;i--)
			MaxHeapify(a,i);
	}
	static void HeapSort(int a[])
	{
		BuildMaxHeap(a);
		int hsize=a.length-1;
		for(int i=a.length-1;i>2;i--)
		{
			int temp=a[1];
			a[1]=a[i];
			a[i]=temp;
			hsize=hsize-1;
			MaxHeapify(a,1);
		}
	}
	public static void main(String args[])
	{
		int a[]={4,1,3,2,16,9,10,14,8,7};
		HeapSort(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
