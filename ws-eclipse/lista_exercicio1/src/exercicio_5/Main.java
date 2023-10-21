package exercicio_5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */

		Locale.setDefault(Locale.US);

		int qtd;
		double vlunit, total1, total2, pagar;

		Scanner sc = new Scanner(System.in);

		System.out.println("Dados do produto 1:");
		System.out.println("COD | NuPeca | VlUnit");

		sc.nextInt();
		qtd = sc.nextInt();
		vlunit = sc.nextDouble();
		total1 = vlunit * qtd;

		System.out.println("Dados do produto 2:");
		System.out.println("COD | QTD | VlUnit");

		sc.nextInt();
		qtd = sc.nextInt();
		vlunit = sc.nextDouble();
		total2 = vlunit * qtd;

		pagar = total1 + total2;

		System.out.printf("Valor A PAGAR = R$ %.2f", pagar);

		sc.close();
	}

}
