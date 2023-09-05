class  Div
	{
          public static void main(String args[])
	{
	String name="bottle";
	int code=1234;
	int price=500;
	int qty=4;
	double total=price*qty;
	double discount;
	System.out.println("name");
	System.out.println("total:  " total);
	if(total>2000)
	{
	discount=15/100.0*total;
	System.out.println("discount:  "+discount)
	}
	else(total<2000)
	{
	discount=5/100.0*total;
	System.out.println("discount  :" +discount);
}
}
}