package Java_practice1;

public class Switch {

	public static void main(String[] args) {

String bike ="pulser";
int p=80000;
int m=60;
switch (bike) {
case "pulser" : if (p==8000&&m>60) {
	System.out.println("pulser is good bike to  buy");break;
}
case "shine" : if (p==8000||m>=60) {
	System.out.println("shine is good bike to  buy"); break;
}
case "honda" : if (p==8000||m==60) {
	System.out.println("honda is good bike to  buy");break;
}
	}

}}
