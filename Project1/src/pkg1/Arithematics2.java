package pkg1;

public class Arithematics2 
{
	//(10/2)-2)-2)+2)*2)
	public int div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("div result is "+c);
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("min result is"+z);
		return z;
	}
    public int sum(int d, int e)
{
	int f;
	f=d+e;
	System.out.println("sum result is"+f);
	return f;
}
     public void mul(int g,int h)
{
	int i;
	i=g*h;
	System.out.println("div result is"+i);
}
     public static void main(String[] args)
{
     Arithematics2 b=new Arithematics2();
     int divRes=b.div(10,2);
     int subRes=b.sub(divRes,2);
     int subRes2=b.sub(subRes,2);
     int sumRes=b.sum(subRes2,2);
     b.div(sumRes,2);
}
}
