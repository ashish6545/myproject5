class passob
{
double c;
passob(double c)
{
this.c=c;
}
passob(passob ob)
{
c=ob.c;
}
void display()
{
System.out.println(c);
}
}
class passobmain
{
public static void main(String ars[])
{
passob as=new passob(20.0);
as.display();
passob ash=new passob(as);
ash.display();
}
}