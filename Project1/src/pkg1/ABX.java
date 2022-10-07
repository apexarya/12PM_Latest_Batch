package pkg1;

public class ABX 
{
	//give value using method
	int a,b,c,d,e;
	public void m1(int a1, int a2, int a3,int a4,int a5)
	{
		a=a1;
		b=a2;
		c=a3;
		d=a4;
		e=a5;
	}
public static void main(String[] args)
   {
	ABX obj=new ABX();
	obj.m1(11,22,44,66,78);
	System.out.println(obj.a);
	System.out.println(obj.b);
	System.out.println(obj.c);
	System.out.println(obj.d);
	System.out.println(obj.e);
    }
}
