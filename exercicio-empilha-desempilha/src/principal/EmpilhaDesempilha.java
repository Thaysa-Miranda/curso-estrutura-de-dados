package principal;

import java.util.*;

/*Escreva um programa que leia 10 números inteiros. Para cada número lido, 
 * verifique e codifique de acordo com as regras a seguir:
 * Se o número for par, empilhe na pilha;
 * Se o número for ímpar, desempilhe um número da pilha. Caso a pilha
 * esteja vazia mostre uma mensagem.
 * Se ao final do programa a pilha não estiver vazia, desempilhe todos os elementos
 * imprimindo-os na tela
 */

public class EmpilhaDesempilha {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Stack<Integer> pilha = new Stack<>();
		int numero = 0;
		int contador = 10;
		int contadorPar = 0;

		while (contador >= 0) {

			System.out.println("Informe um número:");
			numero = entrada.nextInt();
			contador--;

			if (numero % 2 == 0) {

				pilha.push(numero);
				System.out.println("Número empilhado");
				contadorPar++;

			} else if ((numero % 2 != 0) && !(pilha.isEmpty())) {

				System.out.println("Número desempilhado: " + pilha.pop());
				contadorPar--;

			} else if (pilha.isEmpty()) {

				System.out.println("Pilha está vazia");

			}

		}

		if (!(pilha.isEmpty())) {

			for (int i = 0; i < contadorPar; i++) {

				System.out.println("Desempilhando..." + pilha.pop());

			}
		}

		else {

			System.out.println("Pilha já está vazia");
		}

		System.out.println(pilha);

	}

}
