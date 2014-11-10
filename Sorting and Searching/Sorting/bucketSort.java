package Sorting;

public class bucketSort {
    public static void sort(int[] a, int maxVal)
    {
        int [] bucket=new int[maxVal+1];

        for (int i=0; i<bucket.length; i++)
        {
            bucket[i]=0;
        }

        for (int i=0; i<a.length; i++)
        {
            bucket[a[i]]++;
        }

        int outPos=0;
        for (int i=0; i<bucket.length; i++)
        {
            for (int j=0; j<bucket[i]; j++)
            {
                a[outPos++]=i;
            }
        }

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();

    }

    
    public static void main(String[] args){
        int maxVal=3;
        int [] data= {1,0,1,2,3,1,0,3,1,0,1,3};
        sort(data,maxVal);
    }

}
