package inherience;

public class single {
	float salary=40000;
	int bonus=4500;
public void show(){
	System.out.println("in side the parent class");
	public void display(){
		System.out.println("we are inside display method of parent class");
	}
}
public class double extends single{
	int bonus=7000;
	public void show(){
		System.out.println("salary of emplyee is"+salary);
		System.out.println("bonus of employee is "+bonus);
		
	}
}
public static void main(String args[]){
	double d=new double();
	System.out.println("programer salary is"+d.salary);
	System.out.println("programer bonus is"+d.bonus);
	d.show();
	d.display();
}
