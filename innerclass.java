class A
{
private int a=10;
int b=6;
void display()
{
System.out.println(a+b);
}
void creation()
{
B ob=new B();
ob.show();
}
class B
{
int c=10;
void show()
{
System.out.println(a+b+c);
}
}
}
class C
{
public static void main(String ars[])
{
A obj=new A();
obj.display();
obj.creation();
}}