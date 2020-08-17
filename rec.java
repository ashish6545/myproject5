class test
{
	//int arr[];
	//test(int x)
	//{
		//arr=new int[x];
	//}
	void printing(int x)
	{
		if(x==0)
			return;
		else
			printing(x-1);
		System.out.println(x);
	}
}
	class rec
	{
		public static void main(String ars[])
		{
			test ob=new test();
			ob.printing(10);
	}}