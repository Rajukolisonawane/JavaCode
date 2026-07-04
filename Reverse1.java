package logic;

import java.util.Arrays;

public class Reverse1 {
public static void main(String[] args) {
	String name="ram krishna hari ";
	String[] name1 = name.split(" ");
	System.out.println(Arrays.toString(name1));
	String newname = name1[2].concat(" ").concat(name1[1])+" ".concat(name1[0]);
	System.out.println(newname);
}
}
