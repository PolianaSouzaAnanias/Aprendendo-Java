package capitulo03;
import java.util.Scanner;

public class TipoTexto { //Nome da classe.
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);//Ler a mensagem do usuário (teclado).
			
			String nome = scanner.nextLine(); //Declaração de variável 'nome', do tipo texto.
			
			System.out.println("Olá " + nome + "!");//Mostra a mensagem no console.
			
			scanner.close(); //Fecha a funcionalidade scanner.
			
}
}