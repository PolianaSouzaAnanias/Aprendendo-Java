package capitulo04;
// Crie um programa que receba o valor de um produto e exiba o valor final da compra. Esse valor final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00. Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.
// Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer resultado = null;
		
		System.out.println("PRODUTOS EM PROMOÇÃO"); 
		System.out.println("-------------------------------"); 
		System.out.print("Digite o valor do produto: "); // Exibir mensagem na tela.
		double valorProduto = scanner.nextDouble(); // A variável 'primeiroNumero' a

double valorFrete = 0;
		
if (valorProduto < 100) {
valorProduto = valorProduto + 15;
} 

	System.out.println("Valor final da compra: " + valorProduto + valorFrete); 
	}

}
