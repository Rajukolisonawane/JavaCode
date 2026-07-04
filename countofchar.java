package logic;

import java.util.HashMap;

import Array.Hashmap;

public class countofchar {

	public static void main(String[] args) {
		String s="AAhbfhdj^&R58hhhhh7";

HashMap<Character, Integer> map=new HashMap<>();
for(char c:s.toCharArray()) {
	map.put(c,map.getOrDefault(c, 0)+1);
	
}
System.out.println(map);}}
