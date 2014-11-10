package naiveOpti;

public class NaiveOptimized {
	public static void main(String args[]){
//		String text = "AABAACAADAABAAABAA";
//		String pattern = "AABA";
		String text = "ABCEABCDABCEABCD";
		String pattern = "ABCD";
		search(pattern,text);
	}

	private static void search(String pattern, String text) {
		// TODO Auto-generated method stub
		int n = text.length();
		int m = pattern.length();
		
		char txt[] = text.toCharArray();
		char pat[] = pattern.toCharArray();
		int i = 0;
		 
	    while(i <= n-m)
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
	           System.out.println("Pattern found at index \n"+ i);
	           i = i + m;
	        }
	        else if (j == 0)
	        {
	           i = i + 1;
	        }
	        else
	        {
	           i = i + j; // slide the pattern by j
	        }
	    }
	}
}
