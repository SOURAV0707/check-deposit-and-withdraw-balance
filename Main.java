class Account
{
String name;
long accountno;
float amount;
void input(String a,long b,float c)
{
name=a;
accountno=b;
amount=c;
}
void deposit(float x)
{
amount=amount+x;
System.out.println("rs"+x+"deposited in your account");
}
void withdrawn(float x)
{
if(amount<x)
{
System.out.println("insufficient balance");
}
else
{
amount=amount-x;
System.out.println("rs"+x+"withdrawn in your account");
}
}
void balance()
{
System.out.println("now total balance in your account="+amount);
}
}
class Main
{
public static void main(String args[])
{
Account obj=new Account();
obj.input("sourav",257894,50000);
obj.deposit(4000);
obj.balance();
}
}