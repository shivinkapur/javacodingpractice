package removeVovels;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		String s1= removeVowels(s);
		System.out.println(s1);
		sc.close();
	}
	public static String removeVowels(String s) {
		StringBuilder snew= new StringBuilder();
		char a[]= s.toCharArray();
		
		for(int i=0;i<a.length;i++){
			if(a[i]!='a' && a[i]!='e' && a[i]!='i' && a[i]!='o' && a[i]!='u' && a[i]!='A' && a[i]!='E' && a[i]!='I' && a[i]!='O' && a[i]!='U')
				snew.append(a[i]);
		}
		String sfinal = snew.toString();
		return sfinal;
	}
}
