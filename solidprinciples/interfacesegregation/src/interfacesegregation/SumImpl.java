package interfacesegregation;

public class SumImpl implements Sum,Div {

	@Override
	public void add(int a, int b) {
		
System.out.println("sum is "+(a+b));
	}

	@Override
	public void div(int a, int b) {
		System.out.println("Quotient is "+ (a/b));
		
	}

}
