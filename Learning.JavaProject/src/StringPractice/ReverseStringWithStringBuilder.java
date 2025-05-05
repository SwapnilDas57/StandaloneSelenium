package StringPractice;

public class ReverseStringWithStringBuilder {

	public static void main(String[] args) {
		String str="abcd";
		
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
	}

}
