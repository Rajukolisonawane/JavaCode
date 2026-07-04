package Java_practice1;

public class testscanner {

	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in); //

		System.out.println("Enter first digit");
		double num1 = s.nextDouble();

		System.out.println("Enter any cal sign(+,-,*,/)");
		char operator = s.next().charAt(0); // Changed variable name to follow Java conventions

		System.out.println("Enter 2nd digit");
		double num2 = s.nextDouble();

		double result = 0; // Initialize result to prevent compilation errors

	


switch (operator) { //
case '+':
	result = num1 + num2;
	break;
case '-':
	result = num1 - num2;
	break;
case '*':
	result = num1 * num2;
	break;
case '/':
	if (num2 != 0) { // Check for division by zero
		result = num1 / num2;
	} else {
		System.out.println("Error: Division by zero is not allowed.");
		return; // Exit the program or method if an error occurs
	}
	break;
default:System.out.println("Error: Invalid operator entered.");
return; // Exit if the operator is invalid
}

// Print the final result in a formatted way
System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result); //

// Close the scanner when done
s.close(); //
}}