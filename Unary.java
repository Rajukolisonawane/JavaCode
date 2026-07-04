package Java_practice1;

public class Unary {

	public static void main(String[] args) {
	int a=20;
	int b=40;
	int c=3;
System.out.println(a++);//20
System.out.println(a);//21
System.out.println(a++);//21
System.out.println(a++);//22
System.out.println(a--);//23
System.out.println(a);//22
System.out.println(--a);//21
System.out.println(~a);

System.out.println(c<<2);
System.out.println(40>>2);

	}

}
