package opencllosedprinciple;

public class FindSumImpl extends FindSum {
	
	public void diff(int a,int b)
	{
		super.sum(a, b);
		System.out.println("difference is " +(b-a));
	}

}
