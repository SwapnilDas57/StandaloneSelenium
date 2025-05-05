package arrayPracticeCode;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String args[]) {
		int[] arr= {4,2,3,3,7};
		
		arr=RemoveDuplicatesFromSortedArray.sortedArray(arr);
		
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	public static int[] sortedArray(int[] arr) {
		int temp=-1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		return arr;
	}
	
	public static int[] removeDuplicates(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;i<arr.length;j++) {
				if(arr[i]==arr[j]) {
					
				}
			}
		}
		
		
		return arr;
	}
}
