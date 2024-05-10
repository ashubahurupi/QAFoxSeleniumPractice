package CompareStrings;

import java.util.Scanner;

public class compareString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str1 =sc.nextLine();
		System.out.println("Enter First string");
		String str2 =sc.nextLine();
		System.out.println("enter 2nd String");
		
		compareUsingEquals( str1, str2);
		compareUsingEqualIgnores(str1, str2);
	}
	
	public static void compareUsingEquals(String str1, String str2)
	{
		if(str1.equals(str2))
		{
			System.out.println("Both the String Values are Equals> compareUsingEquals");
		}
		
	}
	
	public static void compareUsingEqualIgnores(String str1, String str2)
	{
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Both the String Values are Equals> compareUsingEqualIgnores");
		}
		
	}
	
	
}
