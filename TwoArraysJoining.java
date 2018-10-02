package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class TwoArraysJoining {
public static void sorted(){
	int[] a1={3,4,6,8};
	int[] a2={12,21,44,5};
	int len=a1.length+a2.length;
	int[] a3=new int[len];
	 ArrayList ls=new ArrayList<>();
	 for(int a=0;a<a1.length;a++){
		 ls.add(a1[a]);
	 }
	 for(int a=0;a<a2.length;a++){
		 ls.add(a2[a]);
	 }
	 System.out.println("sorting of the two arrays="+ls);
	 Collections.sort(ls);
	 System.out.println(ls);
	 
	}

 
	public static void main(String[] args) {
	
	int[] a1={3,4,6,8};
	int[] a2={12,21,44,5};
	int len=a1.length+a2.length;
	int[] a3=new int[len];
	 ArrayList ls=new ArrayList<>();
	 for(int a:a1){
		 ls.add(a);
	 }
	 for(int a:a2){
		 ls.add(a);
	 }
	 System.out.println(ls);
	 Collections.sort(ls);
	 System.out.println(ls);
	 sorted();
	}
}
