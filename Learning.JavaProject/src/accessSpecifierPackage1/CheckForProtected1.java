package accessSpecifierPackage1;

public class CheckForProtected1 {
	
	protected int i=10;
	
	public static void main(String[] args) {
		CheckForProtected1 cp=new CheckForProtected1();
		System.out.println(cp.i);
	}

}
