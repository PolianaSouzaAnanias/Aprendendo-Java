package exercicio02;

// Fa�a exatamente como no exerc�cio passado, s� que agora torne o m�todo, que verifica a necessidade de repor estoque, como um m�todo de inst�ncia.
// Lembre-se de que ele n�o precisar� mais receber par�metros, pois, usar� as pr�prias vari�veis de inst�ncia da classe Produto.

public class Exercicio02 {
	public static void main(String[] args) {
		produto produto = new Produto();
		produto.nome = "Notebook XZ10";
		produto.quantidadeEstoque = 8;
		
		System.out.println("Necess�rio repor estoque do produto " + produto.nome + "? " + produto.eNecessarioReporEstoque());
	}
}
