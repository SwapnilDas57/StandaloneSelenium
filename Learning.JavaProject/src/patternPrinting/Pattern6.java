package patternPrinting;

public class Pattern6 {
/*
 *			1  -> 3 tabs before this 
 *		2		2 -> 2 tabs before this
 *	3		3		3 -> 1 tab before this
 *4		4		4		4 -> 0 tab before this
 */
	
	
	public static void main(String[] args) {
		for(int row=1;row<=4;row++) {
			int tabCount=4;
			for(int digitCount=1;digitCount<=row;digitCount++) {
				while(tabCount>row) {
					System.out.print("\t");
					tabCount--;
				}
				System.out.print(row);
				System.out.print("\t");
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
