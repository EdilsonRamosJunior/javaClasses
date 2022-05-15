package application;
import entities.CurrencyConverter;

import java.util.Scanner;

import entities.CurrencyConverter;

public class ProgramConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("What is the dollar price?");
		double dollar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double value = sc.nextDouble();
		double result = CurrencyConverter.converter(value, dollar);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		sc.close();
	}

}
