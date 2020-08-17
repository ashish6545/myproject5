class th6 extends Thread
{
th6(String a,String b,int x)
{
	
super(a);
setName(b);
setPriority(x);
start();
}
public void run()
{
for(int i=0;i<10;i++)
System.out.println(super.getName());
}
}
class th66
{
public static void main(String ars[])
{
new th6("ashish",7);
new th6("priya",10);

}
}