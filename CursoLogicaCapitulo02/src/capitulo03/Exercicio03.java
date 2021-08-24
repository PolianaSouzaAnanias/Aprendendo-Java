package capitulo03;
import java.util.Scanner;

// O seu programa deve receber a nota do aluno pelo console e depois você vai fazer uma operação lógica para saber se a nota do aluno é maior que 7. O resultado dessa operação lógica deve ser atribuido a uma variável do tipo Boolean.
// Por último, você deve utilizar a variável do tipo Boolean com a estrutura de decisão if para imprimir, no console, uma mensagem que vai dizer se o aluno passou ou não passou.

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sua nota: "); // Exibir mensagem no console.
		Double notaDoAluno = scanner.nextDouble(); // A variável "notaDoAluno' recebe o valor digitado pelo usuário.
		
		Boolean passouDeAno = false; // A variável 'passouDeAno' para verificar a aprovação ou não do aluno. 
		passouDeAno = notaDoAluno >= 7; // Realiza a validação se a nota do aluno é maior que 7.
		
		if (passouDeAno) { // Se nota for maior de 7...
			System.out.println("Parabéns! Você foi aprovado(a)."); // Exibir mensagem no console, caso a nota do aluno for maior ou igual a 7.
		} else { // Se não...
			System.out.println("Infelizmente, ficou de recuperação."); // Exibir mensagem no console, caso a nota do aluno for menor de 7.
		}
		
		scanner.close();
	}
}
