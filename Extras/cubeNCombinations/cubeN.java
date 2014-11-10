package cubeNCombinations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class cubeN {
	
	public static void main(String[] args) {
		
		int sum = 0,l = 1;
		HashMap<Integer,Integer> hm  = new HashMap<Integer,Integer>();

		System.out.println("Enter the Value of N :");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
							
		for(int j = 0; j < n; j++){
			
			sum = j*j*j;
			hm.put(sum,j);
		}	
				
		
		Set<Entry<Integer, Integer>> set = hm.entrySet();		
		Iterator<Entry<Integer, Integer>> i = set.iterator();
		
		
		while(i.hasNext()){
		
			Entry<Integer, Integer> me = i.next();
			int Value = n - (Integer) me.getKey();
			int num1 = (Integer)me.getValue();
			
			if(hm.containsKey(Value)){
				 int num2 = hm.get(Value);
				System.out.println("Combination -"+l+" "+num1+","+num2);
				l++;
				
			}		
			
		}	
	}

}