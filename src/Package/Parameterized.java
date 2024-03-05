package Package;

public class Parameterized
{
	
	Parameterized(int y)
	{
	 this.x=y;
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
	 Parameterized Ob=new Parameterized(111);
System.out.println("Value of x is="+Ob.x);
 //System.out.println(Ob.StudentB);
// System.out.println(Ob.StudentC);
 
 }
}
