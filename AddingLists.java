package ArrayListPractice;

import java.util.ArrayList;

public class AddingLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(22);
		list.add(32);
		list.add(33);
		list.add(32);
		list.add(35);
		
		System.out.println(list);
		
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(122);
		list1.add(132);
		list1.add(313);
		list1.add(312);
		list1.add(351);
		System.out.println(list1);
		list1.set(4,2); // replacing pupose it is using  351 to 2
		list1.add(4);
		
		System.out.println(list1);
		list.lastIndexOf(list);
		System.out.println("Adding two lists");
		System.out.println("list1 size is ="+list.size());

		list.addAll(list1);
		System.out.println("list1 size is ="+list.size());
		System.out.println("list2 size is ="+list1.size());
		System.out.println("list is ="+list);
		System.out.println("list is index of specified varble="+list.indexOf(35));
		System.out.println("list1 size is ="+ list1 +"size is" +list1.size());
		System.out.println("this is one of deleted list="+list.retainAll(list1));
		System.out.println("list size is ="+list +"size is"+list.size());
	}
	
	
}
