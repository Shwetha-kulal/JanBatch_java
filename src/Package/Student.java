package Package;

public class Student 
{

	int Rollno ,Age;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void dispplay2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args)
	{
		 Student Ob=new Student();
		 	Ob.Rollno=103;
		 	Ob.Age=30;
		 	System.out.println("Roll no is"+  Ob.Rollno);
		 	System.out.println("The Age is"+  Ob.Age);
		 	Ob.display1();
		 	Ob.dispplay2();
		 	
	}
}

