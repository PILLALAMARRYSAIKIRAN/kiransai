class Super
{
public static void main(String [] args)
	{
	int num=3,start=1,count=0;
	while(start<=num)
		{
		if(num%start==0)
				{
			count++;
			}
		start++;
		}
	System.out.println(count);
	if(count==2)
	System.out.println(num + "is a super number");
	else
	System.out.println(num + "is a not super number");
}
}