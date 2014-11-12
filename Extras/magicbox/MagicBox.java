package magicbox;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class MagicBox {
//	public static void main(String args[] ) throws Exception {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
//        
//        Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//        int res;
//        int int1;
//        try {
//            int1 = in.nextInt();
//        } catch (Exception e) {
//            int1 = 0;
//        }
//
//        int int2;
//        try {
//            int2 = in.nextInt();
//        } catch (Exception e) {
//            int2 = 0;
//        }
//
//        res = magicbox(int1, int2);
//        bw.write(String.valueOf(res));
//        bw.newLine();
//
//        bw.close();
//        in.close();
//    }

	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter two integers");
    	int i = sc.nextInt();
    	int j = sc.nextInt();
    	
    	int res;
    	char[][] matrix = new char[i+1][j+1];
    	
    	int rows = 0; 
    	while(rows<=i ) {
    		String input = sc.nextLine();
    		char[] input_row = input.toCharArray();
//			if(input_row.length != j)
//				System.out.println("Input length not equal to number of columns");
    		int col = 0;
    		for(char ch: input_row) { 
    			matrix[rows][col] = ch;
    			col++;
    		}
    		rows++;
    	}
    	
    	for(int x=0;x<matrix.length;x++) {
    		for(int y=0;y<matrix[0].length;y++) {
    			System.out.print(matrix[x][y]);
    			}
    		System.out.println();
    	}
    	
    	res = magicbox(matrix,j);
    	System.out.println(res);
    	sc.close();
    }

	private static int magicbox(char[][] matrix, int col) {
		// TODO Auto-generated method stub
		int max = 1;
		magic(matrix,col,max);
		
		return max;
	}

//	private static int magic(char[][] matrix, int col, int max_ref) {
//		// TODO Auto-generated method stub
//		int res,max_ending_here;
//		for(int i = 1; i < col; i++)
//		    {
//		        res = magic(matrix, i, max_ref);
//		        if (matrix[i] < matrix[n-1] && res + 1 > max_ending_here)
//		            max_ending_here = res + 1;
//		    }
//		if (max_ref < max_ending_here)
//		       max_ref = max_ending_here;
//		
//		return max_ending_here;
//	}
	
	

//	int _lis( int arr[], int n, int *max_ref)
//	{
//	    /* Base case */
//	    if(n == 1)
//	        return 1;
//	 
//	    int res, max_ending_here = 1; // length of LIS ending with arr[n-1]
//	 
//	    /* Recursively get all LIS ending with arr[0], arr[1] ... ar[n-2]. If 
//	       arr[i-1] is smaller than arr[n-1], and max ending with arr[n-1] needs
//	       to be updated, then update it */
//	    for(int i = 1; i < n; i++)
//	    {
//	        res = _lis(arr, i, max_ref);
//	        if (arr[i-1] < arr[n-1] && res + 1 > max_ending_here)
//	            max_ending_here = res + 1;
//	    }
//	 
//	    // Compare max_ending_here with the overall max. And update the
//	    // overall max if needed
//	    if (*max_ref < max_ending_here)
//	       *max_ref = max_ending_here;
//	 
//	    // Return length of LIS ending with arr[n-1]
//	    return max_ending_here;
//	}
	
	
//	private static int magicbox(int i, int j) {
//		// TODO Auto-generated method stub
//		char[][] matrix = new char[i][j];
//		for(int r=0; r<i; r++) {
//			 for (int c=0; c<j; c++) {
//			     if((r+c)%2 == 0)
//			    	 matrix[r][c] = 'T';
//			     else matrix[r][c] = 'P';
//			     System.out.print(matrix[r][c]);
//			 }
//			 System.out.println();
//		}
//		
//		return 0;
//	}
}
