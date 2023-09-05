class  Product
	{
          public static void main(String args[])
	{
	String name="bottle";
	int code=1234;
	int price=400;
	int qty=4;
	double total=price*qty;
	double discount;
	System.out.println("name : " + name);
	System.out.println("code :" + code);
	System.out.println("price :" + price);
	System.out.println("qty :" + qty);
	System.out.println("total :  "+ total);
	if(total>2000)
	{
	discount=15/100.0*total;
	System.out.println("discount : " +discount);
	}
	else
	{
	discount=5/100.0*total;
	System.out.println("discount :" +discount);
	}
}
}