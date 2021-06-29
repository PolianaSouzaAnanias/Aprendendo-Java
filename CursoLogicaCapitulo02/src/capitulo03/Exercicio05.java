package capitulo03;
import java.util.Scanner;

public class Exercicio05 {
	
	static final Integer NOTA_DO_ALUNO_PARA_APROVACAO = 7; // Foi criada uma constante do tipo static.
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite a sua nota: "); // Exibir mensagem no console.
			Double notaDoAluno = scanner.nextDouble(); // A vari�vel "notaDoAluno' recebe o valor digitado pelo usu�rio.
			
			Boolean passouDeAno = false; // A vari�vel 'passouDeAno' para verificar a aprova��o ou n�o do aluno. 
			passouDeAno = notaDoAluno >= NOTA_DO_ALUNO_PARA_APROVACAO; // Realiza a valida��o se a nota do aluno � maior que 7.
			
			if (passouDeAno) { // Se nota for maior de 7...
				System.out.println("Parab�ns! Voc� passou de ano."); // Exibir mensagem no console, caso a nota do aluno for maior ou igual a 7.
			} else { // Se n�o...
				System.out.println("Infelizmente, ficou de recupera��o."); // Exibir mensagem no console, caso a nota do aluno for menor de 7.
			}
			
			scanner.close();
		}
}
