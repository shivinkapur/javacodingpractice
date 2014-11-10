package naivePatternSearching;

import java.util.Scanner;

public class NaivePatternSearching {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String text = "AABAACAADAABAAABAA";
		String pattern = "AABA";
		search(pattern,text);
		sc.close();
	}

	private static void search(String pattern, String text) {
		// TODO Auto-generated method stub
		int n = text.length();
		int m = pattern.length();
		
		char txt[] = text.toCharArray();
		char pat[] = pattern.toCharArray();
		
		/* A loop to slide pat[] one by one */
	    for (int i = 0; i <= n - m; i++)
	    {
	        int j;
	  
	        /* For current index i, check for pattern match */
	        for (j = 0; j < m; j++)
	        {
	            if (txt[i+j] != pat[j])
	                break;
	        }
	        if (j == m)  // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
	        {
	           System.out.println("Pattern found at index \n "+ i);
	        }
	    }
	}
}
// Complexity is O(m*(n-m+1))