package lacocondicional;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		float numero1 = scanner.nextFloat();

		System.out.print("Digite o segundo número: ");
		float numero2 = scanner.nextFloat();

		System.out.println("Escolha uma operação:");
		System.out.println("1-soma\n" + "2-subtração\n" + "3-multiplicação\n" + "4-divisão");
		int codigoOperacao = scanner.nextInt();

		float soma = 0;
		float subtracao = 0;
		float multiplicacao = 0;
		float divisao = 0;

		switch (codigoOperacao) {
		case 1:
			soma = numero1 + numero2;
			System.out.println(numero1 + " + " + numero2 + " = " + soma);
			break;

		case 2:
			subtracao = numero1 - numero2;
			System.out.println(numero1 + " - " + numero2 + " = " + subtracao);
			break;
		case 3:
			multiplicacao = numero1 * numero2;
			System.out.println(numero1 + " * " + numero2 + " = " + multiplicacao);
			break;

		case 4:
			divisao = numero1 / numero2;
			System.out.println(numero1 + " / " + numero2 + " = " + divisao);
			break;

		default:
			System.out.println("Operação inválida!");

		}

		scanner.close();

	}

}
