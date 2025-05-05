package collectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		
		
		//adding elements in HashSet
		hs.add("Swapnil");
		hs.add("Weds");
		hs.add("Arunima");
		
		//print
		System.out.println(hs);
		
		//Trying to add duplicate value
		hs.add("Weds");
		System.out.println(hs);
		
		//But add method returns boolean, so we can use that to check if duplicate value is being added
		if(hs.add("Swapnil")) {
			System.out.println("added");
		}else {
			System.out.println("Duplicate value");
		}
		
		if(hs.contains("Arunima")) {
			System.out.println("Contains: true");
		}
		
		if(!hs.isEmpty())
			System.out.println("Not Empty");
		
		System.out.println(hs.size());
		
		Iterator<String> itr=hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next()); ///throws no such element exception if no more next elements present
		}
	}

}
