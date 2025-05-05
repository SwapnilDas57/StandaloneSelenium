package StringPractice;

public class InsertStringIntoString {

	public static void main(String[] args) {

		String str="Arunima Ganguly";
		StringBuilder sb=new StringBuilder(str);
		
		sb.insert(8, "Swapnil ");
		
		System.out.println(sb);
		
	}

}
