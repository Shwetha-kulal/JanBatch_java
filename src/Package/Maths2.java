package Package;

public class Maths2 {

	public float div(float a,float b)
	{
		float c=a/b;
		return c;
	}
	public float sub(float a,float b)
	{
		float c=a-b;
		return c;
	}
	public float sum(float a,float b)
	{
		float c=a+b;
		return c;
	}
	public static void main(String[] args) {
		
		Maths2 Ob=new Maths2();
	    float divresult=Ob.div(10, 2);
		float subresult=Ob.sub(divresult,2);
		float sumresult=Ob.sum(subresult,2);
		float sub2=Ob.sub(sumresult, 2);
		float div2=Ob.div(sub2,2);
		System.out.println("The result of (((((10/2)-2)+2)-2)/2)is" +div2);
	}
}
