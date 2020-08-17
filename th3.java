class th3 implements Runnable
{
public void run()
{
for(int i=0;i<10;i++)
System.out.println(i);
}
}
class th33
{
public static void main(String ars[])
{
th3 ob=new th3();
Thread t=new Thread(ob);
t.start();
for(int j=0;j<10;j++)
System.out.println("i");
}
}