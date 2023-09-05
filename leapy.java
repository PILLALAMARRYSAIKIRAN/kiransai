class Leaprange
{
	public static void main(String[] args) 
	{
	    int i=1947;
	while(i<=2024)
	if(year%4==0&&year%100!=0||year%400==0)
     	{
		System.out.println(year + " is a leap year");
	}
	else
	{
	System.out.println(year + "is not a leap year");
	    }
		i++;
	}
}
