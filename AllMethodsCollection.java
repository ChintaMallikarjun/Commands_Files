package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
 
public class AllMethodsCollection {
public static void main(String[] args) {
	  
	ArrayList<Integer> list=new ArrayList<>();
	list.add(8);
	list.add(9);
	list.add(3);
	list.add(1);
	list.add(44);
	ArrayList<Integer> ls=new ArrayList<>();
	ArrayList<Integer> ls2=new ArrayList<>();
	ls.add(18);
	ls.add(9);
	ls.add(33);
	ls.add(1);
	ls.add(43);
	System.out.println(list);
	System.out.println(ls);
	//System.out.println(Collections.emptyList());
	list.addAll(ls);
	System.out.println("Adding before ls1,ls2 ="+list);
 //Collections.fill( list, 6);
	Collections.sort(list);
	System.out.println("Adding before ls1,ls2 ="+list);
	System.out.println("Frequency is 1 ="+Collections.frequency(list, 1));
	System.out.println("Frequency is 44 ="+Collections.frequency(list, 44));
	System.out.println("Frequency is 9="+Collections.frequency(list,9));
	HashSet<Integer> h=new HashSet<>(list);
	System.out.println("without duplicates = "+h);
	 ls2.addAll(h);
	 Collections.sort(ls2);
	System.out.println("two lists without duplicates & some sorting order "+ls2);
	
	Collections.reverse(ls2);
	System.out.println("Reverse order ls2 ="+ls2);
	 
	System.out.println("tt="+ Collections.binarySearch(list,3));
	System.out.println("Max value="+Collections.max(ls2));
	System.out.println("Min value="+Collections.min(ls2));
	
	System.out.println(Collections.frequency(ls2, 3));

}
	
}
