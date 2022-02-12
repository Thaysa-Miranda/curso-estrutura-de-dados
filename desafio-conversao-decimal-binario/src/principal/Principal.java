package principal;

import java.util.Scanner;
import java.util.Stack;

/*Usando a classe Pilha ou Stack, desenvolva um algoritmo
 * que faça a conversao de numeros decimais para binario.
 */

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Stack<Integer> pilhaNumeros = new Stack<>();
		String binario = "";
		int resto = 0;
		int numero = 0;

		System.out.println("Informe um numero:");
		numero = entrada.nextInt();

		while (numero > 0) {

			resto = numero % 2;

			pilhaNumeros.push(resto);

			numero /= 2;

		}

		while (!pilhaNumeros.isEmpty())

			binario += pilhaNumeros.pop();

		System.out.println(binario);

	}

}
