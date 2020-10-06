package singleresponsibilityprinciple;

public class SRService {

	public void addService(int c,int d)
	{
		System.out.println("Values in service "+(c+d));
		SRDao srDao = new SRDao();
		srDao.addDao(c+2, d+2);
	}
}
