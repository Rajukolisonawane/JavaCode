package Java_practice1;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter first digit");
	double num1 = s.nextDouble();
	System.out.println("Enter any cal sign(+,-.*,/)");
	char Operator = s.next().charAt(0);
	System.out.println("Enter 2nd digit");
	double num2 = s.nextDouble();
	
double result=0;
	
switch(Operator){
	case '+':
		result=num1+num2;
		break;
		 
	case '-':
		result=num1-num2;
		break;
	case '*':
		result=num1*num2;
		break;
	case '/':	
		if(num2!=0) {
		result=num1/num2;
		System.out.println("div by 0 is not allowed");}
		else {
System.out.println("Error: Division by zero is not allowed");
return;
		}
		break;
	default:System.out.println("Error: Invalid operator entered.");
		return;
		}

//Print the final result in a formatted way
System.out.printf("%.2f %c %.2f = %.2f%n", num1, Operator, num2, result); 



}}
	


