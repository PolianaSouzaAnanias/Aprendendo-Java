package capitulo02;
// Altere a mensagem, que � exibida na aba Console do Eclipse, de Ol�! para qualquer outra mensagem de sua escolha e execute o programa.

public class Ecxercicio1 {
	public static void main(String[] args) {
		scanner scanner = new Scanner(System.in);
				
string nome;

		System.out.println("Qual o seu nome? Digite no espa�o abaixo."); //Exibir mensagem na tela.
		nome = scanner.toString(); // A vari�vel 'nome' armazena os dados fornecisos.
		
		System.out.println("Bem-vindo(a)! " + nome +", Bons estudos!"); // // Exibir mensagem na tela. Foi utilizada a concaten��o, entre mensagem e vari�vel 'nome'
}
}