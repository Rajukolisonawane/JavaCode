package Array;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		
		// Use Map() method to map value and get() method to get value.
		HashMap<Integer, String> jj= new HashMap<Integer, String>();
		jj.put(1, "jal");
		jj.put(2, "Akola");
		jj.put(3, "jahfhfl");
		jj.put(5, "Ako44la");
		System.out.println(jj.get(1));
		
		System.out.println(jj.get(4));
		System.out.println(jj.get(5));
		System.out.println(jj);
	}

}
