package logic;

public class Palindrome {
// reverese is same  ex:12321
	
	 public static void main(String[] args)
	    {
		 String s="tyueggdvgdhh";
		 // make length
		int k= s.length();
		String rev="";
		for(int i=k-1;i>=0;i--) {
			  rev = rev+s.charAt(i);
		}
		 System.out.println("Reverse No.="+ rev);
		 // Checking palindrome
		if (s.equals(rev)){ System.out.println("Polindrome");
	    }
		else {System.out.println("Not a palindrome");}}}