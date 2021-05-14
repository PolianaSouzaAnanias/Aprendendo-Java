package troco;
import java.util.Scanner;

public class CalcularValorTroco {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //
		
		System.out.print("Digite o valor do produto: "); //Escrever mensagem no console.
		Double valorProduto = scanner.nextDouble(); //A vari�vel 'valorProduto' vai armazenar um valor do tipo num�rico (decimal).
		
		System.out.print("Digite quantidade passada pelo cliente: "); //Escrever mensagem no console.
		Double valorPassadoPeloCliente = scanner.nextDouble(); //A vari�vel 'valorPassadoPeloCliente' vai armazenar um valor do tipo num�rico (decimal).
		
		Double resultado = valorPassadoPeloCliente - valorProduto; //A vari�vel  'resoltado' realizar� o calculo dos valores recebidos.
		
		System.out.println("Troco: " + resultado); // Comando para mostrar o resultado no console.
		
		scanner.close(); //Encerra o scanner.
		}
}
