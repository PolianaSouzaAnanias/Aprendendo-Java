package exercicio02;

public class produto {
	
static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;// Essa não é uma variável e sim, uma constante.
	
	String nome;
	
	Integer quantidadeEstoque;
	
	Boolean eNecessarioReporEstoque() {
		if (quantidadeEstoque < produto.QUANTIDADE_MINIMA_ESTOQUE) {
			return true;
		}
		
		return false;
	}
}
