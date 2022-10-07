package pkg1;

public class ABCD 
{
int a,b,c,d,e; //global variables 
//call each variable then give value
public static void main(String[] args) 
{
	ABCD obj=new ABCD();
	obj.a=123;
	obj.b=12;
	obj.c=124;
	obj.d=11;
	obj.e=344;
	System.out.println(obj.a);
	System.out.println(obj.b);
	System.out.println(obj.c);
	System.out.println(obj.d);
	System.out.println(obj.e);
}
}
