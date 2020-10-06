package singleresponsibilityprinciple;

public class SRController {
	
	public void addController(int a,int b)
	{
		System.out.println("Adding values in controller " +(a+b));
		SRService src = new SRService();
		src.addService(a+3, b+3);
	}

}
