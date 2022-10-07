package pkg1;

public class Arithematics
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is"+c);
		return c;
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("sub result is"+z);
		return z;
	}
	public void multi(int x1, int x2)
	{
		int x3;
		x3=x1*x2;
		System.out.println("final result is"+x3);
	}
	public static void main(String[] args) {
		Arithematics ob=new Arithematics();
		int sumResult=ob.sum(12,2);
		int subResult=ob.sub(12,2);
		ob.multi(sumResult, subResult);
		
	}
}
