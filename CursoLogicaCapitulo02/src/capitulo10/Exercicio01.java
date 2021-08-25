package capitulo10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

// Crie um programa que vai receber, atrav�s do console, uma lista de atividades que vai ajudar o usu�rio a planejar suas tarefas para o dia seguinte.
// Depois que o usu�rio informar, uma a uma, suas tarefas, as mesmas ser�o salvas em um arquivo de texto - cada tarefa vai ocupar uma linha desse arquivo.
// Para receber cada tarefa do usu�rio, use o la�o while. Enquanto o usu�rio n�o digitar um "x" no console, continue pedindo que ele informe as atividades.

public class Exercicio01 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefa;
		int i = 0;
		while (true) { // Deixei o true como condi��o do la�o, pois, o que vai par�-lo � o fato do usu�rio digitar o "x" no console.
			System.out.print("Tarefa " + i + ": ");
			tarefa = scanner.nextLine();
			
			if ("x".equals(tarefa)) {
				break; // Essa � a �nica maneira de parar esse la�o.
			}

			linhas.add(tarefa);
			i++;
		}

		escreverNoArquivo("/tmp/lista-de-tarefas.txt", linhas);

		scanner.close();
		
		System.out.println("Fim...");
	}
	
	static void escreverNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
		Path path = Paths.get(arquivo);
		Files.write(path, linhas);
	}
}