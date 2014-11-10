//Question given by Slideshare

package checkAccNo;

import java.util.Scanner;

public class acc_no {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an account number");
		int a=sc.nextInt();
		System.out.println("The account number is "+a);
		boolean b=isValid(a);
		if(b)
			System.out.println("The account number is valid");
		else
			System.out.println("The account number is not valid");
		int checkdigit=getFullAccountNumber(a);
		System.out.println("Add "+ checkdigit+ " to the account number to make it valid");
		sc.close();
	}
	public static int getFullAccountNumber(int acc_no)
	{
		String s = ""+ acc_no;
		int[] digit = new int[s.length()];
 
		for (int i = 0; i < s.length(); i++)
		{
			digit[i] = Character.digit(s.charAt(i), 10);
		}
		int sum=0;
		for(int i=0;i<digit.length;i++)
			sum+=digit[i];
		
		return 10-(sum%10);
	}
	public static boolean isValid(int acc_no)
	{
		String s = ""+ acc_no;
		int[] digit = new int[s.length()];
 
		for (int i = 0; i < s.length(); i++)
		{
			digit[i] = Character.digit(s.charAt(i), 10);
			System.out.print(digit[i]+" ");
		}
		System.out.println();

		//Step 1
		for(int i=0;i<digit.length;i=i+2)
		{
			digit[i]=digit[i]*2;
			if(digit[i]>9)
			{
				digit[i]=(digit[i]%10)+(digit[i]/10);
			}
		}
		for(int i=0;i<digit.length;i++)
			System.out.print(digit[i]+" ");
		System.out.println();

		//Step 2
		int sum=0;
		for(int i=0;i<digit.length;i++)
			sum+=digit[i];
		System.out.println(sum);

		//Step 3
		if(sum%10==0)
			return true;
		else return false;
	}
}
