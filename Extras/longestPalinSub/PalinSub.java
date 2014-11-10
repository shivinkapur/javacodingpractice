package longestPalinSub;

import java.util.Scanner;

public class PalinSub {
	static String expandAroundCenter(String s, int c1, int c2) {
		  int l = c1, r = c2;
		  int n = s.length();
		  char[] st=s.toCharArray();
		  while (l >= 0 && r <= n-1 && st[l] == st[r]) {
			    l--;
			    r++;
			  }
		  String so=new String(st);
			  return so.substring(l+1, r-l-1);
			}
		 
		static String longestPalindromeSimple(String s) {
		  int n = s.length();
		  if (n == 0) return "";
		  String longest = s.substring(0, 1);  // a single char itself is a palindrome
		  for (int i = 0; i < n-1; i++) {
		    String p1 = expandAroundCenter(s, i, i);
		    if (p1.length() > longest.length())
		      longest = p1;
		 
		    String p2 = expandAroundCenter(s, i, i+1);
		    if (p2.length() > longest.length())
		      longest = p2;
		  }
		  return longest;
		}
		
		static String longestPalindromeDP(String s) {
			  int n = s.length();
			  int longestBegin = 0;
			  int maxLen = 1;
			  boolean table[][]=new boolean[1000][1000];
			  for (int i = 0; i < n; i++) {
			    table[i][i] = true;
			  }
			  char[] st=s.toCharArray();
			  for (int i = 0; i < n-1; i++) {
			    if (st[i] == st[i+1]) {
			      table[i][i+1] = true;
			      longestBegin = i;
			      maxLen = 2;
			    }
			  }
			  for (int len = 3; len <= n; len++) {
			    for (int i = 0; i < n-len+1; i++) {
			      int j = i+len-1;
			      if (st[i] == st[j] && table[i+1][j-1]) {
			        table[i][j] = true;
			        longestBegin = i;
			        maxLen = len;
			      }
			    }
			  }
			  String so=new String(st);
			  return so.substring(longestBegin, maxLen);
			}
		
		public static void main(String args[])
		{
			System.out.println("Enter a string");
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			String output=longestPalindromeDP(s);
			String output2=longestPalindromeSimple(s);
			System.out.println(output);
			System.out.println(output2);
			sc.close();
		}
}
