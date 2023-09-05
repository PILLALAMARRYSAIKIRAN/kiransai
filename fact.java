class Fact 
{
    public static void main(String[] args)
 {

        int n = 10, x= 1;
        long factorial = 1;
        while(x<=n)//1<=10
        {
            factorial=factorial* n;
            n--;
	}
 System.out.println(factorial);
    }
}