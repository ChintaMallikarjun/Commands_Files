package ArrayListPractice;

import java.util.ArrayList;

public class TwoListsaddding {
public static void main(String[] args) {
	
	ArrayList< Integer> list1=new ArrayList<>();
	for(int i=1;i<11;i++){
		list1.add(i);
	}
	System.out.println("this is first list1 ="+list1 +"size is ="+list1.size());
	ArrayList< Integer> list2=new ArrayList<>();
	for(int i=11;i<26;i++){
		list2.add(i);
	}
	System.out.println("This is second list2 ="+list2+"size is ="+list2.size());
	
	System.out.println("two lists adding ="+list1.addAll(list2)+" size is ="+
	list1.size());
//	System.out.println("this is list1="+list1);
	
	ArrayList<Integer> list3=new ArrayList<>();
	for(int j=3;j<20;j++){
		list3.add(j);
	}
	System.out.println("this is list1="+list1);
	System.out.println("the list3 ="+list3);
	//list1.
	ArrayList< Integer> commonlist=new ArrayList<>();
	list1.retainAll(list3);
	System.out.println("common elements in list1 and list3 ="+list1);

	
}
}
