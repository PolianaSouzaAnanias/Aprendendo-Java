package capitulo02;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Inst�ncia da classe scaner que � respos�vel por ler o teclado.
		scanner.useLocale(Locale.ENGLISH);
		DecimalFormat format = new DecimalFormat("#.##");
		double altura = 0.0;
		double peso = 0.0;

		System.out.print("Digite o seu peso: "); // Escrever mensagem no console.
		peso = scanner.nextDouble(); // A vari�vel 'peso' vai armazenar um valor do tipo num�rico (decimal).

		System.out.print("Digite a sua altura em metros (Ex: 1.55): "); // Escrever mensagem no console.
		altura = scanner.nextDouble(); // A vari�vel 'altura' vai armazenar um valor do tipo num�rico (decimal).

		double resultado = (peso / (altura * altura));

		System.out.println("Seu �ndice de massa corporal �: " + format.format(resultado)); // Escrever resultado no console.

		if (resultado > 17 && resultado < 25) {
			System.out.println("Parab�ns! Voc� est� dentro do peso adequado.");
		}
	}
}
