package Employee.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Employe  implements Comparable{
	private  int id;
	private String name;
	public Employe(String name,int id){
		this.name=name;
		this.id=id;
		}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"    "+id;
	}
	 
	public int getId() {
		return id;
	}
	 
	public void setId(int id) {
		this.id = id;
	}
	 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		 
		return 0;
	}
}
class OurOwmcustomized implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employe e1=(Employe)o1;
		Employe e2=(Employe)o2;
		String n1=	e1.getName();
		String n2=	e2.getName();
		return n1.compareTo(n2);
	}
	
}

class SortingDemo{
	public static void main(String[] args) {
		Employe e1=new Employe("zavi", 12);
		Employe e2=new Employe("akil", 82);
		Employe e3=new Employe("raj", 102);
		Employe e4=new Employe("hai", 112);
	//	TreeSet<Employe> ts=new TreeSet<Employe>();
		ArrayList ts=new ArrayList<>();
		ts.add(e1);ts.add(e2);ts.add(e3);ts.add(e4);
		Collections.sort(ts, new OurOwmcustomized());
		System.out.println(ts);
		
		
	}
}
