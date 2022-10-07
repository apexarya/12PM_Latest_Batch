package pkg1;

public class Student 
{  //boundary of class
	int a; //variable declared
	public void deepak()  //()method
	{
		System.out.println("welcome to all of you");
	}
    public static void main(String[] args) 
    {
	Student s = new Student();
	s.deepak(); //called the method deepak
	s.deepak();
	s.a=133;
	System.out.println(s.a);
	s.a=11;
	System.out.println(s.a);
}
}
