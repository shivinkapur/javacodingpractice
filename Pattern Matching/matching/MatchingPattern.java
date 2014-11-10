package matching;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MatchingPattern {
	/*
	 * Complete the function below.
	 */

	    static int wordpattern(String patternString, String input) {
	    	
	        HashMap h = new HashMap();
	        StringBuilder regex = new StringBuilder("^");
	        char[] pat = patternString.toCharArray();
	        
	        for(int i=0;i<pat.length;i++) {
	        	if(h.containsKey(pat[i]))
	        		regex.append("\\"+h.get(pat[i]));
	        	else {
	        		h.put(pat[i], h.size()+1);
	        		regex.append("(.+)");
	        	}
	        }
	        
	        String regex_final = regex.toString();
	        
	        Pattern pattern = Pattern.compile(regex_final);
	        Matcher matcher = pattern.matcher(input);
	        
//	        boolean flag = false;
//	        
//	        String[] group = new String[20];
//	        String group1 = matcher.group(0);
//	        System.out.println(group1);
//	        
//	        for(int i=0;i<h.size();i++) {
//	        	group[i] = matcher.group(i); 
//	        }
//	        
//	        for(int i=0;i<group.length;i++) {
//	        	for(int j=0;j<group.length;j++) {
//	        		if(i==j)
//	        			continue;
//	        		else if(group[i]==group[j])
//	        			flag = true;
//	        	}
//	        }
//	     
	        boolean matches = matcher.matches();
	        
	        if(matches /* && flag == false*/)
	        	return 1;
	        else return 0;
	    }
	    
	    public static void main(String args[]) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the string and the pattern");
	    	String input = sc.nextLine();
	    	String pattern = sc.nextLine();
	    	
	    	int res = wordpattern(pattern,input);
	    	System.out.println(res);
	    	
	    	sc.close();
	    }
//	    public static void main(String[] args) throws IOException{
//	        Scanner in = new Scanner(System.in);
//	        // final String fileName = System.getenv("OUTPUT_PATH");
//	        final String fileName = "/Users/shivinkapur/Downloads/test_cases_omjs2ksa/input000.txt";
//	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//	        int res;
//	        String _pattern;
//	        try {
//	            _pattern = in.nextLine();
//	        } catch (Exception e) {
//	            _pattern = null;
//	        }
//	        
//	        String _input;
//	        try {
//	            _input = in.nextLine();
//	        } catch (Exception e) {
//	            _input = null;
//	        }
//	        
//	        res = wordpattern(_pattern, _input);
//	        bw.write(String.valueOf(res));
//	        bw.newLine();
//	        
//	        bw.close();
//	        in.close();
//	    }
}
