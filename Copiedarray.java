package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Copiedarray {

	public static void main(String[] args) {

Scanner s= new Scanner(System.in);
System.out.println("enter the size of array= :");
int a []= new int [s.nextInt()];
int copied[]=new int[a.length];
for(int i=0;i<=a.length-1;i++) {
	System.out.println("enter the value of index== :"+i);
	
	a[i]=s.nextInt();
	copied [a.length-1-i]=a[i];
}
System.out.println("input array is =");
System.out.println(Arrays.toString(a));
System.out.println("copied array is =");
System.out.println(Arrays.toString(copied));



	}

}
