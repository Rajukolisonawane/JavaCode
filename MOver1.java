package Java_practice1;

public class MOver1 extends MOver{
	void over(){
		super.over();
		System.out.println("Overriding3");}
	
		void over(int a){ 
			super.over(89000);
			System.out.println("Overridding4");
			}
		public static void main(String[] args) {
			MOver1 k=new MOver1();
			k.over();
			k.over(9000);
//		MOver k2 = new MOver();
//		k2.over();
//		k2.over(990);
		
		

			
			
}
}