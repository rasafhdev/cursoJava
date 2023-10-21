package exercicio_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Faça um programa para ler dois valores inteiros,
		 * e depois mostrar na tela a soma desses números
		 * com uma mensagem explicativa, conforme exemplos.
		 */
		
		Scanner sc = new Scanner(System.in);

		int soma, n1, n2;

		System.out.print("1º Algarismo: ");
		n1 = sc.nextInt();
		System.out.print("2º Algarismo: ");
		n2 = sc.nextInt();

		soma = n1 + n2;

		System.out.printf("Soma = %d", soma);

		sc.close();

	}

}
