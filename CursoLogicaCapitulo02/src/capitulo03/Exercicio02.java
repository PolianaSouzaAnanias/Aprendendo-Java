package capitulo03;

// Crie um programa que l�, do console, o nome e o sobrenome de uma pessoa e depois imprime o nome completo. Para isso, voc� vai precisar de duas vari�veis: a primeira voc� pode chamar de "nome" e a segunda de "sobrenome". Por �ltimo, voc� vai juntar o nome e o sobrenome em uma �nica impress�o.

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: "); // Exibir mensagem na tela.
		String nome = scanner.nextLine(); // A vari�vel 'nome' armazena o nome digitado pelo usu�rio.
		
		System.out.print("Digite o sobrenome: "); // Exibir mensagem na tela.
		String sobrenome = scanner.nextLine(); // A vari�vel 'sobrenome' armazena o sobrenome digitado pelo usu�rio.
		
		System.out.println("Ol� " + nome + " " + sobrenome + "!"); // Exibi mensagem na tela atrav�s da concatena��o.
		
		scanner.close();
}
}