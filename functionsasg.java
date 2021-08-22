package assaignment;

public class functions {
	public static int  caluclate()
	{
		int a=44,b=66,c;
		c=a+b;
		return c;
	}
	public float caluclate(float k)
	{
		k=2*3.14f*k;
		System.out.println("the are of a circle is "+k);
		return k;
	}
	public static int caluclate(int x,int y)
	{
		int z=x*y;
		System.out.println("the area of rectangle is " +z);
		return 0;
	}
	public static void main(String args[]){
		functions f1=new functions();
		f1.caluclate(5,6);
		f1.caluclate(9);
	}

}
