package accessSpecifierPackage2;
//import accessSpecifierPackage1.CheckForProtected1;

import accessSpecifierPackage1.CheckForProtected1;

public class CheckForProtected2 extends CheckForProtected1{
	public static void main(String[] args) {
		CheckForProtected2 cp=new CheckForProtected2();
		//The below line throws an error as this variable is protected access specifier. which means it is not present outside package.
		//Protected does not allow 
		//System.out.println(cp.i);
		
		//lets you see the variable as part of child class, not parent class as this is protected
		System.out.println(cp.i);
	}

}
