package finiteAutomata;

public class FiniteAuto1 {
	
	public static final int NO_OF_CHARS = 256;
	
	public static void main(String args[]) {
		String text = "ABABDABACDABABCABAB";
		// String pattern = "ABABCABAB";
		String pattern = "ABA";
		search(pattern,text);
	}

	/* Prints all occurrences of pat in txt */
	private static void search(String pattern, String text) {
		// TODO Auto-generated method stub
		int m = pattern.length();
		int n = text.length();
		
		char txt[] = text.toCharArray();
		char pat[] = pattern.toCharArray();
		
		int[][] TF = new int[m+1][NO_OF_CHARS];
		 
	    computeTF(pat, m, TF);
	 
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
	
	/* This function builds the TF table which represents Finite Automata for a
	   given pattern  */
	private static void computeTF(char[] pat, int m, int[][] tF) {
		// TODO Auto-generated method stub
		int state, x;
	    for (state = 0; state <= m; ++state)
	        for (x = 0; x < NO_OF_CHARS; ++x)
	           tF[state][x] = getNextState(pat, m,  state, x);
	}

	private static int getNextState(char[] pat, int m, int state, int x) {
		// TODO Auto-generated method stub
		
		// If the character c is same as next character in pattern,
	    // then simply increment state
	    if (state < m && x == pat[state])
	        return state+1;
	 
	    int ns, i;  // ns stores the result which is next state
	 
	    // ns finally contains the longest prefix which is also suffix
	    // in "pat[0..state-1]c"
	 
	    // Start from the largest possible value and stop when you find
	    // a prefix which is also suffix
	    for (ns = state; ns > 0; ns--)
	    {
	        if(pat[ns-1] == x)
	        {
	            for(i = 0; i < ns-1; i++)
	            {
	                if (pat[i] != pat[state-ns+1+i])
	                    break;
	            }
	            if (i == ns-1)
	                return ns;
	        }
	    }
		return 0;
	}
	
}
