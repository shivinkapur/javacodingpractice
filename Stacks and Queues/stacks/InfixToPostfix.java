package stacks;

import java.util.Scanner;

public class InfixToPostfix {
	public static void main(String[] args)throws Exception
	{
		StackArray s=new StackArray(20);
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the infix expression ");
		String s1=sc.nextLine();
		String post="";
		char a[]=s1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(Character.isLetterOrDigit(a[i]))
				post+=a[i];
			else 
			{
				if(s.empty()||a[i]=='('||(preced(a[i])>preced((Character)s.peek())||a[i]=='^'))
				s.push(a[i]);
			    else if(a[i]==')')
			    {
				      while(!s.empty()&&(Character)s.peek()!='(')
					  post+=s.pop();
					  s.pop();
			    }
			    else
			    {
			    	while(!s.empty()&&(preced(a[i])<=preced((Character)s.peek())))
					post+=s.pop();
					s.push(a[i]);
			    }
			}
		}
		while(!s.empty())
			post+=s.pop();
		System.out.println(post);	
		sc.close();
	}
	static int preced(char op)
	{
		switch(op)
		{
			case '^':
			case '$':
				return 4;
			case '*':
			case '/':
			case '%':
				return 3;
			case '+':
			case '-':
				return 2;
			case '(':
			case ')':
				return 1;			
		}
		return 0;
	}
}
