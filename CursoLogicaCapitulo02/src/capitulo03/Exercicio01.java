package capitulo03;
// Leia um n�mero no console e depois fa�a o c�lculo do quadrado desse n�mero e exiba o resultado no console. Lembrando que o quadrado de um n�mero � calculado multiplicando-se o n�mero por ele mesmo. Por exemplo, para encontrar o quadrado de 2 � preciso multiplicar o 2 por 2, tendo como resultado o n�mero 4.
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: "); // Exibir mensagem na tela.
		Integer numero = scanner.nextInt(); // A vari�vel 'numero' armazere o valor de entrada, digitado pelo usu�rio.
		
		Integer quadrado = numero * numero; // A vari�vel 'quadrado' armazena o resultado do calculo entre 'numero' * 'numero'.
		
		System.out.println("O quadrado de " + numero + " � " + quadrado + "."); // // Exibir mensagem na tela com o resultado obtido.
		
		scanner.close();
}
}
