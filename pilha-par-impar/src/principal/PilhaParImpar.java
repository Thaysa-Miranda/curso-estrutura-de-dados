package principal;

import java.util.*;

/*Escreva um programa que leia 10 números. Para cada número lido,
verifique e codifique de acordo com as regras a seguir:
-Se o número for par, empilhe na pilha chamada par;
-Se o número for impar, empilhe na pilha chamada impar;
-Se o numero for zero, desempilhe um elemento de cada pilha. Se a pilha
estiver vazia, mostre uma mensagem de erro na tela;
Ao final do programa desempilhe todos os elementos das suas pilhas, 
imprimindo-os na tela
*/
public class PilhaParImpar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Stack<Integer> pilhaPar = new Stack<>();
		Stack<Integer> pilhaImpar = new Stack<>();
		int numero;

		for (int i = 0; i < 10; i++) {

			System.out.println("Informe um número:");
			numero = entrada.nextInt();

			if (numero != 0 && numero % 2 == 0) {
				System.out.println("Número empilhado: " + pilhaPar.push(numero));
			}

			else if ((numero == 0) && (!pilhaPar.isEmpty()) && (!pilhaImpar.isEmpty())) {
				System.out.println("Número desempilhado: " + pilhaPar.pop());
				System.out.println("Número desempilhado: " + pilhaImpar.pop());

			} else if ((numero == 0) && (!pilhaPar.isEmpty()) && (pilhaImpar.isEmpty())) {
				System.out.println("Número desempilhado: " + pilhaPar.pop());
				System.out.println("A pilha ímpar está vazia: " + pilhaImpar);

			} else if ((numero == 0) && (!pilhaImpar.isEmpty()) && (pilhaPar.isEmpty())) {
				System.out.println("Número desempilhado: " + pilhaImpar.pop());
				System.out.println("A pilha par está vazia: " + pilhaPar);

			} else if ((numero == 0) && (pilhaImpar.isEmpty()) && (pilhaPar.isEmpty())) {
				System.out.println(
						"As pilhas estão vazias: " + "Pilha Par " + pilhaPar + " " + " Pilha Impar " + pilhaImpar);
			} else if (numero % 2 != 0) {
				System.out.println("Número empilhado: " + pilhaImpar.push(numero));
			}

		}

		while (!pilhaPar.isEmpty()) {

			System.out.println("Desempilhando.." + pilhaPar.pop());
		}

		while (!pilhaImpar.isEmpty()) {

			System.out.println("Desempilhando.." + pilhaImpar.pop());
		}

		System.out.println("A pilha Par está vazia: " + pilhaPar);
		System.out.println("A pilha Impar está vazia: " + pilhaImpar);

	}

}
