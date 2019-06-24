package palimdromo;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		boolean palindromo = false;

		System.out.println("Digite uma frase: ");
		String frase = teclado.nextLine();

		frase = frase.replaceAll(" ", ""); // Função que remove todos os espaços

		int meio = frase.length() / 2;

		for (int i = 0; i < meio; i++) {

			if (frase.charAt(i) != frase.charAt(frase.length() - 1 - i)) {
				palindromo = false;
			} else {
				palindromo = true;
			}

		}

		if (palindromo == true) {
			System.out.println("Esta frase é uma palindromo");
		} else {
			System.out.println("Esta frase não é uma palindromo");
		}

		teclado.close();
	}

}
