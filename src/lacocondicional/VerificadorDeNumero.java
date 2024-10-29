package lacocondicional;

import java.util.Scanner;

public class VerificadorDeNumero {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int numero;

		System.out.print("Digite um número:");
		numero = leitor.nextInt();

		if (numero % 2 == 0 && numero > 0) {
			System.out.println("O número " + numero + " é par e positivo!");

		} else if (numero % 2 != 0 && numero < 0) {
			System.out.println("O Número " + numero + " é ímpar e negativo!");

		} else if (numero % 2 == 0 && numero < 0) {
			System.out.println("O Número " + numero + " é par e negativo!");

		} else {
			System.out.println("O Número " + numero + " é ímpar e positivo!");
		}

	}

}
