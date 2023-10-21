package exercicio_6;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre:
		 * a) a área do triângulo retângulo que tem A por base e C por altura.
		 * b) a área do círculo de raio C.(pi = 3.14159)
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B.
		 * e) a área do retângulo que tem lados A e B
		 */
		Locale.setDefault(Locale.US);

		double A, B, C, TRIANGULO_R, CIRC, TRAPEZIO, QUADRADO, RETANGULO;
		double PI = 3.14159;

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, entre com os dados separados por espaços: ");

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		TRIANGULO_R = (A * C) / 2;
		CIRC = PI * (Math.pow(C, 2));
		TRAPEZIO = ((A + B) * C) / 2;
		QUADRADO = Math.pow(B, 2);
		RETANGULO = A * B;

		System.out.printf(
				"TRIANGULO: %.3f%n" + "CIRCULO: %.3f%n" + "TRAPÉZIO: %.3f%n" + "QUADRADO: %.3f%n" + "RETANGULO: %.3f",
				TRIANGULO_R, CIRC, TRAPEZIO, QUADRADO, RETANGULO);

		sc.close();
	}

}
