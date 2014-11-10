package anagramToPalindrome;
// we check if there is at most one character with odd occurrences in the string we can say that we can form a palindrome from any anagram.


import java.util.Scanner;

public class AnagramToPalindrome {
	public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        if( checkPalindrome(input) )
            System.out.println("Yes");
        else
            System.out.println("No");
        reader.close();
    }
    public static boolean checkPalindrome(String input)
    {
        int [] count = new int[26];
        for( int i = 0; i < input.length(); i++ )
        {
            char ch = input.charAt(i);
            count[ch-'a']++;
        }
        int oddOccur = 0;
        for( int cnt:count )
        {
            if( oddOccur > 1)
                return false;
            if( cnt%2 == 1 )
                oddOccur++;
        }
        return true;
    }
}
