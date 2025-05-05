package patternPrinting;

import java.util.Scanner;

public class Pattern2 {

	/*
	 * 10 9 8 7 -> row 1 
	 * 6 5 4
	 * 3 2
	 * 1
	 */
	
	public static void main(String[] args) {
		System.out.println("Enter the number of rows you want to be printed");
		Scanner sc= new Scanner(System.in);
		int rowCount=sc.nextInt();
		sc.close();
		
		int count=10;
		for(int i=0;i<=rowCount;i++) {
			for(int j=rowCount;j>i;j--, count--) {
				System.out.print(count+" ");
			}
			System.out.println();
		}
		
		
	}

}
