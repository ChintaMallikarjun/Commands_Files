package ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ContainsSS {
	public static void main(String[] args) {
		ArrayList<Integer> list1,list2,list3;
		list1=new ArrayList<>();
		list1.add(82);
		list1.add(12);
		list1.add(21);
		list1.add(4);
		list1.add(52);
		 list3 =new ArrayList<>();
		 list2 =new ArrayList<>();
		list2.add(182);
		list2.add(102);
		list2.add(21);
		list2.add(4);
		list2.add(522);
		list3.addAll( list1);
		list3.addAll( list2);
		System.out.println("Before ="+list3);
		System.out.println("subList ="+list3.subList(4, 8));
		System.out.println("list1="+list1);
		System.out.println("3rd ="+list3.retainAll(list1));
		System.out.println("After ="+list3);
	 
		 
		System.out.println(list1);
		System.out.println(list1.get(9));
		 
	}

}
