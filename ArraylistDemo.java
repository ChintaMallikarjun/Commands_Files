package ArrayListPractice;

import java.util.ArrayList;

public class ArraylistDemo {
public static void main(String[] args) {
	ArrayList list =new ArrayList<>();
	list.add(123);list.add(23);list.add(3);list.add(203);list.add(4);list.add(6);
	System.out.println("list ="+list);
	ArrayList list1 =new ArrayList<>();
	list1.add(123);list1.add(23);
	System.out.println("list1 ="+list1);
	
//	System.out.println("retainAll(list1)="+list.retainAll(list1));
	//System.out.println("retainAll(list1)="+list);
	System.out.println(list.containsAll(list1));
	System.out.println(list1.containsAll(list));
	System.out.println(list);
	
}
}