class sum
{
int a,b;
sum(int x,int y)
{
a=x;
b=y;
}
void display()
{
System.out.println(a+b);
}
}
class summain
{
public static void main(String ars[])
{
sum ob1=new sum(2,3);
sum ob2=new sum(3,5);
ob1.display();
ob2.display();
}
}