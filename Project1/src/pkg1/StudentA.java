package pkg1;

public class StudentA {
	int age; //variable
	int rollno; //variable
	
	public void satyam() //method
	
	{
		System.out.println("welcome to all of you");
		System.out.println("automation is very easy");
	}
	public static void main(String[] args) 
	{
		StudentA s= new StudentA();
		s.satyam();
		s.age=12;
		System.out.println(s.age);
		s.rollno=334;
		System.out.println(s.rollno);
		
		
	}
	
	

}
