package principal;

import java.util.*;

/*Escreva um programa que testa se uma sequencia 
 * de caracteres fornecida pelo o usuario, é um palíndromo.
 */

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Stack<Character> pilhaLetras = new Stack<>();
		String palavra;
		String novaPalavra = "";
		int contador = 0;

		System.out.println("Informe uma palavra:");
		palavra = entrada.nextLine();

		contador = palavra.length();

		for (int i = 0; i < contador; i++) {

			pilhaLetras.push(palavra.charAt(i));

		}

		System.out.println(pilhaLetras);

		for (int i = 0; i < contador; i++) {

			novaPalavra += pilhaLetras.pop();

		}

		System.out.println(novaPalavra);

		if (palavra.equals(novaPalavra)) {

			System.out.println("É Palíndromo.");
		} else {

			System.out.println("Não é Palíndromo.");
		}

	}
}
