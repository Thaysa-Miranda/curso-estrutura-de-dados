package principal;

import java.util.*;

/*Escreva um programa para verificar se uma expressao matematica
tem os parenteses agrupados de forma correta, isto é:

(1)se o numero de parenteses agrupados a esquerda e a direita sao iguais;
(2)se todo parentese aberto é seguido posteriormente por um fechamento de parentese.*/

public class Principal {

	public static void main(String[] args) {

		Stack<Character> pilhaSimbolos = new Stack<>();
		String expressaoMat = "(A + (B + C ) - D)";
		// String expressaoMat = "(A + (B + C - D)";
		// String expressaoMat = "(A + (B + C )) - D)";
		// String expressaoMat = "((A + B) + (C - D))";
		char parenteseAberto = '(';
		char parenteseFechado = ')';
		int contParenteseAberto = 0;
		int contParenteseFechado = 0;

		for (int i = 0; i < expressaoMat.length(); i++) {

			if (expressaoMat.charAt(i) == parenteseAberto) {

				System.out.println(pilhaSimbolos.push(expressaoMat.charAt(i)));

				contParenteseAberto++;

			} else if (expressaoMat.charAt(i) == parenteseFechado) {

				System.out.println(pilhaSimbolos.push(expressaoMat.charAt(i)));

				contParenteseFechado++;

			}
		}

		if (contParenteseAberto == contParenteseFechado) {

			System.out.println("A pilha esta balanceada");
		}

		else {

			System.out.println("A pilha esta desbalanceada.");
		}

	}

}
