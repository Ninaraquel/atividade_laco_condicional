package lacocondicional;

import java.util.Scanner;

public class ComparadorDeSoma {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.print("Digite o número A:");
		a = leitor.nextInt();
		
		System.out.print("Digite o número B:");
		b = leitor.nextInt();
		
		System.out.print("Digite o número C:");
		c = leitor.nextInt();
		
		if((soma = a + b) > c ) {
			
			System.out.println("A Soma de A + B é Maior do que C");
			
		}else if((soma = a + b) < c) {
			System.out.println("A Soma de A + B é Menor do que C");
			
		}else {
			System.out.println("A Soma de A + B é Igual a C");
		}
		
		
	}

}
