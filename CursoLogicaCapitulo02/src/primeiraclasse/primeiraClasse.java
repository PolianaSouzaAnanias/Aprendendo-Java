package primeiraclasse;

public class primeiraClasse {

	public static void main(String[] args) {
		
			Produto produto = new Produto();
			produto.nome = "Smartphone";
			produto.precoUnitario = 500.0;
			produto.quantidade = 15;
			
			exibirQuantidadeEmEstoque(produto);		
		}
		
		static void exibirQuantidadeEmEstoque(Produto produto) {
			System.out.println("Quantidade em estoque do produto " + produto.nome + " � de " + produto.quantidade + " unidade(s).");
		}
	}
