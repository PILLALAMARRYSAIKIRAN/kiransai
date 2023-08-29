 class Main
{
	public static void main(String[] args) {
	    int bank_id=21021;
	    long account_no=229021000;
	    String name="varun";
	    int curr_blnc=30000;
	    int witdraw_amount=20000;
	    int loan_amount=1500;
	    int final_amount=(curr_blnc-witdraw_amount-loan_amount);
	    System.out.println("final_amount="+final_amount);
	}
}
