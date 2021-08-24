package exercicio02;

// Faça exatamente como no exercício passado, só que agora torne o método, que verifica a necessidade de repor estoque, como um método de instância.
// Lembre-se de que ele não precisará mais receber parâmetros, pois, usará as próprias variáveis de instância da classe Produto.

public class Exercicio02 {
	public static void main(String[] args) {
		produto produto = new Produto();
		produto.nome = "Notebook XZ10";
		produto.quantidadeEstoque = 8;
		
		System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + produto.eNecessarioReporEstoque());
	}
}
