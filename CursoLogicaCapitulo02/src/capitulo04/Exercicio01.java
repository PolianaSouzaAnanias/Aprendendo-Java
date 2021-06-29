package capitulo04;

import java.util.Scanner;

// Para criar uma calculadora simples voc� vai precisar receber tr�s informa��es pelo console. S�o os dois n�meros que participar�o da opera��o e tamb�m a opera��o que ser� realizada.
// Voc� vai receber o primeiro n�mero, depois vai receber qual � a opera��o e, por �ltimo, o segundo n�mero.
// Para os n�meros que voc� vai receber pelo console, pode utilizar a mesma funcionalidade que j� utilizamos aqui no curso - o *Scanner*. Para receber a opera��o voc� pode receber tamb�m um n�mero que vai indicar a mesma. Por exemplo, o n�mero 1 ser� adi��o, o 2 subtra��o, o 3 multiplica��o e o 4 divis�o.
// Com esses tr�s valores - os dois n�meros e qual ser� a opera��o - voc� pode utilizar a estrutura de decis�o if para s� realizar a opera��o que o usu�rio escolheu.

public class Exercicio01 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Integer resultado = null;
	
	System.out.println("CALCULADORA"); 
	System.out.print("Digite um n�mero: "); // Exibir mensagem na tela.
	Integer primeiroNumero = scanner.nextInt(); // A vari�vel 'primeiroNumero' armazere o valor de entrada, digitado pelo usu�rio.
	
	System.out.print("Escolha o tipo de oper��o: + - * / "); // Exibir mensagem na tela.
	String tipoOperacao = scanner.next(); // A vari�vel 'tipoOperacao' armazena a opera��o que o usu�rio deseja realizar.
	
	
	System.out.print("Digite outro n�mero: "); // Exibir mensagem na tela.
	Integer segundoNumero = scanner.nextInt(); // A vari�vel 'segundoNumero' armazena o valor de entrada, digitado pelo usu�rio.
	
	if(tipoOperacao.equals("+")) {
		resultado = primeiroNumero+segundoNumero;
	}else if(tipoOperacao.equals("-")) {
		resultado = primeiroNumero-segundoNumero;
	}else if(tipoOperacao.equals("*")) {
		resultado = primeiroNumero*segundoNumero;
	}else if(tipoOperacao.equals("/")) {
		resultado = primeiroNumero/segundoNumero;
	}
	
	System.out.println("Resultado da opera��o: " + resultado); // Exibe o resultado da opera��o.
	
	scanner.close();
}
}