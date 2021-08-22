package assaignment;

public class Operation {
	int square(int n){
		return n*n;
		
	}
	class Agregationexample{
		Operation op;
		double pi=3.14;
		double area(int radius){
			op=new Operation();
			int rsquare=op.square(radius);
			return pi*rsquare;
		}
		
	}
	public static void main(String args[]){
	Agregationexample c=new Agregationexample();
	double result=c.area(5);
	System.out.println(result);
	}

}
