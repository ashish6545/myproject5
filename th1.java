class th1
{
public static void main(String args[])
{
Thread t=new Thread();
System.out.println(t);
t.setName("ashish");
System.out.println(t);
t.setPriority(10);
System.out.println(t);
System.out.println(t.getPriority());

}
}