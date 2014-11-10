package kmpAlgo;

public class KMPAlgorithm {
	public static void main(String args[]) {
		String text = "ABABDABACDABABCABAB";
		// String pattern = "ABABCABAB";
		String pattern = "ABA";
		KMPSearch(pattern,text);
	}

	private static void KMPSearch(String pattern, String text) {
		// TODO Auto-generated method stub
		int m = pattern.length();
		int n = text.length();
		
		char txt[] = text.toCharArray();
		char pat[] = pattern.toCharArray();
		int lps[] = new int[m];
		
		computeLPSArray(pat,m,lps);
		
		int i = 0;  // index for txt[]
	    int j = 0;  // index for pat[]
		
		while (i < n)
	    {
	      if (pat[j] == txt[i])
	      {
	        j++;
	        i++;
	      }
	 
	      if (j == m)
	      {
	        System.out.println("Found pattern at index \n"+ (i-j));
	        j = lps[j-1];
	      }
	 
	      // mismatch after j matches
	      else if (i < n && pat[j] != txt[i])
	      {
	        // Do not match lps[0..lps[j-1]] characters,
	        // they will match anyway
	        if (j != 0)
	         j = lps[j-1];
	        else
	         i = i+1;
	      }
	    }
	}

	private static void computeLPSArray(char[] pat, int m, int[] lps) {
		// TODO Auto-generated method stub
		int len = 0; // length of the previous longest prefix suffix
		int i;
		
		lps[0] = 0; // lps[0] is always 0
		i = 1;
		
		// the loop calculates lps[i] for i = 1 to M-1
		while(i<m) {
			if(pat[i] == pat[len]) {
				len++;
				lps[i]=len;
				i++;
			}
			else { // (pat[i] != pat[len])
				if(len!=0) {
					len = lps[len-1];
				}
				else {
					lps[i]=0;
					i++;
				}
			}
		}
	}
}
