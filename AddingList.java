package ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class AddingList {
 
	public static void main(String[] args) {
		
		 Employ e1 =	new Employ();
		 Employ e2 =	new Employ();
		 Employ e3 =	new Employ();
		
		 ArrayList list=new ArrayList();
		 
		 list.add(e1);
		 list.add(e2);
		 list.add(e3);
		 
		 Iterator it=list.iterator();
		 while(it.hasNext()){
			Employ e= (Employ) it.next(); 
			System.out.println(e.name);
		 }
	}
}

class Employ{
	String name="tt";
}