package Array;

public class Tocheckvalue {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=12;
		a[1]=54;
		a[2]=121;
		a[3]=124;
		a[4]=65;
		
		int check=54;
		for(int i=0;i<=a.length-1;i++) {
			if(check==a[i]) {
				System.out.println("Value is present"+i);
			}
			else {
				System.out.println("value is not present");
			}
			
		}
		
		
	}

}
