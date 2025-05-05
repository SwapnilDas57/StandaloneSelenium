package patternPrinting;

public class Pattern5 {

	/*
	 * 1 2 3 4
	 * 1 2 3
	 * 1 2
	 * 1
	 */

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=4,count=1;j>=i;j--,count++) {
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}

}
