package dataTypes;

public class Arrays1 {

	public static void main(String[] args) {
		int[] arr1=new int[5];
		arr1[0]=1;
		arr1[1]=0;
		arr1[2]=2;
		arr1[3]=3;
		arr1[4]=4;
//		arr1[45]=4; //This throws ArrayIndexOutOfBoundsException
		
		//2nd way of initializing
		int[] arr2= {1,0,2,3,4};
		
		System.out.println(arr1[2]);
		System.out.println(arr2[2]);
		System.out.println();
		
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		String[] names= {"Swapnil","27","CSE"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		
		//for each loop
		for(String s:names) {
			System.out.println(s);
		}
		System.out.println();
		
		//In arr2, check and print only the numbers which are a multiple of 2 i.e.: 0,2,4..
		for(int i:arr2) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		//In arr1, check the numbers if atleast one of them should be a multiple of 2 i.e.
		for(int i:arr1) {
			if(i%2==0) {
				System.out.println(i);
				break;
			}else {
				System.out.println(i+" is not a multiple of 2");
			}
		}System.out.println();
		
		//print the contents of an array in the reverse order
		for(int i=names.length-1;i>=0;i--) {
			System.out.println(names[i]);
		}System.out.println();
		
		//count the total contents in an array without any pre defined functions
		int count=0;
		for(String str:names) {
			count++;
		}
		System.out.println(count+" is the total length of the array");
		System.out.println();
	}

}
