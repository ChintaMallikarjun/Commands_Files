package Arrays;

import java.util.Arrays;

public class Instialization { 
	public static void main(String[] args) {
 
		//int[] a=;
		
		/*System.out.print("line 1st \n \n \n \n ");
		
		System.out.print('\n'+"\n this is new line");
		System.out.print('\t'+"\t this is new line");
		System.out.print('\r'+"\r this is new line");
		System.out.print('\b'+"\b this is new line");
	
System.out.print("how are you");System.out.print('\b');

		System.out.println('\f');//System.out.print("fdfd 2nd ");
		System.out.print('\f'+"how are you \\ ");

		
		*/
		
	 	
		
//	int arr[]=new arr[]; //c.e: Variable must provide either dimension expressions
		
//		int arr[]=new int[];		// ce "
		int[] arr =new int[5];
		int arr1[] =new int[5];
		int []arr2 =new int[5];
		int  []  arr3 =new int[5];

// Array initialization and declaration types
		//1st model
		int a[]=new int[4];
		a[0]=8;
		a[1]=1;
		a[2]=3;
		a[3]=5;
	//	System.out.println(a);
	//	a[4]=1; //ce: java.lang.ArrayIndexOutOfBoundsException
		
		// 2nd second model
		 
		int a1[]={1,5,6,8};
		int a2[]={2,6,4,1};
		int a3[];
	//	a3={1,5,28,6};  ce:
		System.out.println(a1[1]);
//		System.out.println(a1);
		System.out.println("before sorting");
		for(int i=0;i<4;i++){System.out.print(a[i]+" ");}
		  Arrays.sort(a1);
		// System.out.println( Arrays.equals(a1, a2));
	//	System.out.println(a1);
		System.out.println("After sorting");
		for(int i=0;i<4;i++){System.out.print(a[i]+" ");}
		System.out.println( Arrays.equals(a1, a2));
		
	//	3rd model
		int[] t;
		t=new int[4];
	}
}
