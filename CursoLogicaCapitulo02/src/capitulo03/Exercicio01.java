package capitulo03;
// Leia um número no console e depois faça o cálculo do quadrado desse número e exiba o resultado no console. Lembrando que o quadrado de um número é calculado multiplicando-se o número por ele mesmo. Por exemplo, para encontrar o quadrado de 2 é preciso multiplicar o 2 por 2, tendo como resultado o número 4.
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número: "); // Exibir mensagem na tela.
		Integer numero = scanner.nextInt(); // A variável 'numero' armazere o valor de entrada, digitado pelo usuário.
		
		Integer quadrado = numero * numero; // A variável 'quadrado' armazena o resultado do calculo entre 'numero' * 'numero'.
		
		System.out.println("O quadrado de " + numero + " é " + quadrado + "."); // // Exibir mensagem na tela com o resultado obtido.
		
		scanner.close();
}
}
