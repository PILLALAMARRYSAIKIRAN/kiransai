class Month
{
	public static void main(String args[])
	{
	int month=2 ,year=2012;
	if(month==2&&year%4==0||year%400==0)
	{
		System.out .println(month +  "month having 29 days");
	}
	else if(month==2)
	{
	System.out.println(month + "month having 28 days");
	}
	else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
	{
	System.out.println(month  +  "month having 31 days");
	}
	else
	{
	System.out.println(month + " month having 30 days");
	}
}	
