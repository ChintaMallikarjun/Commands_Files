package ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class HashSetExamples {
public static void main(String[] args) {
	ArrayList< Integer> al=new ArrayList<>();
	al.add(4);al.add(41);al.add(42);al.add(40);al.add(14);al.add(141);al.add(104);
	System.out.println("al="+al);
	
	ArrayList<Integer> als=new ArrayList<>();
	als.add(4);als.add(14);als.add(41);
	System.out.println("als="+als);
	
	System.out.println(" performing  true or false als.retainAll(al) ="+als.retainAll(al));
	System.out.println("retainAll on als (als.retainAll(al))="+als);
	System.out.println();
	System.out.println("Now judgement is al ="+al);
	System.out.println();
	System.out.println("performing retainAll on al(al.retainAll(als))"+al.retainAll(als)+'\n');
	System.out.println(" now written list al=(al.retainAll(als))="+al+'\n');
	
		ArrayList< Integer> t=new ArrayList<>();
		t.add(4);t.add(14);
		System.out.println("This is contains performance al.containsAll(t)="+al.containsAll(t));
		System.out.println("now the above judgement al is="+al+'\n');
		System.out.println("This is contains performance t.containsAll(al)="+t.containsAll(al));
		System.out.println("after value t="+t);
	
	Iterator itr=al.iterator();
	while(itr.hasNext()){
		 Integer i=(Integer)itr.next();
		System.out.print(i+" ");
		
	}
}
	public void HashsetOperations(){

		
	}
 
}	
