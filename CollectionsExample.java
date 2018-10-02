package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
 
	public static void main(String[] args) {
		 ArrayList< Integer> list=new ArrayList<>();
		 list.add(4);list.add(42);list.add(24);list.add(43);
		 
		 System.out.println(list);
		 Collections.sort(list);
		 System.out.println(list);
		 Collections.swap(list, 1, 3);
		 System.out.println("swap(list, 1, 3) list is="+list);
		  System.out.println("sublist="+list.subList(0, 3));
		  Collections.sort(list);
		  System.out.println("sorting  list is="+list);
		  System.out.println("specified location list, 4="+  Collections.binarySearch(list, 4));
		  System.out.println("specified location list, 42="+  Collections.binarySearch(list, 42));
	}
}
