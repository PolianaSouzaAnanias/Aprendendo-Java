package capitulo08;
// Cre uma pequena calculadora de subtra��o e adi��o.
// Crie um programa que pe�a dois n�meros do usu�rio e tamb�m qual a opera��o ele deseja fazer - adi��o ou subtra��o. Para cada opera��o, voc� deve construir um m�todo que realize a mesma, ou seja, teremos um m�todo para adi��o, que vai receber dois n�meros como par�metros e retornar o resultado da soma entre eles, e outro m�todo para subtra��o.
// Fique a vontade para implementar multiplica��o e divis�o tamb�m.

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);		
		
		Double numeroEsquerda = informeNumero(scanner);
		
		imprimirTraco();
		
		Integer operacao = escolhaAOperacao(scanner);
		
		imprimirTraco();
		
		Double numeroDireita = informeNumero(scanner);
		
		imprimirTraco();
		
		Double resultado = realizarCalculo(operacao, numeroEsquerda, numeroDireita);
		
		System.out.println("O resultado �: " + resultado);
		
		scanner.close();
	}	
	
	static Double realizarCalculo(Integer operacao, Double numeroEsquerda, Double numeroDireita) {
		Double resultado = null;
		
		switch (operacao) {
		case 0:
			resultado = subtracao(numeroEsquerda, numeroDireita);
			break;
		case 1:
			resultado = adicao(numeroEsquerda, numeroDireita);
			break;
		default:
			System.err.println("Escolha uma opera��o v�lida!");
			System.exit(0);
		}
		
		return resultado;
	}
	
	static Double subtracao(Double numeroEsquerda, Double numeroDireita) {
		return numeroEsquerda - numeroDireita;
	}
	
	static Double adicao(Double numeroEsquerda, Double numeroDireita) {
		return numeroEsquerda + numeroDireita;
	}
	
	static Integer escolhaAOperacao(Scanner scanner) {
		System.out.println("ESCOLHA A OPERA��O");
		
		String[] operacoes = new String[] {"Subtra��o", "Adi��o"};
		
		for(int i = 0; i < operacoes.length; i++) {
			System.out.println("[" + i + "] " + operacoes[i]);
		}
		
		System.out.print("Digite a opera��o: ");
		
		return scanner.nextInt();
	}
	
	static Double informeNumero(Scanner scanner) {
		System.out.print("Informe o n�mero: ");
		return scanner.nextDouble();
	}
	
	static void imprimirTraco() {
		System.out.println("---------------------------------------");
	}

}
