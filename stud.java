class Stud
{
	public static void main(String args[])
	{
		String empname="saikiran";
		int basicsal=25000;
		double ta=15/100.0*basicsal;
		double da=12/100.0*basicsal
		double hra=19/100.0*basicsal
		double pf,tax;
		double totalsal=basicsal+ta+da+hra;
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
		System.out.println(totalsal);
		grosssal=totalsal-pf-tax;
		System.out.println("finalsal=" grosssal);
		System.out.println("per annum="+ 12*grosssal)
		}	
}