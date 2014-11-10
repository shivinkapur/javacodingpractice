package stacks;

import java.util.Stack;

public class reverseStack {
	public static void revertStack(Stack<Integer> s) 
	{ 
		if (s.isEmpty()) { 
			return; 
		} else { 
			Integer a = s.pop(); 
			revertStack(s); 
			appendStack(s, a); 
		} 
	} 

	public static void appendStack(Stack<Integer> s, Integer a) 
	{ 
		if (s.isEmpty()) { 
			s.push(a); 
			return; 
		} else { 
			Integer o = s.pop(); 
			appendStack(s, a); 
			s.push(o);
		} 
	}
	public static void main(String args[])
	{
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		revertStack(s);
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
	}
}
