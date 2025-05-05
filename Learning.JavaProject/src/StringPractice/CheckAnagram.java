package StringPractice;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		String s1="abcd";
		String s2="dabc";
		
		char[] sa1=s1.toCharArray();
		char[] sa2=s2.toCharArray();
		
		System.out.println("Both strings are anagram? "+CheckAnagram.checkAnagram(sa1, sa2));
	}

	public static boolean checkAnagram(char[] sa1, char[] sa2) {
		
		if(sa1.length!=sa2.length) {
			return false;
		}
		
		Arrays.sort(sa1);
		Arrays.sort(sa2);
		
		for(int i=0;i<sa1.length;i++) {
			if(sa1[i]!=sa2[i]) {
				return false;
			}
		}
		
		return true;
	}
}
