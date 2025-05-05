package collectionsFramework;

import java.util.ArrayList;

public class ArrayList_OtherActions {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		
		//To add elements in Array list use add function
		arr.add("Swapnil");
		arr.add("Das");
		arr.add("27");
		arr.add("01/05/1997");
		
		System.out.println(arr);
		
		//To fetch any record from Arraylist
		System.out.println(arr.get(1));
		
		//To fetch the first record
		System.out.println(arr.getFirst());
		
		//To fetch the last record
		System.out.println(arr.getLast());
		
		//to check if an object is present in the arraylist
		boolean b=arr.contains("27");
		System.out.println("Does the element exist? "+b);
		
		b=arr.contains("271");
		System.out.println("Does the element exist? "+b);
		
		//Check the size of an arraylist
		System.out.println(arr.size());
		
		//check index of an object
		System.out.println("Index of Das is :"+arr.indexOf("Das"));
		
		//check if arraylist is empty
		System.out.println(arr.isEmpty());
		
		arr.clear();
		
		//check if arraylist is empty
		System.out.println(arr.isEmpty());
	}

}
