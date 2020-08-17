import java.util.*;
class bubb
{
double a[][]=new double[10][10];
//int n;
double n,temp;
Scanner sc=new Scanner(System.in);
void input()
{
System.out.println("enter the no. of elements");
n=sc.nextInt();
System.out.println("enter the elements");
for(int i=0;i<2;i++)
{
for(int j=0;j<n;j++)
{
	System.out.println( i + "->" + j); 
a[i][j]=sc.nextDouble();
}
}
}
void swap()
{
for(int k=0;k<2;k++)
{
	for(int i=0;i<n-1;i++)
	{
for(int j=0;j<n-i-1;j++)

{
if(a[k][j]>a[k][j+1])
{
temp=a[k][j+1];
a[k][j+1]=a[k][j];
a[k][j]=temp;}
}}}}
void output()
{
for(int i=0;i<2;i++)
{
for(int j=0;j<n;j++)
{
System.out.println("\n" + a[i][j]);
}
}}
}
class swapping
{
public static void main(String ars[])
{
bubb bb=new bubb();
bb.input();
bb.swap();
bb.output();
}
}












