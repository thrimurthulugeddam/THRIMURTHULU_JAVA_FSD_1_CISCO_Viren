package assaignment;

public class Student {
	String name;
	int age,sub1,sub2,sub3,total;
	char section;
	char gender;
	float percentage;
	Student(String n,int a,char s,char g,int sb1,int sb2,int sb3){
		name=n;
		age=a;
		section=s;
		gender=g;
		sub1=sb1;
		sub2=sb2;
		sub3=sb3;
	}
	Student(String n,int a,char s,char g,int sb2,int sb3){
		name=n;
		age=a;
		section=s;
		gender=g;
		sub2=sb2;
		sub3=sb3;
	}
	public void cal()
	{
		total=sub1+sub2+sub3;
		percentage=(total*100)/300;
		System.out.println(name+" age"+age+" gender "+gender+" section "+section+" total "+total+"  percentage "+percentage);
	
	}
	public static void main(String args[]){
		Student s1=new Student("thimmmu",22,'A','M',60,70,88);
		Student s2=new Student("teja",23,'B','M',70,88);
		Student s3=new Student("varsha",21,'A','F',77,85);
		Student s4=new Student("deepthi",21,'A','F',79,90);
		s1.cal();
		s2.cal();
		s3.cal();
		s4.cal();
	}
}
