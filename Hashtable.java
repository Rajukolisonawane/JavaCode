package Array;

public class Hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.Hashtable<Integer, String> hh= new java.util.Hashtable<Integer, String>();
hh.put(1,"jan");
hh.put(3,"feb");
hh.put(3,"March");
hh.put(4,"Appril");

System.out.println(hh.get(3));
System.out.println(hh.get(4));
System.out.println(hh);
	}

}
