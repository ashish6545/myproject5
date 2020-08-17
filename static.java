class A
{
static String b;
//A(String x)
//{
//b=x;
//}
static void m(String c)
{
b=c;
System.out.println(b);
}
static 
{
System.out.println("madhar");
}
}
class B
{
public static void main(String ars[])
{
//A ob=new A();
A.m("chod");
//A.m("chod");
//A ob1 =new A();
//ob1.m("bhagat");
//System.out.println(ob.b);

}
}