class th5 implements Runnable
{
Thread t;
th5(String a,int b)
{
	
t=new Thread(this);
t.setName(a);
t.setPriority(b);
t.start();
}
public void run()
{
for(int i=0;i<5;i++)
System.out.println(t.getName());
}
}
class th55
{
public static void main(String ars[])
{
new th5("sonal",10);
new th5("ashish",10);
new th5("priya",10);
}
}

