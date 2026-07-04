package logic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

String a="sawth";
String b="washt";

if (a.length()!=b.length()) {
	System.out.println("they can never be anagram");
}
else {
	char []c1=a.toCharArray();//[S,A,W]
	char []c2=b.toCharArray();//[w,a,s]
	Arrays.sort(c1);//[A,S,W]
	Arrays.sort(c2);//[A,S,W]
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
	if(Arrays.equals(c1, c2)) {
		System.out.println("the 2 arrays are eqaual hence anagram");
	}
	else {
		System.out.println("Arrays not equal");
	}
}

	}

}
