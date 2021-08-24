package capitulo03;
import java.util.Scanner;

// O seu programa deve receber a nota do aluno pelo console e depois voc� vai fazer uma opera��o l�gica para saber se a nota do aluno � maior que 7. O resultado dessa opera��o l�gica deve ser atribuido a uma vari�vel do tipo Boolean.
// Por �ltimo, voc� deve utilizar a vari�vel do tipo Boolean com a estrutura de decis�o if para imprimir, no console, uma mensagem que vai dizer se o aluno passou ou n�o passou.

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sua nota: "); // Exibir mensagem no console.
		Double notaDoAluno = scanner.nextDouble(); // A vari�vel "notaDoAluno' recebe o valor digitado pelo usu�rio.
		
		Boolean passouDeAno = false; // A vari�vel 'passouDeAno' para verificar a aprova��o ou n�o do aluno. 
		passouDeAno = notaDoAluno >= 7; // Realiza a valida��o se a nota do aluno � maior que 7.
		
		if (passouDeAno) { // Se nota for maior de 7...
			System.out.println("Parab�ns! Voc� foi aprovado(a)."); // Exibir mensagem no console, caso a nota do aluno for maior ou igual a 7.
		} else { // Se n�o...
			System.out.println("Infelizmente, ficou de recupera��o."); // Exibir mensagem no console, caso a nota do aluno for menor de 7.
		}
		
		scanner.close();
	}
}
