package Arrays;

import java.util.Arrays;
public class ArrayExamples {
	 
	public static void main(String[] args) {
		int []Arr=new int[5];
		Arr[1]=3;
		Arr[3]=34;
		Arr[0]=31;
		Arr[2]=66;
		int  Arr1[]={2,4,1,8};
		
		int l1=Arr.length;
		int l2=Arr.length;
		int l3=l1+l2;
		int Arr2[]=new int[l3];
		System.out.println(Arrays.equals(Arr, Arr1));
	int t=	Arrays.binarySearch(Arr,66);
 
	int m=Arrays. binarySearch(Arr, 0, 4,66);
	int n[]=Arrays.copyOf(Arr, 5);
	System.out.println(m);
	System.out.println(t);
		for(int i=0;i<4;i++){
			 
		System.out.print ("  *"+	n[i]);
		}
				
		for(Integer i : Arr)
		System.out.print(i+" ");
		
		System.out.println();
		Arrays. sort(Arr);
		for(Integer i : Arr)
		System.out.print(i+" ");
		

	}
}