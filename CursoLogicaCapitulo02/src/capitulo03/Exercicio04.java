package capitulo03;

public class Exercicio04 {
// Crie um programa que vai receber do usu�rio o valor do produto e a quantidade do produto que se deseja. Com essas informa��es encontre o subtotal que ser� o valor do produto multiplicado pela quantidade.
// Depois voc� vai precisar usar uma estrutura de decis�o. Se a quantidade desejada do produto for maior que 10 unidades, vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10, voc� N�O aplica desconto algum.
// Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade) voc� multiplica o subtotal pelo pr�prio percentual e divide tudo por 100.
// Tendo o valor referente ao percentual de desconto, voc� vai retirar esse valor do subtotal. O que sobrar ser� o valor total final e dever� ser apresentado no console.

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); // Inst�ncia da classe scaner que � respos�vel por ler o teclado.
		
		System.out.print("Digite o valor do produto: "); // Exibir mensagem no console.
		Double valorProduto = scanner.nextDouble(); // A vari�vel 'valorProduto, do tipo diuble, armazena o valor do produto.
		
		System.out.print("Digite a quantidade: ");
		Integer quantidade = scanner.nextInt();
		
		Double valorSubtotal = valorProduto * quantidade;
		
		Boolean quantidadeMaiorOuIgualDez = quantidade >= 10;
		
		Double percentualDesconto = 0.0;
		
		if (quantidadeMaiorOuIgualDez) {
			percentualDesconto = 10.0;
		}
		
		Double desconto = valorSubtotal * percentualDesconto / 100;
		
		Double valorTotalComDesconto = valorSubtotal - desconto;
		
		System.out.println("Valor total: " + valorTotalComDesconto);
		
		scanner.close();
	}

}
