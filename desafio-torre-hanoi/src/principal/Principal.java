package principal;

import java.util.*;

/*Usando a classe Pilha ou Stack, desenvolva um algoritmo
que resolva o quebra cabeça Torre de Hanoi*/

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Stack<Integer> torreOriginal = new Stack<>();
		Stack<Integer> torreDestino = new Stack<>();
		Stack<Integer> torreAuxiliar = new Stack<>();

		torreOriginal.push(3);
		torreOriginal.push(2);
		torreOriginal.push(1);

		while (!torreOriginal.isEmpty()) {

			if (torreDestino.isEmpty() && torreAuxiliar.isEmpty()) {

				torreDestino.push(torreOriginal.pop());
				torreAuxiliar.push(torreOriginal.pop());

			}

			else if (torreDestino.size() == 1 && torreAuxiliar.size() == 1) {

				torreAuxiliar.push(torreDestino.pop());
				torreDestino.push(torreOriginal.pop());

			}
		}

		while (torreDestino.size() != 3) {

			torreOriginal.push(torreAuxiliar.pop());
			torreDestino.push(torreAuxiliar.pop());
			torreDestino.push(torreOriginal.pop());

		}

		System.out.println(torreDestino);

	}

}
