class Leaprange
{
	public static void main(String[] args) 
	{
	    int i=1947,y=0;
	while(i<=2024)
	{
	if(i%4==0&&i%100!=0||i%400==0)
     		{
		System.out.println(i + " is a leap year");
		y++;
		System.out.println(y);
		}
		else
		{
	   	 }
		i++;
		}
	}
}
