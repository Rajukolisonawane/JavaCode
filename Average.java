package Array;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		a[0]=12;
		a[1]=54;
		a[2]=121;
		a[3]=124;
		a[4]=65;
		
		double sum=0;
		for(int i=0;i<=a.length-1;i++){
			sum=sum+a[i];
			}
		double avg=sum/a.length;
		System.out.println(avg);
	}

}
