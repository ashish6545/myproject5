class mod
{
int a;
void display()
{
System.out.println(a);
}
void display(int x)
{
a=x;
System.out.println(a);
}
}
class modmain
{
public static void main(String ars[])
{
 mod ob=new mod();
ob.display();
ob.display(5);
}
}