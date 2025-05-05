package patternPrinting;


/*
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */
public class Pattern1 {

	public static void main(String[] args) {
		int count=1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++,count++) {
				System.out.print(count+" ");
			}
			System.out.println();
		}
		
	}

}
