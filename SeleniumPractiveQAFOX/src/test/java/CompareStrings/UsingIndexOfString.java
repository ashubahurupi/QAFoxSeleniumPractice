package CompareStrings;

import java.util.Scanner;

public class UsingIndexOfString {
	
	public static void main(String []args)
	{
		String str="I love Java Programming";
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Any Text");
		String userInput=scanner.nextLine();
		System.out.println("enter the Text");		
		int index = str.indexOf(userInput);
		System.out.println(index);
		
		if(index!=-1)
		{
			System.out.println("Input Text or Chars found the String");
		}
		else
		{
			System.out.println("Input Text or Chars not found the String");
		}
	}

}
