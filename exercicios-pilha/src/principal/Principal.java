package principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Stack<Integer> pilha = new Stack();

		// Verificando se a pilha esta vazia
		System.out.println("A pilha esta vazia?" + pilha.isEmpty());

		// Empilhando
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);
		pilha.push(5);

		// Verificando se a pilha esta vazia
		System.out.println("A pilha esta vazia?" + pilha.isEmpty());

		// Verificando tamanho da pilha
		System.out.println("Qual o tamanho da pilha?" + pilha.size());

		// Elementos da pilha
		System.out.println(pilha);

		// Espiar a pilha
		System.out.println(pilha.peek());

		// Remover elemento
		System.out.println(pilha.pop());

		System.out.println(pilha);

	}
}
