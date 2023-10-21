package exercicio_2;

import java.util.Scanner;

public class Main {

	/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
	 * valor da área deste círculo com quatro casas decimais conforme exemplos.
	 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double raio;
		System.out.print("Informe o valor do raio: ");
		raio = sc.nextDouble();

		double pi = 3.13159;
		double a = pi * (Math.pow(raio, 2));

		System.out.printf("A= %.4f", a);

		sc.close();

	}

}
