class test
{
	int a;
	test(int x)
	{
	a=x;
	}
	/*void display()
	{
		System.out.println(a);
	}*/
	test change(test ob)
	{
		ob.a*=2;
		return ob;
	}
}
class changevalue
{
	public static void main(String ars[])
	{
	test obj=new test(20);
	//obj.display();
	System.out.println(obj.a);
	//test cb=new test();
	test cb;
	cb=obj.change(obj);
	//cb.display();
	System.out.println(cb.a);
}
}