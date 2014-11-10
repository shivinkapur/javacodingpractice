package Searching;

public class closestBinarySearch {
	public static int binarySearchRecursiveClosest(int[] a, int x, int low, int high) {
		if (low > high) { // high is on the left side now
			if (high < 0) return low;
			if (low >= a.length) return high;
			if (x - a[high] < a[low] - x) {
				return high;
			} 
			return low;
		}
		
		int mid = (low + high) / 2;
		if (a[mid] < x) {
			return binarySearchRecursiveClosest(a, x, mid + 1, high);
		} else if (a[mid] > x) {
			return binarySearchRecursiveClosest(a, x, low, mid - 1);
		} else {
			return mid;
		}
	}
	public static void main(String args[])
	{
		int[] array={1,3,5,7,9,11,42};
		int ans=binarySearchRecursiveClosest(array,15,0,array.length);
		System.out.println(array[ans]);
	}
	
}
