class sv
{
int a=5;
void inc()
{
a=a+5;
System.out.println(a);
}
}
class svmain
{
public static void main(String ars[])
{
sv ob1=new sv();
ob1.inc();
sv ob2=new sv();
ob2.inc();
sv ob3=new sv();
ob3.inc();
}
}