package capitulo05;
// Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. Ser�o dois par�metros para receber um para receber a nota de portugu�s e outro para receber as de matem�tica.
// A prova, no total, vale 200 pontos - 100 para cada mat�ria. A nota m�nima total para passar � igual ou maior que 150. Entretanto, o candidato n�o pode tirar menos do que 60 pontos em qualquer uma das duas mat�rias, ou seja, se tirar 59 em portugu�s e 100 em matem�tica (totalizando uma nota maior do que o total necess�rio que � 150) ele n�o conseguir� a vaga.
// No final mostre para o candidato se ele conseguiu ou n�o.

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer resultado = null;
		
		System.out.println("CALCULADORA DE NOTAS - CONCURSO P�BLICO");
		System.out.println(".........................");
		
		System.out.print("Digite a nota de Portugu�s: "); // Exibir mensagem na tela.
		Integer primeiraMateria = scanner.nextInt(); // A vari�vel 'primeiraMateria' armazere o valor de entrada, digitado pelo usu�rio.
		
		
		System.out.print("Digite a nota de Matem�tica: "); // Exibir mensagem na tela.
		Integer segundaMateria = scanner.nextInt(); // A vari�vel 'segundaMateria' armazena o valor de entrada, digitado pelo usu�rio.
		
		if (resultado) { // Se nota for maior de 7...
			System.out.println("Parab�ns! Voc� passou de ano."); // Exibir mensagem no console, caso a nota do aluno for maior ou igual a 7.
		} else { // Se n�o...
			System.out.println("Infelizmente, ficou de recupera��o."); // Exibir mensagem no console, caso a nota do aluno for menor de 7.
		}
		
		scanner.close();
	}
		
	}

}
