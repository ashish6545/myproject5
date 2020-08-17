class th7 extends Thread
{
th7(String a,String b)
{
super(a);
setName(b);
start();
}
public void run()
{
for(int i=0;i<10;i++)
System.out.println(getName());
}
}
class th77 extends Thread
{
th77(String c,String d)
{
super(c);
setName(d);
start();
}
public void run()
{
for(int i=0;i<10;i++)
System.out.println(getName());
}
}
class th777
{
public static void main(String ars[])
{
new th7("as","as");
new th77("ash","ash");
}
}