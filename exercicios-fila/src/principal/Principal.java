package principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Queue<Integer> fila = new LinkedList<>();

		// enfileirar
		fila.add(0);
		fila.add(1);
		fila.add(2);

		System.out.println(fila);

		// espiar fila
		System.out.println(fila.peek());

		// desenfileirar
		System.out.println(fila.remove());

		System.out.println(fila);
	}
}
