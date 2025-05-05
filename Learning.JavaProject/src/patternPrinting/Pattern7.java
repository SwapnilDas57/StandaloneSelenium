package patternPrinting;

public class Pattern7 {

/*
 * 1 2 3 4
 * 	2 3 4
 *   3 4
 *    4	
 */
	
	
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<=4;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
