package logic;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Power of 3 + equal to t6hat number
		int n=373, num=0,s,d;
		s=n;
		while(n>0) {
			d=n%10;
			num=num+d*d*d;
			n=n/10;
		}
		if(num==s){
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not");
		}
	}

}
