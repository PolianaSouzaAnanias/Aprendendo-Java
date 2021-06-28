package capitulo02;
// Altere a mensagem, que é exibida na aba Console do Eclipse, de Olá! para qualquer outra mensagem de sua escolha e execute o programa.

public class Ecxercicio1 {
	public static void main(String[] args) {
		scanner scanner = new Scanner(System.in);
				
string nome;

		System.out.println("Qual o seu nome? Digite no espaço abaixo."); //Exibir mensagem na tela.
		nome = scanner.toString(); // A variável 'nome' armazena os dados fornecisos.
		
		System.out.println("Bem-vindo(a)! " + nome +", Bons estudos!"); // // Exibir mensagem na tela. Foi utilizada a concatenção, entre mensagem e variável 'nome'
}
}