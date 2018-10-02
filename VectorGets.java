package ArrayListPractice;

import java.util.Arrays;
import java.util.Vector;

public class VectorGets {
public static void main(String[] args) {
	
	Vector<Integer> v=new Vector<>();
	v.add(4);
	v.add(44);
	v.add(3);
	 // initializing unsorted int array
    int intArr[] = {30,20,5,12,55};

    for(Integer item: intArr){
	System.out.print(item + " ");
}
System.out.println();
    // sorting array
    Arrays.sort(intArr);

    for(Integer item: intArr){
	System.out.print(item +" ");
}
    System.out.println(intArr);
	
	
	
}
}
