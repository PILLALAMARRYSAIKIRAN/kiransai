class Shopping
	 {
	public static void main(String[] args)
    {
	String store="amazon";
	String item="shoes";
	int mrp=2500;
	double discount=50;
	double with_discount_price=mrp-(50.0/100*mrp);
        int shipping_charges=150;
	int cancellation_fee=500;
	int gst=80;
	System.out.println("store : " + store);
	System.out.println("item : " + item);
	System.out.println("Mrp : "+mrp);
	System.out.println("discount : "+ discount);
	System.out.println("with_discount_price :"+with_discount_price);
	double total_price=with_discount_price+shipping_charges+cancellation_fee+gst;
	System.out.println("Total_price :"  + total_price); 
	}
}