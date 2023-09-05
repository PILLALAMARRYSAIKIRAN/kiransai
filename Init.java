class Init
	{
   	 public static void main(String[] args)
 	{
	int x=4,count=0;
	int initial=1;
	while(initial<=x)//1<=4//2<4//3<=4//4<=4//5<=4
	{
	if(x%initial!=0)
	{
	count++;
}
initial++;
}
System.out.println(count);
System.out.println(initial);
}
}
	