package arith;

import java.util.Scanner;

public class calci{
	public static void main(String[] args) {
		//variables
		char operator;
		double num1, num2, res;
		System.out.println("choose the first number: ");
		//creating scanner object
		Scanner input = new Scanner(System.in);
		num1 = input.nextDouble();
		System.out.println("choose an operator, +,-,*,/ : ");
		operator = input.next().charAt(0);
		System.out.println("enter the second number: ");
		num2 = input.nextDouble();
		switch(operator) {
		//addition
		case'+':
			res = num1+num2;
			System.out.println(num1+" + "+num2+" = "+res);
			break;
		//subtraction
		case'-':
			res=num1-num2;
			System.out.println(num1+" - "+num2+" = "+res);
			break;
		//multiplication
		case'*':
			res=num1*num2;
			System.out.println(num1+" * "+num2+" = "+res);
			break;
		//division
		case'/':
			res=num1/num2;
			System.out.println(num1+" / "+num2+" = "+res);
			break;
		//if any other operators are chosen..
		default:
			System.out.println("invalid operator");
		}
	}
}