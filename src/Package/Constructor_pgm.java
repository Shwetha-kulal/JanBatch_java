package Package;

public class Constructor_pgm
{
	
}
constructor_pgm
	{
	 public void StudentA()
	 {
		 System.out.println("Default constructor");
	 }
	 public void StudentB(int a)
	 {
		 System.out.println("one parameterized constructor");
	 }
	 public void StudentC(int a,int b)
	 {
		 System.out.println("two parameterized constructor");
	 }
	 public static void main(String[] args) 
	 {
		 Constructor_pgm Ob=new Constructor_pgm();
		 StudentB  Ob1= StudentB(111);
	 }
}
