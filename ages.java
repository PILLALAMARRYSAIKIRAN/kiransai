class Main
{
	public static void main(String[] args) 
	{
 		int years=21;
		int months=12;
		int days=30;
		long hour=24;
		long min=60;
		long sec=60;
		long months1=(years*months);
	    long no_of_days=(months1*days);	
		long no_of_hours=(no_of_days *hour);
		long no_of_min=(no_of_hours *min);
		long no_of_sec=(no_of_min*sec);
        System.out.println("months : " +months1);
	System.out.println("days : " +no_of_days);
	System.out.println("hours: " +no_of_hours);
	System.out.println("min: " +no_of_min);
    System.out.println("sec: " +no_of_sec);
	}
}