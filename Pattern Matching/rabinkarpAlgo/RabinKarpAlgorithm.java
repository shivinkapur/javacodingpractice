package rabinkarpAlgo;

public class RabinKarpAlgorithm {
	
	public static final int d = 256;
	
	public static void main(String args[]) {
		String text = "ABABDABACDABABCABAB";
		// String pattern = "ABABCABAB";
		String pattern = "ABA";
		int primeno = 101;
		search(pattern,text,primeno);
	}

	private static void search(String pattern, String text, int q) {
		// TODO Auto-generated method stub
		int m = pattern.length();
		int n = text.length();
		
		char txt[] = text.toCharArray();
		char pat[] = pattern.toCharArray();
		
		int i, j;
	    int p = 0;  // hash value for pattern
	    int t = 0; // hash value for txt
	    int h = 1;
	  
	    // The value of h would be "pow(d, M-1)%q"
	    for (i = 0; i < m-1; i++)
	        h = (h*d)%q;
	  
	    // Calculate the hash value of pattern and first window of text
	    for (i = 0; i < m; i++)
	    {
	        p = (d*p + pat[i])%q;
	        t = (d*t + txt[i])%q;
	    }
	  
	    // Slide the pattern over text one by one 
	    for (i = 0; i <= n-m; i++)
	    {
	        
	        // Check the hash values of current window of text and pattern
	        // If the hash values match then only check for characters on by one
	        if ( p == t )
	        {
	            /* Check for characters one by one */
	            for (j = 0; j < m; j++)
	            {
	                if (txt[i+j] != pat[j])
	                    break;
	            }
	            if (j == m)  // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
	            {
	                System.out.println("Pattern found at index \n"+ i);
	            }
	        }
	         
	        // Calculate hash value for next window of text: Remove leading digit, 
	        // add trailing digit           
	        if ( i < n-m )
	        {
	            t = (d*(t - txt[i]*h) + txt[i+m])%q;
	             
	            // We might get negative value of t, converting it to positive
	            if(t < 0) 
	              t = (t + q); 
	        }
	    }
	}
}
