package collectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Arunima");
		hm.put(2, "Swapnil");
		hm.put(3, "Bholu Ganguly");
		
		System.out.println("I love "+hm.get(3));
		
		//If you try to fetch value for a key which is not present in the HashMap
		System.out.println("Key not present: "+hm.get(50));
		
		//Convert HashMap to set interface
		Set st=hm.entrySet();
		Iterator itr=st.iterator();
		
		while(itr.hasNext()) {
			Map.Entry mp=(Map.Entry)itr.next();
			
			System.out.println("Key: "+mp.getKey());
			System.out.println("Value: "+mp.getValue());
		}
	}

}
