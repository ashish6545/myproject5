class th4 implements Runnable
{
public void run()
{
for(int i=0;i<10;i++)
System.out.println("ashish");
}
}
class th44 implements Runnable
{
public void run()
{
for(int j=0;j<10;j++)
System.out.println("priya");
}
}
class th444{
public static void main(String ars[])
{
th4 ob=new th4();
th44 obj=new th44();
Thread t=new Thread(ob);
Thread t1=new Thread(obj);
t.start();
t1.start();
}
}