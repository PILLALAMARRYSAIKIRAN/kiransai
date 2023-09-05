class Table
{
public static void main(String args[])
	{
	int n=7,i=30,m=0;
	while(1<=i)
		{
		m=n*i;
	System.out.println(n+ " * " + i + " = " + m);
		i--;
		if (m%13==0)
		{
		System.out.println("multiple divisible by 13");
		m++;
		}
		}
	}
}