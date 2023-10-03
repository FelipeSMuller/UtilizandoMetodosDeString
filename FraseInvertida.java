package exerciciosLivro;

import javax.swing.JOptionPane;

public class FraseInvertida {

	public static void main(String[] args) {

		/*
		 * Construa uma classe que receba uma frase qualquer e mostre essa frase de trás
		 * para a frente e sem espaços em branco
		 */

		char caractere;

		String frase = "";

		do {

			try {

				frase = JOptionPane.showInputDialog(null, "Insira uma frase");

				if (frase.isEmpty() || frase == null) {

					JOptionPane.showMessageDialog(null, "O campo não pode estar vazio, preencha corretamente");
				}

				else if (frase.length() >= 20) {
					JOptionPane.showMessageDialog(null,

							"Você inseriu uma frase que excede o limite de caracteres, digite uma frase menor");
				}

				else {

					String fraseInvertida = "";

					for (int i = frase.length() - 1; i >= 0; i--) {

						caractere = frase.charAt(i);

						fraseInvertida += caractere;

					}

					frase = frase.toLowerCase();

					frase = frase.trim();

					fraseInvertida = fraseInvertida.toLowerCase();

					fraseInvertida = fraseInvertida.replace(" ", "");

					fraseInvertida = fraseInvertida.trim();

					JOptionPane.showMessageDialog(null,
							"Frase fornecida = " + frase + "\nFrase após alteração = " + fraseInvertida);

				}

			} catch (NullPointerException erro) {

				JOptionPane.showMessageDialog(null, "Você fechou o programa incorretamente!!");
			}

		} while (frase != null);

	}

}
