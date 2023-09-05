 class Main
{
	public static void main(String[] args) 
	{
	    int emp_id=1012;
	    String name="kiran";
	    String emp_dept="hrd";
	    int emp_salary=15000,tax=200,pf=1800,bonus=917;
	    double ta=10.0/100*emp_salary;
	    double da=(15.0/100)*emp_salary;
	    double Hra=(20.0/100)*emp_salary;
	    double spl_allowance;
	    spl_allowance=ta+da+Hra;
	    System.out.println("emp salary="+emp_salary);
	    System.out.println("ta="+ta);
	    System.out.println("da="+da);
	    System.out.println("Hra="+Hra);
	    System.out.println("spl_allowance="+spl_allowance);
	    double gross_salary=emp_salary+spl_allowance;
		System.out.println("gross_salary)="+gross_salary);
		double monthly_salary=(gross_salary+bonus-pf-tax);
		System.out.println("monthly_salary="+monthly_salary);
	}
}