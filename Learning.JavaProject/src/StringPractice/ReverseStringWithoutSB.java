package StringPractice;

import java.util.Arrays;

public class ReverseStringWithoutSB {

	public static void main(String[] args) {
		String s="Swapnil";
		String newString="";
		
		
		
		
		for(int i=s.length()-1;i>=0;i--) {
			newString=newString+s.charAt(i);
		}
		
		System.out.println(newString);
	}

}
