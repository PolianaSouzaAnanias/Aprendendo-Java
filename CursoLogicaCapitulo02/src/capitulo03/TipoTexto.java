package capitulo03;
import java.util.Scanner;

public class TipoTexto { //Nome da classe.
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);//Ler a mensagem do usu�rio (teclado).
			
			String nome = scanner.nextLine(); //Declara��o de vari�vel 'nome', do tipo texto.
			
			System.out.println("Ol� " + nome + "!");//Mostra a mensagem no console.
			
			scanner.close(); //Fecha a funcionalidade scanner.
			
}
}