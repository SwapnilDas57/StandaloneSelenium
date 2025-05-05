package interfaceDemo;

public class AustralianTraffic implements CentralTraffic, ContinentTraffic{
//One class, can implement multiple interfaces
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a=new AustralianTraffic();
		a.greenGo();
		a.redStop();
		a.beReadyYellow();
		
		ContinentTraffic ct=new AustralianTraffic();
		ct.greenGo();
		ct.ContinentRule();
		
		AustralianTraffic at=new AustralianTraffic();
		at.classMethod();
		
		
		
	}

	@Override
	public void greenGo() {
		System.out.println("Go");
	}

	@Override
	public void redStop() {
		System.out.println("Stop");		
	}

	@Override
	public void beReadyYellow() {
		System.out.println("Be ready");
	}
	
	public void classMethod() {
		System.out.println("Class level method");
	}

	@Override
	public void ContinentRule() {
		System.out.println("Continent Rules");
	}
}
