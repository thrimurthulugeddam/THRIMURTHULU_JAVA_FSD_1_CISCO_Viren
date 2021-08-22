package assaignment;

public class Vehicle {
	int speed;
	long distance;
	void run(){
		
	}
	void stop(){
		
	}
		public void fuel(int i){
			
		}
		public void fuel(float f,String s){
			
		}
		public void fuel(char ch,int it){
			
		}
public class twow extends Vehicle{
	twow(){
		
	}
	int speed=55,tyre=2;
	long distance=1000;
	void run(){
		
	}
	void stop(){
		
	}
	public void display(){
		System.out.println(tyre+super.speed+super.distance);
	}
	
}
public class threew extends Vehicle{
	threew(){
		
	}
		int speed=60,tyre=3;
		long distance=500;
	void run(){
		
	}
	void stop(){
		
	}
	public void display(){
		System.out.println(tyre+super.speed+super.distance);
	}
}
public class fourw extends Vehicle{
	fourw(){
		
	}
		int speed=55,tyre=4;
		long distance=9000;
	void run(){
		
	}
	void stop(){
		
	}
	public void display(){
		System.out.println(tyre+super.speed+super.distance);
	}
}
public static void main(String args[]){
	Vehicle v=new twow();
	Vehicle v1=new threew();
	Vehicle v2=new fourw();
	v.display();
	v1.display();
	v2.display();
}


}
