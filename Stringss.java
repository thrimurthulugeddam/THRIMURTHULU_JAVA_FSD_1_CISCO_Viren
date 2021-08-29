package stirngs;
import java.io.*;
import java.util.*;
public class Stringss {
	public static void main(String args[]){
	boolean pal=true;
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	for(int i=0;i<s.length()/2;i++){
		if (s.charAt(i) != s.charAt(s.length() -i -1)){
			pal=false;
		}	
		}
	if(pal){
		System.out.println("Yes");
	}
	else{
		System.out.println("No");
	}
	}
	}
