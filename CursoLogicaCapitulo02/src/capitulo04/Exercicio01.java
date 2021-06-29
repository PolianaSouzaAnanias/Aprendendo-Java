package capitulo04;

import java.util.Scanner;

// Para criar uma calculadora simples você vai precisar receber três informações pelo console. São os dois números que participarão da operação e também a operação que será realizada.
// Você vai receber o primeiro número, depois vai receber qual é a operação e, por último, o segundo número.
// Para os números que você vai receber pelo console, pode utilizar a mesma funcionalidade que já utilizamos aqui no curso - o *Scanner*. Para receber a operação você pode receber também um número que vai indicar a mesma. Por exemplo, o número 1 será adição, o 2 subtração, o 3 multiplicação e o 4 divisão.
// Com esses três valores - os dois números e qual será a operação - você pode utilizar a estrutura de decisão if para só realizar a operação que o usuário escolheu.

public class Exercicio01 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Integer resultado = null;
	
	System.out.println("CALCULADORA"); 
	System.out.print("Digite um número: "); // Exibir mensagem na tela.
	Integer primeiroNumero = scanner.nextInt(); // A variável 'primeiroNumero' armazere o valor de entrada, digitado pelo usuário.
	
	System.out.print("Escolha o tipo de operção: + - * / "); // Exibir mensagem na tela.
	String tipoOperacao = scanner.next(); // A variável 'tipoOperacao' armazena a operação que o usuário deseja realizar.
	
	
	System.out.print("Digite outro número: "); // Exibir mensagem na tela.
	Integer segundoNumero = scanner.nextInt(); // A variável 'segundoNumero' armazena o valor de entrada, digitado pelo usuário.
	
	if(tipoOperacao.equals("+")) {
		resultado = primeiroNumero+segundoNumero;
	}else if(tipoOperacao.equals("-")) {
		resultado = primeiroNumero-segundoNumero;
	}else if(tipoOperacao.equals("*")) {
		resultado = primeiroNumero*segundoNumero;
	}else if(tipoOperacao.equals("/")) {
		resultado = primeiroNumero/segundoNumero;
	}
	
	System.out.println("Resultado da operação: " + resultado); // Exibe o resultado da operação.
	
	scanner.close();
}
}