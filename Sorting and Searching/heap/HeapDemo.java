package heap;

public class HeapDemo {
	public static void main(String args[]){

		//int[] a={4,1,3,2,16,9,10,14,8,7};
		int a[]={3,4,5};
		MaxHeap mh=new MaxHeap(a);
		mh.sort(a);
		mh.display();
	}
}
