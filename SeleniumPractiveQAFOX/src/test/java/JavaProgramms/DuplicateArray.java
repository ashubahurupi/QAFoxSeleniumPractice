package JavaProgramms;

public class DuplicateArray {
	
	
	public static void main(String[] args) {
		
		int []arr= {12,23,65,32,54,23,65};
	   
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate arrays are :"+arr[i]);
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
