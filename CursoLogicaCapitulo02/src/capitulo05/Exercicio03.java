package capitulo05;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o n�mero referente ao dia da semana: ");
		Integer diaDaSemana = scanner.nextInt();
		
		String dia;
		
		switch (diaDaSemana) {
		case 1: dia = "domingo";
			break;
		case 2: dia = "segunda-feira";
			break;
		case 3: dia = "ter�a-feira";
			break;
		case 4: dia = "quarta-feira";
			break;
		case 5: dia = "quinta-feira";
			break;
		case 6: dia = "sexta-feira";
			break;
		case 7: dia = "s�bado";
			break;
		default: dia = "INV�LIDO";
		}
		
		System.out.println("O dia escolhido foi: " + dia);
		
		scanner.close();
	}
}
}
