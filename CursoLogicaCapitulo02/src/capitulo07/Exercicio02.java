package capitulo07;

import java.util.Scanner;

public class Exercicio02 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CADASTRO DE TAREfAS");
		System.out.println("");
		System.out.println("Digite cinco tarefas do sue dia: ");
		
String[] tarefas = new String[]{"Tomar café", "Brincar com minha filha", "Almolar", "Estudar", "Dormir"};

for(int i = 0; i < tarefas.length; i++) {
	System.out.print("Tarefa " + i + ": ");
	tarefas[i] = scanner.nextLine();
}


System.out.println("Suas tarefas são: ");
for(int i = 0; i < tarefas.length; i++) {
	System.out.println(i + ": " + tarefas[i]);
}

scanner.close();
		
	}
}