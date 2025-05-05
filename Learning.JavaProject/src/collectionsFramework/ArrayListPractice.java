package collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<String>();
		
		
		//Additions to ArrayList
		arrList.add("Swapnil");//index 0
		arrList.add("Das");//index 1
		arrList.add("Arunima");//index 2
		arrList.add("Ganguly");//index 3
		
		//Printing the arraylist before addition in between
		System.out.println("Before addition in Between");
		System.out.println(arrList);
		
		//Adding value in between an ArrayList
		arrList.add(2,"Weds");
		
		//Printing the arraylist after addition in between
		System.out.println("After addition in Between");
		System.out.println(arrList);
		//Removing values from a specific index in an ArrayList
		arrList.remove(1);
		
		//Printing the arraylist after removal in between
		System.out.println("After removal in Between");
		System.out.println(arrList);
		//Removing using Objects
		arrList.remove("Ganguly");
		
		//Printing the arraylist after removal in between
		System.out.println("After removal using Object");
		System.out.println(arrList);
		
		//Trying to remove if the index is not present:
		//arrList.remove(10); //Throws IndexOutOfBoundsException
		
		//Trying to remove an Object which is not present in the ArrayList
		arrList.remove("Sushmita"); //--> doesn't throw any exception
		System.out.println("After removal using Object which is not present in the Arraylist, doesn't throw any exception or error, but returns false when called and stored in boolean");
		System.out.println(arrList); 
		
		//but if we capture the return type and store it in a boolean, we can see that it returns false
		if(arrList.remove("Sushmita")) {
			System.out.println("String was present in the arraylist");
		}else {
			System.out.println("String not present in the arraylist");
		}
		
		//To get something from the arrayList
		//Fetch the value present in the second index:
		System.out.println("Fetching object which is present at index 2");
		System.out.println(arrList.get(2));
		
		//fetch all the values present in the arraylist one by one
		System.out.println("Fetching all the objects in the arraylist");
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i)+" ");
		}
		
		//Check if a particular string is present in an ArrayList or not
		System.out.println("Is the string \"Sushmita\" present in the ArrayList? "+arrList.contains("sushmita"));
		
		//Check index of an object in an arraylist
		System.out.println("Index of Swapnil in the arraylist: "+arrList.indexOf("Swapnil"));
		
		
		//If object is not present in the ArrayList indexOf method returns -1
		//Check index if the object is not present in the arrayList
		System.out.println("Index of Sushmita in the arraylist: "+arrList.indexOf("Sushmita"));
		
		//check index if the object is present twice in the ArrayList
		arrList.add("Weds");
		System.out.println(arrList);
		//Always returns the first occurrence of the object in the ArrayList
		System.out.println("Index of Weds in the arraylist: "+arrList.indexOf("Weds"));
		
		//Check if an Arraylist is empty
		System.out.println("Is the arraylist empty? "+arrList.isEmpty());
		
		//Declaring an Array to convert it later into an ArrayList
		String[] arr= {"Swapnil","Weds","Arunima"};
		//Arrays.asList(Arr) typecasts the array to arrayList but doesnt change the data structure permanently.
		//When you try to perform any list operations in it, it throws UnsupportedOperationException 
		List<String> lst=Arrays.asList(arr);
		//lst.remove(1);
		System.out.println(lst);
		//To resolve this, use below:
		List<String> lst1=new ArrayList<String>(Arrays.asList(arr));
		lst1.remove(0);
		System.out.println(lst1);
		
	}

}
