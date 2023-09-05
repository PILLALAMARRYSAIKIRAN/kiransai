class Fact 
{
    public static void main(String[] args)
 {
	int num=5,count=0;
	int start=num;
	while(start>=1)
	{
	if(num%start==0)
	{
	count++;
	}
	start--;
	}
	System.out.println(count);
	if(count==2)
	{
	System.out.println(num + "is prime numbers");
	}
	else
	{
	System.out.println(num + "is not prime number");
	}
}
}
