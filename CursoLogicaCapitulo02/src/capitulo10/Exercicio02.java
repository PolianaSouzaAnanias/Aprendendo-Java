package capitulo10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Crie um programa que imprima, no console, a lista de tarefas que voc� criou com o algoritmo da aula passada.

public class Exercicio02 {
	public static void main(String[] args) throws IOException {
		List<String> linhas = lerDoArquivo("/tmp/lista-de-tarefas.txt");;
		
		System.out.println("SUA LISTA DE TAREFAS DO DIA");
		
		for (int i = 0; i < linhas.size(); i++) {
			String tarefa = linhas.get(i);
			
			System.out.println(i + ": " + tarefa);
		}
		
		System.out.println("----------");
	}
	
	static List<String> lerDoArquivo(String arquivo) throws IOException {
		Path path = Paths.get(arquivo);
		return Files.readAllLines(path);
	}
}