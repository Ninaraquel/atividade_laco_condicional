package lacocondicional;

import java.util.Scanner;

public class CalcularTotalDaConta {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int codigo, quantidade;

		System.out.print("Digite um número de 1 a 6:");
		codigo = ler.nextInt();

		System.out.print("Digite a quantidade comprada:");
		quantidade = ler.nextInt();

		String produto = null;
		double preco = 0.0;

		switch (codigo) {
		case 1:
			produto = "Cachorro Quente";
			preco = 10.00;
			break;
		case 2:
			produto = "X-Salada";
			preco = 15.00;
			break;

		case 3:
			produto = "X-Bacon";
			preco = 18.00;
			break;

		case 4:
			produto = "Bauru";
			preco = 12.00;
			break;

		case 5:
			produto = "Refrigerante";
			preco = 8.00;
			break;

		case 6:
			produto = "Suco de laranja";
			preco = 13.00;
			break;
		}

		double valorTotal = quantidade * preco;
		System.out.println("Código do Produto: " + codigo);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Produto:" + produto);
		System.out.printf("Valor total: R$ %.2f", valorTotal);

		ler.close();

	}

}
