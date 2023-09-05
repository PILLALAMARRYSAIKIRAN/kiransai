class Super
{
public static void main(String [] args)
	{
	int num=6,start=1,count=0;
	while(start<=num)
-		{
		if(num%start==0)
				{
			count++;
			}
		start++;
		}
	if(count==2)
	System.out.println(num + "is a prime number");
	else
	System.out.println(num + "is a not prime number");
}
}

	

