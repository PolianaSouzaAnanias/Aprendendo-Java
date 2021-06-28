package capitulo02;

// O �ndice de massa corporal, mais conhecido pela sigla IMC, � um �ndice adotado pela OMS (Organiza��o Mundial de Sa�de), que � usado para o diagn�stico do sobrepeso e da obesidade. O IMC pode ser facilmente calculado a partir de dois simples dados: peso e altura.
// A f�rmula para o seu c�lculo eu vou passar aqui pra voc� e sua miss�o � criar um pequeno programa que fa�a esse c�lculo automaticamente. Veja aqui a f�rmula: IMC = PESO / (ALTURA * ALTURA)
// A primeira coisa a se fazer � declarar duas vari�veis que v�o receber o peso e a altura, respectivamente. Esses dois valores ser�o informados pelo usu�rio - da mesma forma como fizemos na aula anterior.
// Depois dessas duas vari�veis, vai ser preciso declarar uma terceira que vai guardar o resultado da multiplica��o da altura por ela mesma (� a parte "ALTURA * ALTURA" da f�rmula acima).
// Agora basta dividir o peso pela multiplica��o que foi feita. O resultado dessa divis�o j� ser� o final. Guarde o resultado dessa divis�o em uma quarta vari�vel que ser� utilizada para exibir para o usu�rio.

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

		System.out.print("Digite o seu peso: "); // // Exibir mensagem no console.
		peso = scanner.nextDouble(); // A vari�vel 'peso' vai armazenar um valor do tipo num�rico (decimal).

		System.out.print("Digite a sua altura em metros (Ex: 1.55): "); // Escrever mensagem no console.
		altura = scanner.nextDouble(); // A vari�vel 'altura' vai armazenar um valor do tipo num�rico (decimal).

		double resultado = (peso / (altura * altura));

		System.out.println("Seu �ndice de massa corporal �: " + format.format(resultado)); // Exibir mensagem na tela com o resultado.

		if (resultado > 17 && resultado < 25) {
			System.out.println("Parab�ns! Voc� est� dentro do peso adequado."); // Exibir mensagem na tela.
		}
	}
}
