package capitulo03;

// Crie um programa que lê, do console, o nome e o sobrenome de uma pessoa e depois imprime o nome completo. Para isso, você vai precisar de duas variáveis: a primeira você pode chamar de "nome" e a segunda de "sobrenome". Por último, você vai juntar o nome e o sobrenome em uma única impressão.

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: "); // Exibir mensagem na tela.
		String nome = scanner.nextLine(); // A variável 'nome' armazena o nome digitado pelo usuário.
		
		System.out.print("Digite o sobrenome: "); // Exibir mensagem na tela.
		String sobrenome = scanner.nextLine(); // A variável 'sobrenome' armazena o sobrenome digitado pelo usuário.
		
		System.out.println("Olá " + nome + " " + sobrenome + "!"); // Exibi mensagem na tela através da concatenação.
		
		scanner.close();
}
}