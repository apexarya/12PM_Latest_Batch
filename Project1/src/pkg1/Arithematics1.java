package pkg1;

public class Arithematics1 
{
	//(((((10+2)+2)-2)*2)/2)
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("the value of sum is "+c);
		return c;
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("the value of sub is"+z);
		return z;
	}
	public int mul(int a1, int a2)
	{
		int a3;
		a3=a1*a2;
		System.out.println("the value of mul is"+a3);
		return a3;
	}
	public void div(int b1,int b2)
	{
		int b3;
		b3=b1/b2;
		System.out.println("final result"+b3);
	}
	public static void main(String[] args) 
	{
	Arithematics1 a=new Arithematics1();
	int sumResult=a.sum(10,2);
	int sumResult2=a.sum(sumResult,2);
	int subResult=a.sub(sumResult2, 2);
	int mulResult=a.mul(subResult, 2);
	a.div(mulResult, 2);
	}
	

}
