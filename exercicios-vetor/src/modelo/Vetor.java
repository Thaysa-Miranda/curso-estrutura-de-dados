package modelo;

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos;
	private int contador;

	public Vetor(int tamanho) {

		this.alunos = new Aluno[tamanho];
		this.contador = 0;

	}

	public void insereAluno(Aluno al) {

		if ((contador >= 0) && (contador <= alunos.length - 1)) {
			alunos[contador] = al;
			contador++;

		}
	}

	public Aluno buscaAluno(int posicao) {

		if ((posicao >= 0) && (posicao < contador)) {

			return alunos[posicao];

		} else {

			throw new IllegalArgumentException("Posição inválida");
		}

	}

	public boolean contemAluno(String nome, String matricula) {

		for (int i = 0; i < this.contador; i++) {

			if (alunos[i].getNome().equalsIgnoreCase(nome) && (alunos[i].getMatricula().equalsIgnoreCase(matricula))) {

				return true;
			}

		}

		return false;
	}

	public void adicionaElementoPosicao(Aluno al, int posicao) {

		if ((posicao >= 0) && (posicao < alunos.length)) {

			if (alunos[posicao] == null) {

				alunos[posicao] = al;
			}

			else {

				System.out.println("Posição está ocupada.");
			}

		}

	}

	public int pegaTamanho() {

		return this.contador;

	}

	@Override
	public String toString() {

		StringBuilder elementos = new StringBuilder();
		elementos.append("[");

		for (int i = 0; i < alunos.length; i++) {

			elementos.append(alunos[i]);
			elementos.append(",");
		}

		elementos.append("]");

		return elementos.toString();
	}

}
