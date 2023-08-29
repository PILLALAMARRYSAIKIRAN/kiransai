class  Swap
	{
          public static void main(String args[])
	{
	int a=10,b=2;
	System.out.println(a+"   "+b);
	if(a%b==0)
	{
	a=a+b;
	b=a-b;
	a=a-b;	
	}
	System.out.println(a+"   "+b);
	}
}