package logic;

public class polindrome {

	public static void main(String[] args) {
		String input= "1235521";
		String output = "";
for(int i=input.length()-1;i>=0;i--) {
	char k=input.charAt(i);
	output=output+k;
	
	}
if(input.equals(output)) {
	System.out.println("Poilindrome");
}
else {
	System.out.println("Not poli");
}
	}

}
