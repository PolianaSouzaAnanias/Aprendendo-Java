package capitulo03;
import java.util.Scanner;

public class Exercicio05 {
	
	static final Integer NOTA_DO_ALUNO_PARA_APROVACAO = 7; // Foi criada uma constante do tipo static.
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite a sua nota: "); // Exibir mensagem no console.
			Double notaDoAluno = scanner.nextDouble(); // A variável "notaDoAluno' recebe o valor digitado pelo usuário.
			
			Boolean passouDeAno = false; // A variável 'passouDeAno' para verificar a aprovação ou não do aluno. 
			passouDeAno = notaDoAluno >= NOTA_DO_ALUNO_PARA_APROVACAO; // Realiza a validação se a nota do aluno é maior que 7.
			
			if (passouDeAno) { // Se nota for maior de 7...
				System.out.println("Parabéns! Você passou de ano."); // Exibir mensagem no console, caso a nota do aluno for maior ou igual a 7.
			} else { // Se não...
				System.out.println("Infelizmente, ficou de recuperação."); // Exibir mensagem no console, caso a nota do aluno for menor de 7.
			}
			
			scanner.close();
		}
}
