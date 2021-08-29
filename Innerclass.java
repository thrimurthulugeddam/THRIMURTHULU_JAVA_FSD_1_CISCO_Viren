package program.java.innerclass;

public class Innerclass {
	private int data=445;
	void display(){
		
		System.out.println("i am inside the outer class");
	}
	class Inner{
		void msg(){
			System.out.println("data is"+data);
			
	}
		void display(){
			System.out.println("inside the outer class");
		}
	}
	public static void main(String args[]){
		Innerclass in=new Innerclass();
		Innerclass.Inner on=in.new Inner();
		in.display();
		on.display();
		on.msg();
	}
}
