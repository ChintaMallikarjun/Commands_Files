package ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
public static void main(String[] args) {
	//public static void main(String args[]){  
		   
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		    
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi");  
		  al2.add("Hanumat");  
		    
	//	  al.removeAll(al2);  
		  al.retainAll(al2);
		  System.out.println("iterating the elements after removing the elements of al2...");  
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  
}
}
