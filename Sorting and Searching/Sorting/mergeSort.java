package Sorting;

public class mergeSort {
	static void mergesort(int a[],int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
				mergesort(a,low,mid);
				mergesort(a,mid+1,high);
				merge(a,low,mid,high);
		}
	}
	
	static void merge(int a[],int low,int mid,int high)
	{
		int k=0;
		int l=low,h=mid+1;
		int b[]=new int[high-low+1];
		
		while(l<=mid && h<=high)
			b[k++]=a[l]<a[h]?a[l++]:a[h++];
		
		while(l<=mid)
			b[k++]=a[l++];
			
		while(h<=high)
			b[k++]=a[h++];
			
		for(int i=low, j=0;i<=high;i++)
			a[i]=b[j++];
			
	}
	public static void main(String arg[])
	{
		int a[]={5,2,4,6,1,3};
		mergesort(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");	
	}
}
