package application;

import java.util.Scanner;

import util.calculator;

public class Program {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = calculator.circunferencia(raio);
		
		double v = calculator.volume(raio);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", calculator.PI);
		
		
		
		
		sc.close();

	}
	

}
