class A
{
private int a;
public int b;
/*A(int a,int b)
{
this.a=a;
this.b=b;
}*/
void display()
{
System.out.println(a+b);
}
}
class B {
public static void main(String ars[])
{
A ob=new A();
ob.a=8;
ob.b=5;
ob.display();
}
}
