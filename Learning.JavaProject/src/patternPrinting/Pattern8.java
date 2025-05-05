package patternPrinting;

public class Pattern8 {
	
//	Pascals triangle formula-> n!/(n-r)!r!

	/* Pascal's triangle
	 *    1
	 *   1 1
	 *  1 2 1
	 * 1 3 3 1
	 */
	
	public long factorial(long digit) {
		if(digit==0)
			return 1;
		else
			return digit*factorial(digit-1);
	}
	
	
	public static void main(String[] args) {
		Pattern8 p=new Pattern8();
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" "+
						p.factorial(i)/(p.factorial(i-j)*p.factorial(j))
						);
			}
			System.out.println();
		}
		
		
		
	}

}
