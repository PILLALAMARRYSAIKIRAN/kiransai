class Emp
{
	public static void main(String args[])
	{
		String empname="saikiran";
		int basicsal=25000;
		double ta=15/100.0*basicsal;
		double da=12/100.0*basicsal;
		double hra=19/100.0*basicsal;
		double pf,tax,grosssal;
		double totalsal=basicsal+ta+da+hra;
		System.out.println(totalsal);
		if(totalsal>40000)
		{
		pf=11/100.0*basicsal;
		tax=5/100.0*basicsal;	
		}
		else
		{
		pf=7/100.0*basicsal;
		tax=2.5/100.0*basicsal;
		}
		grosssal=totalsal-pf-tax;
		System.out.println(ta);
		System.out.println(da);
		System.out.println(hra);
		System.out.println(grosssal);
		System.out.println(grosssal*12);
		}	
}