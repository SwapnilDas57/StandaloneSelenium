package collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_AdditionOfElements {

	public static void main(String[] args) {
		
		ArrayList<String> arr=new ArrayList<String>();
		String str="Son";
		//To add elements in Array list use add function
		arr.add("Swapnil");
		arr.add("Das");
		arr.add("27");
		
		System.out.println(arr);
		
		//adding to a particular index
		arr.add(2, "MALE");
		System.out.println(arr);
		
		
		
		List<String> arr1=new ArrayList<String>();
		arr1.add("This");
		arr1.add("is");
		arr1.add("a");
		arr1.add("new");
		arr1.add("arraylist");
		
		System.out.println(arr1);
		
		//Appending one arraylist to another at the end
		arr.addAll(arr1);
		System.out.println(arr);
		
		///Appending one arraylist to another at specified index
		arr.addAll(11, arr1);
		System.out.println(arr);
		
		//If instead of 11, you give 12(which is the size of arraylist) in that case you will get IndexOutOfBoundsException
	}

}
