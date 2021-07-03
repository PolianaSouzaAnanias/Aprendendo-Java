package capitulo05;
// Crie um programa que vai receber um número que será referente ao dia da semana (de 1 até 7). Dependendo do número informado você deve imprimir o nome desse dia.

Se o número 1 for informado, então deverá ser impresso "domingo", se 2, então "segunda-feira" e por ai vai.
public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número referente ao dia da semana: ");
		Integer diaDaSemana = scanner.nextInt();
		
		String dia;
		
		switch (diaDaSemana) {
		case 1: dia = "domingo";
			break;
		case 2: dia = "segunda-feira";
			break;
		case 3: dia = "terça-feira";
			break;
		case 4: dia = "quarta-feira";
			break;
		case 5: dia = "quinta-feira";
			break;
		case 6: dia = "sexta-feira";
			break;
		case 7: dia = "sábado";
			break;
		default: dia = "INVÁLIDO";
		}
		
		System.out.println("O dia escolhido foi: " + dia);
		
		scanner.close();
	}
}

