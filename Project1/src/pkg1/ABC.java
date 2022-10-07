package pkg1;

public class ABC
{
	public ABC() 
	{
		this(45,65);
		System.out.println("Default Constructor");// TODO Auto-generated constructor stub
	}
	public ABC(int a)
	{
		this();
		System.out.println("One parametrized Constructor");
	}
	public ABC(float a, int b)
	{
		System.out.println("two parametrized constructor");
	}
	public static void main(String[] args) 
	{
		ABC ob1=new ABC(23);	
	}
}
