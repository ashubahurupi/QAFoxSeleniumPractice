package JavaProgramms;

public class StringDemoOne {
	
	
	private static final String[] CharAt = null;

	public static void main(String[] args) {
		
		String str="Ashish Bahurupi";
		
		char[] ch = str.toCharArray();
		
		String rev="";
		
		for(int i=ch.length-1; i>=0; i--)
		{
			
			rev=rev+str.charAt(i);
		}
		
		
		System.out.println(rev);
		
	}

}
