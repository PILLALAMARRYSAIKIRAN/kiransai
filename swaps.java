class Sp
{
   public static void main(String args[])
	{
	int a=20,b=10,c=30;
	if (a > b)
{
    int temp = a;
    a = b;
    b = temp;
}

if (b > c)
{
    int temp = b;
    b = c;
    c = temp;
}


if (a > b)
{
    int temp = a;
    a = b;
    b = temp;
}
System.out.println(a + " " + b + " " + c);
}
}
	
	