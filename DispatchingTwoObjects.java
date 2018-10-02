package ArrayListPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DispatchingTwoObjects {
public static void main(String[] args) {
	
	ArrayList< Integer> l=new ArrayList<>();
	l.add(16);
	l.add(4);
	l.add(9);
	l.add(7);
	l.add(11);
	ArrayList< Integer> l1=new ArrayList<>();
	ArrayList< Integer> l2=new ArrayList<>();
	l1.add(16);
	l1.add(41);
	l1.add(9);
	l1.add(71);
	l1.add(111);
	l2.addAll(l1);l2.addAll(l);
	System.out.println("this is l list ="+l2);
	
	Set s,s1;
	s=new HashSet();s1=new HashSet();
	 Iterator itr=l2.iterator();
	
	 while(itr.hasNext()){
		 Integer i= (Integer)itr.next();
		 if(s.add(i)){
			 s.add(i);
		 }else{s1.add(i);
		 }
	 }
	 ArrayList<Integer> l3=new ArrayList<>();
	 
	 Iterator itr1=s1.iterator();
	 while(itr1.hasNext()){
		 		 Integer i=(Integer) itr1.next();
		 		if(!l2.contains(i)){
		 			l3.add(i);
		 		}
	 }
	 System.out.println(s);
	 System.out.println("duplicates ="+s1);
	 System.out.println("duplicates ="+l3);

}
}
