class triangle
{
int a,b,c;
triangle(int x)
{
a=x;
b=x;
c=x;
}
triangle(int x,int y,int z)
{
a=x;
b=y;
c=z;
}
triangle(int x,int y)
{
a=x;
b=x;
c=y;
}
void display()
{
System.out.println(a+b+c);
}
}
class trianglemain
{
public static void main(String ars[])
{
new triangle(2).display();
new triangle(2,3).display();
new triangle(2,3,5).display();

}}

















