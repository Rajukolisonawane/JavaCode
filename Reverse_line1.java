package logic;

import java.util.Arrays;

public class Reverse_line1 {
	public static void main(String[] args) {
		
String s="my name is RK";
String k[]=s.split(" ");
System.out.println(Arrays.toString(k));
String h = k[3]+(" ").concat(k[2])+(" ").concat(k[1])+(" ").concat(k[0]);
System.out.println(h);
}
}