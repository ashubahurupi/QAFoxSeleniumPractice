package QaFoxPracticalDemo;

import java.util.ArrayList;

public class AddarrayInList {
	
	public static void main(String[] args) {
		
		// Store String Values 
//		ArrayList<String> alist=new ArrayList<String>();
//		alist.add("Ashish");
//		alist.add("Bahurupi");
//		alist.add("QA Engineer");
//		
//		System.out.println(alist);
//		

		// Store Double Values 
		ArrayList<Double> alist1=new ArrayList<Double>();
		
		alist1.add(10.40);
		alist1.add(52.45);
		alist1.add(20.12);
		alist1.add(45.20);
		
		System.out.println(alist1);
		
		//Retrive the Value on basis of Index
		
		System.out.println(alist1.get(0));
		System.out.println(alist1.get(1));
		System.out.println(alist1.get(2));
		System.out.println(alist1.get(3));
		
	}

}
