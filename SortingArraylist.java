package ArrayListPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SortingArraylist {
public static void main(String[] args) {
	ArrayList<Integer> list1 =new ArrayList<>();
	list1.add(82);
	list1.add(12);
	list1.add(21);
	list1.add(4);
	list1.add(52);
	ArrayList<Integer> list2 =new ArrayList<>();
	list2.add(82);
	list2.add(12);
	list2.add(21);
	list2.add(4);
	list2.add(522);
	//System.out.println("The list order is="+list1);
	// sorted set using Sorted,Navigable,TreeSet
	
	 ArrayList al3 = new ArrayList();
	 Set s = new HashSet();
	 Set s2 =new HashSet();
	 al3.addAll(list1);
	 al3.addAll(list2);
	 System.out.println("**********"+al3);
	 Iterator itr = al3.iterator();

	 while(itr.hasNext()){
		
		 int i =(Integer) itr.next();
		 if(s.add(i)){
			 s.add(i);
		 }else{
			 s2.add(i);
		 }
		 
	 }
	
	 System.out.println(s);
	 System.out.println("this is duplicates : "+s2);
}
}


	