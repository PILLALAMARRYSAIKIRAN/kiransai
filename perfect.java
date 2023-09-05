class Perfect
{
public static void main(String [] args)
	{
	int num=6,start=1,sum=0;
	while(start<num)// 1<6  2<6 3<6 4<6 5<6 6<6
		{
		if(num%start==0)// 6%1==0  6%2==0 6%3==0
				{
			sum=sum+start;
			}
		start++;
		}
	if(sum==num)
	System.out.println(num + "is a perfect number");
	else
	System.out.println(num + "is a not perfect number");
}
}