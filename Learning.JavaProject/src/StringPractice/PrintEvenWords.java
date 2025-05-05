package StringPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenWords {

	public static void main(String[] args) {
		
		
		String str="i am Geeks for Geeks and a Geek";
		
		List<String> lst=Arrays.asList(str.trim().split(" ")).stream().filter(x->x.length()%2==0).collect(Collectors.toList());
		System.out.println(lst);
	}

}
