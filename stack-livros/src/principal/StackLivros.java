package principal;

import java.util.*;
import modelo.*;

/*Exercício:
-Insira 6 livros na pilha, cada livro contém:
nome, isbn, autor e ano de lancamento.
-Crie um exemplo para usar cada método da classe 
Stack*/

public class StackLivros {

	public static void main(String[] args) {

		Livro livro1 = new Livro();
		livro1.setNome("ABC");
		livro1.setIsbn("000-111");
		livro1.setAutor("Ana Machado");
		livro1.setAno_lancamento(1995);

		Livro livro2 = new Livro();
		livro2.setNome("DEF");
		livro2.setIsbn("111-000");
		livro2.setAutor("Felipe Gusmão");
		livro2.setAno_lancamento(1998);

		Livro livro3 = new Livro();
		livro3.setNome("GHI");
		livro3.setIsbn("222-111");
		livro3.setAutor("Luiz Felipe");
		livro3.setAno_lancamento(2000);

		Livro livro4 = new Livro();
		livro4.setNome("JLM");
		livro4.setIsbn("333-000");
		livro4.setAutor("Luiza Santos");
		livro4.setAno_lancamento(2007);

		Livro livro5 = new Livro();
		livro5.setNome("NOP");
		livro5.setIsbn("444-000");
		livro5.setAutor("Ana Rodrigues");
		livro5.setAno_lancamento(2003);

		Livro livro6 = new Livro();
		livro6.setNome("QRS");
		livro6.setIsbn("555-111");
		livro6.setAutor("Sandra Albuquerque");
		livro6.setAno_lancamento(2010);

		Stack<Livro> pilhaLivros = new Stack<>();

		pilhaLivros.push(livro1);
		pilhaLivros.push(livro2);
		pilhaLivros.push(livro3);
		pilhaLivros.push(livro4);
		pilhaLivros.push(livro5);
		pilhaLivros.push(livro6);

		System.out.println("Quais são os livros da pilha? " + pilhaLivros);

		System.out.println("Qual o livro que está no topo da pilha de livros? " + pilhaLivros.peek());

		System.out.println("Qual o tamanho da pilha? " + pilhaLivros.size());

		System.out.println("O livro NOP está na pilha de livros? " + pilhaLivros.contains(livro5));

		System.out.println("Qual o livro que está na terceira posição?: " + pilhaLivros.get(3));

		System.out.println("O livro DEF está em qual posição? " + pilhaLivros.indexOf(livro2));

		System.out.println("Remova um livro da pilha: " + pilhaLivros.pop());

		System.out.println("Qual o tamanho da pilha? " + pilhaLivros.size());

		System.out.println("Quais são os livros da pilha? " + pilhaLivros);

		System.out.println("A pilha está vazia? " + pilhaLivros.isEmpty());

		while (!pilhaLivros.isEmpty()) {

			System.out.println("Removendo..." + pilhaLivros.pop());
		}

		System.out.println("A pilha está vazia? " + pilhaLivros.isEmpty());

		System.out.println(pilhaLivros);

	}

}
