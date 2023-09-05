class Fact 
{
    public static void main(String[] args)
 {
int x=1,n=8;
int base=2,power=1;
while(x<=n)//1<=8//2<=8//3<=8
{
power=power*base;//2=1*2//4=2*2//8=4*2//16=8*2//=16
x++;
System.out.println(power);
}
}
}
