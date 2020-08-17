class A
{
final String b;
//A(String x)
//{
//b=x;
//}
final void m(String c)
{
b=c;
System.out.println(b);
}
//final 
//{
//System.out.println("madhar");
//}
}
class B
{
public static void main(String ars[])
{
A ob=new A();
ob.m("chod");
//A.m("chod");
//A ob1 =new A();
//ob1.m("bhagat");
//System.out.println(ob.b);

}
}