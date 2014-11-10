package finiteAutomata;

public class FiniteAuto2 {
public static final int NO_OF_CHARS = 256;
	
	public static void main(String args[]) {
		String text = "ABABDABACDABABCABAB";
		// String pattern = "ABABCABAB";
		String pattern = "ABA";
		search(pattern,text);
	}

	private static void search(String pattern, String text) {
		// TODO Auto-generated method stub
		
		int m = pattern.length();
		int n = text.length();
		
		char txt[] = text.toCharArray();
		char pat[] = pattern.toCharArray();
		
		int[][] TF = new int[m+1][NO_OF_CHARS];
		 
	    computeTransFunc(pat, m, TF);
	 
	    // Process txt over FA.
	    int i, state=0;
	    for (i = 0; i < n; i++)
	    {
	       state = TF[state][txt[i]];
	       if (state == m)
	       {
	         System.out.println ("\n patterb found at index "+ (i-m+1));
	       }
	    }
	}

	private static void computeTransFunc(char[] pat, int m, int[][] TF) {
		// TODO Auto-generated method stub
		int i, lps = 0, x;
		 
	    // Fill entries in first row
	    for (x =0; x < NO_OF_CHARS; x++)
	       TF[0][x] = 0;
	    TF[0][pat[0]] = 1;
	 
	    // Fill entries in other rows
	    for (i = 1; i<= m; i++)
	    {
	        // Copy values from row at index lps
	        for (x = 0; x < NO_OF_CHARS; x++)
	            TF[i][x] = TF[lps][x];
	 
	        // Update the entry corresponding to this character
	        TF[i][pat[i]] = i + 1;
	 
	        // Update lps for next row to be filled
	        if (i < m)
	          lps = TF[lps][pat[i]];
	    }
	}
}
