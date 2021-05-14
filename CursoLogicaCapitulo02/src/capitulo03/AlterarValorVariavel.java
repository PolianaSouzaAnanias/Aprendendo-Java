package capitulo03;
import java.util.Scanner;

public class AlterarValorVariavel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: "); //Mostrar mensagem ao usu�rio.
		Double valorProduto = scanner.nextDouble(); //A vari�vel 'valorProduto', do tipo double(decimal), recebe valor digitado pelo usu�rio.
		
		System.out.print("Digite o tipo do pagamento [1 = � vista / 2 = a prazo]: ");//Mostrar mensagem ao usi�rio.
		Integer tipoPagamento = scanner.nextInt(); //A vari�vel 'tipoPagamento', do tipo intiro, recebe o tipo de pagamento - � vista ou a prazo.
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);//A vari�vel 'pagamentoAVista', do tipo l�gico. O pagamento ser� a vista?(1).
		
		Double juros = 0.0; //A vari�vel 'juros', do tipo double (decimal). 
		
		if (pagamentoAVista) { //Se 'pagamentoAVista' for verdade, est�o � acrescentado n�o haver� juros.
			
		} else {//Caso o pagamento n�o seja a vista, ser� acrecentado um j�ros de 10%.
			juros = 10.0; 
		}
		Double acrescimo = valorProduto * juros / 100; //A vari�vel 'acrescimo', do tipo double(decimal), calcula  valorProduto * juros /100.
		
		Double valorTotal = acrescimo + valorProduto; //A vari�vel 'valorTotal, do tipo doble(decimal), calcula o acrescimo e mais o valorProduto.
		
		System.out.println("Valor total: " + valorTotal); //Apresenta o 'valorTotal' (Resultado) para o usu�rio.
		
		scanner.close();
	}
}
