package logic;

import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String t="sam";
String s="mas";
if (t.length()!=s.length()) {
	System.out.println("never be enagram");
}
else {
	char[] m = t.toCharArray();
	char[] n = s.toCharArray();
	Arrays.sort(n);
	Arrays.sort(m);
	System.out.println(Arrays.toString(n));
	System.out.println(Arrays.toString(m));
	if (Arrays.equals(m, n)) {
		System.out.println("its anagram");
	}
}

}}
