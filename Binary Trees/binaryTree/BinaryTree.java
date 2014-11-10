package binaryTree;


public class BinaryTree {
	private Node root; 
	  private static class Node
	  { 
	    	Node left; 
	    	Node right; 
	    	int data;
	    	Node(int newData)
	    	{ 
	    	  left = null; 
	    	  right = null; 
	    	  data = newData; 
	    	} 
	  }	 
	 	public BinaryTree()
	 	{ 
	    root = null; 
	  } 
	 	public boolean lookup(int data)
	 	{ 
	    return(lookup(root, data)); 
	 	}  
	  private boolean lookup(Node node, int data)
	  { 
	    	if (node==null)
	    	{ 
	    	  return(false); 
	    	}

	    	if (data==node.data)
	    	{ 
	    		return(true); 
	    	} 
	    	else if (data<node.data)
	    	{ 
	      		return(lookup(node.left, data)); 
	    	} 
	    	else
	    	{ 
	    	  return(lookup(node.right, data)); 
	    	} 
	 	} 
	 	public void insert(int data)
	 	{ 
	    root = insert(root, data); 
	  }  
	  private Node insert(Node node, int data)
	  { 
	    	if (node==null)
	    	{ 
	    	  node = new Node(data); 
	    	} 
	    	else
	    	{ 
	    		if (data <= node.data)
	    	  	{ 
	        		node.left = insert(node.left, data); 
	      		} 
	      		else
	      		{ 
	        		node.right = insert(node.right, data); 
	      		} 
	    	}
			return(node);
		} 
	  
	  //Problem 1
	  public void build123a()
	  {
	  	root=new Node(2);
	  	Node lchild=new Node(1);
	  	Node rchild=new Node(3);
	  	root.left=lchild;
	  	root.right=rchild;
	  }
	  public void build123b()
	  {
	  	root=new Node(2);
	  	root.left=new Node(1);
	  	root.right=new Node(3);
	  }
	  public void build123c()
	  {
	  	root=null;
	  	root=insert(root,2);
	  	root=insert(root,1);
	  	root=insert(root,3);
	  }
	  
	  //Problem 2- Compute the number of nodes in the tree
	  public int size()
	  {
	  	return size(root);
	  } 
	  private int size(Node node)
	  {
	  	if(node==null)
	  		return 0;
	  	else
	  	{
	  		return size(node.left)+1+size(node.right);
	  	}
	  }
	  
	  //Problem 3
	  public int maxDepth()
	  {
	  	return maxDepth(root);
	  }
	  private int maxDepth(Node node)
	  {
	  	if(node==null)
	  		return 0;
	  	else
	  	{
	  		return (Math.max(maxDepth(node.left),maxDepth(node.right)) + 1);
	  	}
	  }
	  
	  //Problem 4- Minimum data value
	  public int minValue()
	  {
	  	return minValue(root);
	  }
	  private int minValue(Node node)
	  {
	  	Node current=node;
	  	while(current.left!=null)
	  		current=current.left;
	  	return current.data;
	  }
	  
	  //Problem 5-Print tree-Inorder
	  public void printTree()
	  {
	  	printTree(root);
	  }
	  private void printTree(Node node)
	  {
	  	if(node==null)
	  		return;
	  	printTree(node.left);
	  	System.out.println(node.data+" ");
	  	printTree(node.right);
	  }
	  
	  //Problem 6-Postorder
	  public void printTree2()
	  {
	  	printTree2(root);
	  }
	  private void printTree2(Node node)
	  {
	  	if(node==null)
	  		return;
	  	printTree(node.left);
	  	printTree(node.right);
	  	System.out.println(node.data+" ");
	  }
	  
	  //Problem 7 
	  public boolean hasPathSum(int sum)
	  {
	  	return hasPathSum(root,sum);
	  }
	  private boolean hasPathSum(Node node,int sum)
	  {
	  	if(node==null)
	  	{
	  		if(sum==0)
	  			return true;
	  		else return false;
	  	}
	  	else
	  	{
	  		int subSum= sum - node.data;
	  		return (hasPathSum(node.left,subSum) || hasPathSum(node.right,subSum));
	  	}		
	  }
	  
	  //Problem 8- Print all paths
	  public void printPaths()
	  {
	  	int[] path=new int[1000];
	  	printPaths(root,path,0);
	  }
	  private void printPaths(Node node,int[] path,int pathLength)
	  {
	  	if(node==null)
	  		return;
	  	path[pathLength]=node.data;
	  	pathLength++;
	  	if(node.left==null)
	  		printArray(path,pathLength);
	  	else
	  	{
	  		printPaths(node.left,path,pathLength);
	  		printPaths(node.right,path,pathLength);
	  	}
	  }
	  private void printArray(int[] path,int pathLength)
	  {
	  	for(int i=0;i<pathLength;i++)
	  		System.out.println(path[i]+" ");
	  	System.out.println();
	  }
	  
	  //Problem 9-Mirror
	  public void mirror()
	  {
	  	mirror(root);
	  }
	  private void mirror(Node node)
	  {
	  	if(node!=null)
	  	{
	  		mirror(node.left);
	  		mirror(node.right);

	  		Node temp=node.left;
	  		node.left=node.right;
	  		node.right=temp;
	  	}
	  }
	  
	  //Problem 10- Double tree
	  public void doubleTree()
	  {
	  	doubleTree(root);
	  }
	  private void doubleTree(Node node)
	  {
	  	if(node!=null)
	  	{
	  		doubleTree(node.left);
	  		doubleTree(node.right);

	  		Node oldleft;
	  		oldleft=node.left;
	  		node.left=new Node(node.data);
	  		node.left.left=oldleft;
	  	}
	  }
	  
	  //Problem 11-Same tree
	  public boolean sameTree(BinaryTree other)
	  {
	  	return sameTree(root,other.root);
	  }
	  private boolean sameTree(Node a, Node b)
	  {
	  	if(a==null && b==null)
	  		return true;
	  	else if(a!=null && b!=null)
	  	{
	  		return (a.data==b.data
	  			&&	sameTree(a.left,b.left) 
	  			&&	sameTree(a.right,b.right));
	  	}
	  	else return false;
	  }
	  
	  //Problem 14- isBST?
	  public boolean isBST()
	  {
	  	return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	  }
	  private boolean isBST(Node node,int min, int max)
	  {
	  	if(node==null)
	  		return false;
	  	else
	  	{
	  		boolean leftOK=isBST(node.left,min,node.data);
	  		if(!leftOK)
	  			return false;
	  		boolean rightOK=isBST(node.right,node.data,max);
	  		return rightOK;
	  	}
	  }	  /*
	  Given a binary tree, a complete path is defined as a path from root to a leaf. The sum of all nodes on that path is defined as the sum of that path. Given a number K, you have to remove (prune the tree) all nodes which don’t lie in any path with sum>=k.

	  Note: A node can be part of multiple paths. So we have to delete it only in case when all paths from it have sum less than K.

	  Consider the following Binary Tree
	            1 
	        /      \
	       2        3
	     /   \     /  \
	    4     5   6    7
	   / \    /       /
	  8   9  12      10
	     / \           \
	    13  14         11
	        / 
	       15 

	  For input k = 20, the tree should be changed to following
	  (Nodes with values 6 and 8 are deleted)
	            1 
	        /      \
	       2        3
	     /   \        \
	    4     5        7
	     \    /       /
	      9  12      10
	     / \           \
	    13  14         11
	        / 
	       15 
	  */
	  public Node prune(Node root,int k)
	  {
	    int sum=0;
	    return prune(root,k,sum);
	  }
	  private Node prune(Node node,int k, int sum)
	  {
	    if(node==null)
	      return null;
	    int lsum=sum+node.data;
	    int rsum=lsum;

	    node.left=prune(node.left,k,lsum);
	    node.right=prune(node.right,k,rsum);

	    if(sum<k)
	    {
	      delete(node);
	      root=null;
	    }
	    return node;
	  }
	private void delete(Node node) {
		// TODO Auto-generated method stub
		
	}
	
	//LCA of a BST
	public Node lcabst(int p,int q)
	{
		 return lcabst(root,p,q);
		//lcabstiterative(root,p,q);
	}
	private Node lcabst(Node node,int p,int q)
	{
		if(node==null)
			return null;
		if(node.data>p && node.data>q)
			lcabst(node.left,p,q);
		if(node.data<p && node.data<q)
			lcabst(node.right,p,q);
		return node;
	}
	//iterative solution
	public Node lcabstiterative(Node node,int p,int q)
	{
		while(node!=null)
		{
			if(node.data>p && node.data>q)
				node=node.left;
			else if(node.data<p && node.data<q)
				node=node.right;
			else break;
		}
		return node;
	}
	
	// A function to do boundary traversal of a given binary tree
		void printBoundary (Node root)
		{
		    if (root!=null)
		    {
		        System.out.println(root.data);
		 
		        // Print the left boundary in top-down manner.
		        printBoundaryleft(root.left);
		 
		        // Print all leaf nodes
		        printLeaves(root.left);
		        printLeaves(root.right);
		 
		        // Print the right boundary in bottom-up manner
		        printBoundaryright(root.right);
		    }
		}
	
	// A simple function to print leaf nodes of a binary tree
	void printLeaves(Node root)
	{
	    if ( root!=null )
	    {
	        printLeaves(root.left);
	 
	        // Print it if it is a leaf node
	        if ( root.left==null  &&  root.right==null )
	        	System.out.println(root.data);
	 
	        printLeaves(root.right);
	    }
	}
	 
	// A function to print all left boundry nodes, except a leaf node.
	// Print the nodes in TOP DOWN manner
	void printBoundaryleft(Node root)
	{
	    if (root!=null)
	    {
	        if (root.left!=null)
	        {
	            // to ensure top down order, print the node
	            // before calling itself for left subtree
	        	System.out.println(root.data);
	            printBoundaryleft(root.left);
	        }
	        else if( root.right!=null )
	        {
	        	System.out.println(root.data);
	            printBoundaryleft(root.right);
	        }
	        // do nothing if it is a leaf node, this way we avoid
	        // duplicates in output
	    }
	}
	 
	// A function to print all right boundry nodes, except a leaf node
	// Print the nodes in BOTTOM UP manner
	void printBoundaryright(Node root)
	{
	    if (root!=null)
	    {
	        if ( root.right!=null )
	        {
	            // to ensure bottom up order, first call for right
	            //  subtree, then print this node
	            printBoundaryright(root.right);
	            System.out.println(root.data);
	        }
	        else if ( root.left!=null )
	        {
	            printBoundaryright(root.left);
	            System.out.println(root.data);
	        }
	       // do nothing if it is a leaf node, this way we avoid
	       // duplicates in output
	    }
	}
	
	// Reverse a binary tree
	void ReverseTree(Node root){
	    Node tmp = root.left;
	    root.left = root.right;
	    root.right = tmp;

	    if(root.left != null) ReverseTree(root.left);
	    if(root.right != null) ReverseTree(root.right);
	}
	
//	Given a binary tree where all the right nodes are leaf nodes, flip it upside down and turn it into a tree with left leaf nodes. 
//
//	Keep in mind: ALL right NODES IN ORIGINAL TREE ARE LEAF NODE.


	/* for example, turn these:
	 *
	 *        1                 1
	 *       / \                 / \
	 *      2   3            2   3
	 *     / \
	 *    4   5
	 *   / \
	 *  6   7
	 *
	 * into these:
	 *
	 *        1               1
	 *       /               /
	 *      2---3         2---3
	 *     /
	 *    4---5
	 *   /
	 *  6---7
	 *
	 * where 6 is the new root node for the left tree, and 2 for the right tree.
	 * oriented correctly:
	 *
	 *     6                   2
	 *    / \                   / \
	 *   7   4              3   1
	 *        / \
	 *       5   2
	 *            / \
	 *          3   1
	 */
	
	Node FlipTree ( Node root )
	{
	    if (root == null)
	        return null;
	    
	    // Working base condition
	    if( root.left == null && root.right == null) 
	    {
	        return root;
	    }
	    
	    Node newRoot = FlipTree(root.left);
	    
	    root.left.left = root.right;
	    root.left.right = root;
	    root.left = null;
	    root.right = null;
	    
	    return newRoot;
	}
	
}
