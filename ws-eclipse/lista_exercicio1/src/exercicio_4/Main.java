package exercicio_4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod, hr;
		double price_hr, salary;

		System.out.print("Number: ");
		cod = sc.nextInt();

		System.out.print("Hours: ");
		hr = sc.nextInt();

		System.out.println("Hour price: ");
		price_hr = sc.nextDouble();

		salary = price_hr * hr;

		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f", cod, salary);

		sc.close();

	}

}
