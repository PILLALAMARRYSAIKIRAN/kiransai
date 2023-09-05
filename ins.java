class Insurance
{
public static void main(String args[]) 
{ 
String health = "poor", location ="village", gender= "male" ;
int age=34;
double premium=0,policy_amount=10000,maxamount=0;
if(health =="excellent" && (age >=25 && age <=35) &&location=="city")
{
if(gender=="male" && policy_amount<=200000)
{
premium= 4.0*policy_amount/1000;
maxamount =4.0*200000/1000;
}
else if(gender=="female"&&policy_amount<=100000)
{
premium=3.0*policy_amount/1000;
maxamount =3.0*100000/1000;
}
 else
{
System.out.println(" PERSON NOT INSURED");
}
}
else if(health =="poor" && age>=25&& age <=35&&location=="village"&&gender=="male"&&policy_amount==10000) 
{
premium=6.0*policy_amount/1000;
maxamount=6.0*10000/1000;
}
else
{
System.out.println("person not insured"); 
}
 double loss=maxamount-premium;
System.out.println(premium+ " "+maxamount+  "  "  +loss);
}
}

