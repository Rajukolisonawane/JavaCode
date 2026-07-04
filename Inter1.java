package Java_practice1;

public class Inter1 implements Inter{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Inter1 k=new Inter1();
k.amazone();
k.amazone1();
	}

	@Override
	public void amazone() {
		System.out.println("1st Implements method ");
		
	}

	@Override
	public void amazone1() {
		System.out.println("2nd Implement Method");
		
	}

}
