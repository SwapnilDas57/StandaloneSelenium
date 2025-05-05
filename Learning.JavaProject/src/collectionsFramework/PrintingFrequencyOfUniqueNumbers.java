package collectionsFramework;

import java.util.ArrayList;

public class PrintingFrequencyOfUniqueNumbers {
//program to print the unique numbers with their frequencies
	public static void main(String[] args) {
		int arr[]= {1,1,2,3,2,4,3,4,5,7,8,9,8};
		
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			
			//As we take each element of the array and compare its uniqueness, we will push it to the 
			//ArrayList so that we can mark it as already checked. 
			//Once we reach that number again in the Array, we can simply skip it. 
			//This if check means, if the number has not already been pushed into the Arraylist
			if(!arrList.contains(arr[i])) {
				//At the very beginning, push this number to the Arraylist to mark it as already visited
				arrList.add(arr[i]);
				//increase counter by 1, as you are currently in the first occurrence of the number
				count++;
				//Check from the next element till the end of the array
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
					}
				}
				System.out.println(arrList.get(arrList.size()-1)+"-"+count);
				if(count==1) {
					System.out.println(arrList.get(arrList.size()-1)+" is a unique number");
				}
			}
			
		}
	}

}
