package assaignment;

public class Constructor {
	int s,b,h;
	float r;
	Constructor()
	{
		System.out.println("this is default constructor");
	}
    Constructor(int i)
    {
    	s=i;
    	
    }
    public void display1()
    {
    	System.out.println("Area of square:"+(s*s));
    }
    Constructor(int i,int j){
    	b=i;
    	h=j;
    	
    }
    public void display2(){
    	System.out.println("area of rectangle is:"+(b*h));
    }
    Constructor(float i){
    	r=i;
    	
    }
    public void display3(){
    	System.out.println("area of circle is:"+(2*3.14f*r));
    }
    public void area(int d1,int d2){
    	int rh=1/2*d1*d2;
    	System.out.println("area of rhombus"+rh);
    }
    public void area(){
    	int x=5,y=6;
    	int at=1/2*x*y;
    	System.out.println("area of triangle:"+at);
    	
    }
    public static void main(String args[]){
    	Constructor c=new Constructor();
    	Constructor c1=new Constructor(6);
    	c1.display1();
    	c.area(6,8);
    	
    }
}
