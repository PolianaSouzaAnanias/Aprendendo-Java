package capitulo05;
// Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática.
// A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150. Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja, se tirar 59 em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá a vaga.
// No final mostre para o candidato se ele conseguiu ou não.

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer resultado = null;
		
		System.out.println("CALCULADORA DE NOTAS - CONCURSO PÚBLICO");
		System.out.println(".........................");
		
		System.out.print("Digite a nota de Português: "); // Exibir mensagem na tela.
		Integer primeiraMateria = scanner.nextInt(); // A variável 'primeiraMateria' armazere o valor de entrada, digitado pelo usuário.
		
		
		System.out.print("Digite a nota de Matemática: "); // Exibir mensagem na tela.
		Integer segundaMateria = scanner.nextInt(); // A variável 'segundaMateria' armazena o valor de entrada, digitado pelo usuário.
		
		if (resultado) { // Se nota for maior de 7...
			System.out.println("Parabéns! Você passou de ano."); // Exibir mensagem no console, caso a nota do aluno for maior ou igual a 7.
		} else { // Se não...
			System.out.println("Infelizmente, ficou de recuperação."); // Exibir mensagem no console, caso a nota do aluno for menor de 7.
		}
		
		scanner.close();
	}
		
	}

}
