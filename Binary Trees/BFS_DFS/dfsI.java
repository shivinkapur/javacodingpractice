package BFS_DFS;
import java.util.*;

public class dfsI {
	public static void main(String agr[])throws Exception
	{
		Graph1 x=new Graph1(7,true);
		boolean v[]=new boolean[7];
		x.dfs(0,v);
	}
}

class Graph1
{
	boolean b[][];
	boolean directed;
	Graph1(int n,boolean direct)
	{
		b=new boolean [n][n];
		directed=direct;
		createGraph();
	}
	void createGraph()
	{
		char ch;
		do{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the edge name ");
			String s=sc.next();
			sc.close();
			s=s.toUpperCase();
			int x=s.charAt(0)-65;
			int y=s.charAt(1)-65;
			b[x][y]=true;
			if(!directed)
				b[y][x]=true;
			System.out.println("Enter y to continue ");
			ch=sc.next().charAt(0);	
		}while(ch=='y');
	}
	void dfs(int s,boolean v[])throws Exception
	{
		Stack<Integer> st=new Stack<Integer>();
		v[s]=true;
		st.push(s);
		System.out.print((char)(s+65));
		while(!st.empty())
		{
			int j;
			s=(Integer)(st.peek());
			for(j=0;j<b.length;j++)
			{
				if(b[s][j] && !v[j])
				{
					v[j]=true;
					System.out.println((char)(j+65));
					st.push(j);
					break;
				}
			}
			if(j==b.length)
			st.pop();
		}	
	}
}