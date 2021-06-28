package capitulo02;

// O índice de massa corporal, mais conhecido pela sigla IMC, é um índice adotado pela OMS (Organização Mundial de Saúde), que é usado para o diagnóstico do sobrepeso e da obesidade. O IMC pode ser facilmente calculado a partir de dois simples dados: peso e altura.
// A fórmula para o seu cálculo eu vou passar aqui pra você e sua missão é criar um pequeno programa que faça esse cálculo automaticamente. Veja aqui a fórmula: IMC = PESO / (ALTURA * ALTURA)
// A primeira coisa a se fazer é declarar duas variáveis que vão receber o peso e a altura, respectivamente. Esses dois valores serão informados pelo usuário - da mesma forma como fizemos na aula anterior.
// Depois dessas duas variáveis, vai ser preciso declarar uma terceira que vai guardar o resultado da multiplicação da altura por ela mesma (é a parte "ALTURA * ALTURA" da fórmula acima).
// Agora basta dividir o peso pela multiplicação que foi feita. O resultado dessa divisão já será o final. Guarde o resultado dessa divisão em uma quarta variável que será utilizada para exibir para o usuário.

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Instância da classe scaner que é resposável por ler o teclado.
		scanner.useLocale(Locale.ENGLISH);
		DecimalFormat format = new DecimalFormat("#.##");
		double altura = 0.0;
		double peso = 0.0;

		System.out.print("Digite o seu peso: "); // // Exibir mensagem no console.
		peso = scanner.nextDouble(); // A variável 'peso' vai armazenar um valor do tipo numérico (decimal).

		System.out.print("Digite a sua altura em metros (Ex: 1.55): "); // Escrever mensagem no console.
		altura = scanner.nextDouble(); // A variável 'altura' vai armazenar um valor do tipo numérico (decimal).

		double resultado = (peso / (altura * altura));

		System.out.println("Seu índice de massa corporal é: " + format.format(resultado)); // Exibir mensagem na tela com o resultado.

		if (resultado > 17 && resultado < 25) {
			System.out.println("Parabéns! Você está dentro do peso adequado."); // Exibir mensagem na tela.
		}
	}
}
