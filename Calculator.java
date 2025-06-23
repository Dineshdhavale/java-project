package com.elevateLabs;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		double number1 = sc.nextDouble();
		
		System.out.println("Enter the second number");
		double number2 = sc.nextDouble();
		
		int operator = sc.nextInt();
		
		switch(operator) {
		
		case 1:System.out.println(number1 + number2);
		break;
		
		case 2:System.out.println(number1 - number2);
		break;
		
		case 3:System.out.println(number1 * number2);
		break;
		
		case 4:if(number2 == 0) {
			System.out.println("Invalid Division");
        } else {
     System.out.println(number1/number2);
        }
     break;
     
   case 5 : if(number2 == 0) {
     System.out.println("Invalid Division");
     } else {
     System.out.println(number1%number2);
 }
   break; 
   default : System.out.println("Invalid Operator");
		}
		}
	}

