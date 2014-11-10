package Sorting;

public class HeapApp {
	public static void main(String args[]){
		heap3<Integer> hp=new heap3<Integer>();
		int a[]={4,1,3,2,16,9,10,14,8,7};
		for(int i=0;i<a.length;i++)
			hp.insert((Integer)a[i]);
		while(!hp.isEmpty()){
			int max=hp.delete();
			System.out.println(max+" "+hp);
		}
	}
}
