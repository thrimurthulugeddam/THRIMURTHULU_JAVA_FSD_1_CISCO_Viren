package assaignment;

abstract class MNC {
	MNC(){
		System.out.println("we are in default constructor");
	}
	abstract public void a();
	abstract public void b();
	public  void MNCI(){
		System.out.println("inside class mnc");
	}
}
	abstract class infosys extends MNC{
		abstract public void inf();
			public void  a(){
				System.out.println("mtd A in infosys");
			}
		}
	class hello extends infosys{
		public void a(){
			System.out.println("mtd a of hello");
		}
		public void b(){
			System.out.println("mtd b of hello");
		}
		
		public void inf(){
			System.out.println("mtd inf of hello");
		}
		public void hel(){
		
		}
			

	public static void main(String args[]){
		MNC m=new hello();
		infosys ifi=new hello();
		m.a();
		m.b();
		ifi.inf();
		
	}
	}

	



