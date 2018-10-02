package HashCodeEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class demo {
	public static void main(String[] args) {
	 Student	a=new Student(null,0);
	 Student	a1=new Student("rajesh",18);
	 Student	a2=new Student("esh",181);
	 Student	a3=new Student("raj",108);
	 Student	a4=new Student("raj",108);
	 Student	a5=new Student("Arun",8);
	 Student	a6=new Student("keshava",99);
	 System.out.println(a1.equals(a3));
	 System.out.println(a1.equals(a2));
	 System.out.println(a3.equals(a4));
	 System.out.println(a.equals(a3));
	 System.out.println(a1);
	 
	 ArrayList ls=new ArrayList();
	 ls.add(a);ls.add(a1);ls.add(a3);ls.add(a2);ls.add(a4);ls.add(a5);ls.add(a6);
	 System.out.println(ls);
	
	HashSet s=new HashSet(ls);
	 System.out.println(s);
	/*TreeSet s1=new TreeSet(s);
	System.out.println(s1);*/
}
}

class Student{
	private String name;private int rollid;
	public Student(String name,Integer rollid) {
		 this.name=name;
		 this.rollid=rollid;
	}

	 public int hashCode(){return 5;}

	/*public boolean equals(Object obj){
try{
	String name1=this.name;
	int rollno1=this.rollid;
	Student s=(Student)obj;
	String name2=s.name;
	int rollno2=s.rollid;
	if(name1.equals(name2) && rollno1==rollno2)
		return true;
		else 
		return false;
	
		}catch(ClassCastException e){return false;}
		catch(NullPointerException e){return false;}
	}
*/
	 

/*
public boolean equals(Object o){
	try{
	if(this==null) 
	return false;
	if(this.equals(o)){
		return true;}
		else
		return false;
	 
	}
	catch(NullPointerException e){return false;}
 
	}
*/// content comparision
	 
	 public boolean equals(Object o){
	try{	
		 String name1=this.name;
		 Integer rollid1=this.rollid;
		 
		 Student s=(Student)o;
		 String name2=s.name;
		 Integer rollid2=s.rollid;
	
		 
		 if(name1.equals(name2) && rollid1.equals(rollid2))
		 return true;
		 else
		 return false; 
		 }
	catch(ClassCastException e)	 {return false;}
	catch(NullPointerException e){return false;}
	 }
public String toString(){
	return name+"     "+rollid;
}

}