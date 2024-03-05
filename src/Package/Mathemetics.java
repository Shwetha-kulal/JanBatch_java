package Package;

public class Mathemetics {
	
	public int sum(int a,int b)
	{
		int c=a+b;;
		return c;
	}
	public int sub(int a, int b)
	{
       int c=a-b;
        return c;
	}
	public int multi(int a, int b)
	{
       int c=a*b;
       return c;
	}
	public int div(int a, int b)
	{
       int c=a/b;
       return c;
	}
	
	public static void main(String[] args) 
	{
		Mathemetics Ob=new Mathemetics();
		int sumresult=Ob.sum(10,2);
        int sumresult2=Ob.sum(sumresult,2);
		int subresult=Ob.sub(sumresult2,2);
		int multiresult=Ob.multi(subresult,2);
		int divresult=Ob.div(multiresult,2);
		System.out.println("The Result of (((((10+2)+2)-2)*2)/2) is" + divresult);
	}
}

