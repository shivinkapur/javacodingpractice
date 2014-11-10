package BFS_DFS;

import java.util.*;

class Graph
{
	boolean b[][];
	boolean directed;
	Graph(int n,boolean direct)
	{
		b=new boolean [n][n];
		directed=direct;
		createGraph();
	}
	void createGraph()
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Enter the edge name ");
			String s=sc.next();
			s=s.toUpperCase();
			int x=s.charAt(0)-65;
			int y=s.charAt(1)-65;
			b[x][y]=true;
			if(!directed)
				b[y][x]=true;
			System.out.println("Enter Y to continue ");
			ch=sc.next().charAt(0);	
		}while(ch=='Y');
		sc.close();
	}
	void dfs(int s,boolean v[])throws Exception
	{
		v[s]=true;
		System.out.print((char)(s+65));
		for(int j=0;j<b.length;j++)
		{
			if(b[s][j] && !v[j])
				dfs(j,v);
		}
	}	
}
class dfsR
{
	public static void main(String agr[])throws Exception
	{
		Graph x=new Graph(7,true);
		boolean v[]=new boolean[7];
		x.dfs(0,v);
	}
}