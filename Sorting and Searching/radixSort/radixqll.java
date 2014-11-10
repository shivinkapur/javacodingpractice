package radixSort;

public class radixqll {
	static void radixsort(int a[])
	{
		int large=a[0],exp=1;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>large)
				large=a[i];
		}
	
		qll q[]=new qll[10]; //10 digits, thus 10 nodes
		for(int i=0;i<q.length;i++)
		q[i]=new qll();
	
		while(large>exp)
		{
			for(int i=0;i<a.length;i++)
				(q[a[i]/exp%10]).insert(a[i]);
			//insert using least significant bit first and then multiply by 10 for next significant bit
		
			for(int i=0, j=0;i<a.length;i++)
			{
				while(q[j].isEmpty())
					j++;
				a[i]=q[j].del();
			}

			for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
			System.out.println();
			
			exp*=10;
		}
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
		radixsort(a);
		System.out.println("The final answer is ");
		display(a);
	}
}
