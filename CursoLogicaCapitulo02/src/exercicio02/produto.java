package exercicio02;

public class produto {
	
static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;// Essa n�o � uma vari�vel e sim, uma constante.
	
	String nome;
	
	Integer quantidadeEstoque;
	
	Boolean eNecessarioReporEstoque() {
		if (quantidadeEstoque < produto.QUANTIDADE_MINIMA_ESTOQUE) {
			return true;
		}
		
		return false;
	}
}
