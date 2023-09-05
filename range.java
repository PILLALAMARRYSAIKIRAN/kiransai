class Range
{
public static void main(String args[])
{
int a=10;
if (a>=0&&a<=9)//10>9//false
System.out.println("single");
else if(a>=10&& a<=99)//10>=10//true//double
System.out.println("double");
else if(a>=100&& a<=999)
System.out.println("3 digit");
else
System.out.println("4 digit");
}
}
