package collectionsFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(0);
		lst.add(1);
		lst.add(3);
		lst.add(4);
		lst.add(4);
		lst.add(2);
		lst.add(2);
		System.out.println(lst);
		//filter-> filters the result based on the condition given in the lambda expression
		
		Stream<Integer> lstStream=lst.stream();
		List<Integer> newList=lstStream.filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		//Map-> Map performs some action on a stream based on the predicate you share in the lambda expression
		
		List<Integer> updatedList=newList.stream().map(x->x/2).collect(Collectors.toList());
		System.out.println(updatedList);
		
		//distinct()-> stores on distinct values in the stream
		
		List<Integer> distinctList=updatedList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctList);
		
		//sorted()-> sorts the stream
		List<Integer> sortedList=distinctList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		//sorted()-> sorting in descending order
		//(a,b)->(a-b)-> this in sorted() method gives ascending order sorting(also this is the default)
		//(a,b)->(b-a)-> this in sorted() method gives descending order sorting
		List<Integer> descendingSortedList=sortedList.stream().sorted((a,b)->(b-a)).collect(Collectors.toList());
		System.out.println(descendingSortedList);
		
		//limit(2)-> limits the output with only starting two elements
		List<Integer> limitedDescendingSortedList=descendingSortedList.stream().limit(2).collect(Collectors.toList());
		System.out.println(limitedDescendingSortedList);
		
		//skip(1)-> skips the first element in the stream from the beginning
		List<Integer> skippedLimitedDescendingSortedList=limitedDescendingSortedList.stream().skip(1).collect(Collectors.toList());
		System.out.println(skippedLimitedDescendingSortedList);
	}

}
