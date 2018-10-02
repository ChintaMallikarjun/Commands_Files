package ArrayListPractice;

import java.util.ArrayList;

public class Adding {
public static void main(String[] args) {
	ArrayList<Integer> list1 =new ArrayList<>();
	list1.add(2);
	list1.add(12);
	list1.add(21);
	list1.add(24);
	list1.add(52);
	ArrayList<Integer> list3 =new ArrayList<>();

	ArrayList<Integer> list2 =new ArrayList<>();
	list2.add(2);
	list2.add(11);
	list2.add(21);
	list2.add(33);
	list2.add(52);
	list3=list1;
	System.out.println("list 1 is="+list1);System.out.println("list 2 is="+list2);
	list3.retainAll(list2);
	System.out.println("list 3="+list3);
	
	System.out.println("common nos printing list3 & list 1");
	int i=0;
	
	while(i<list3.size()-1){
	
		if(list3.containsAll(list1)){
		System.out.print(" "+list3.get(i));
			}i++;
	}
	
	
}
}
