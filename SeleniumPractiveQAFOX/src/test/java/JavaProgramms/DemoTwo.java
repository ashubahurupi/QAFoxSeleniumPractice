package JavaProgramms;

public class DemoTwo {
	
	
	public static void main(String[] args) {
//	      String str="Ashish";
//	      char ch []=str.toCharArray();
//	      String rev="";
//	      for (int i=ch.length-1; i>=0; i--)
//	      {
//	        rev=rev+str.charAt(i);
//	      }
//	      
//	      System.out.println(rev);
		
	 String name = "Ashish";
	 StringBuffer sb=new StringBuffer(name);
	 StringBuffer newname = sb.reverse();
		
		System.out.println(newname);
		
	  }

}
