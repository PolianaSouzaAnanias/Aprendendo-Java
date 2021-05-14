package capitulo03;
import java.util.Scanner;

public class AlterarValorVariavel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: "); //Mostrar mensagem ao usuário.
		Double valorProduto = scanner.nextDouble(); //A variável 'valorProduto', do tipo double(decimal), recebe valor digitado pelo usuário.
		
		System.out.print("Digite o tipo do pagamento [1 = à vista / 2 = a prazo]: ");//Mostrar mensagem ao usiário.
		Integer tipoPagamento = scanner.nextInt(); //A variável 'tipoPagamento', do tipo intiro, recebe o tipo de pagamento - À vista ou a prazo.
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);//A variável 'pagamentoAVista', do tipo lógico. O pagamento será a vista?(1).
		
		Double juros = 0.0; //A variável 'juros', do tipo double (decimal). 
		
		if (pagamentoAVista) { //Se 'pagamentoAVista' for verdade, estão é acrescentado não haverá juros.
			
		} else {//Caso o pagamento não seja a vista, será acrecentado um júros de 10%.
			juros = 10.0; 
		}
		Double acrescimo = valorProduto * juros / 100; //A variável 'acrescimo', do tipo double(decimal), calcula  valorProduto * juros /100.
		
		Double valorTotal = acrescimo + valorProduto; //A variável 'valorTotal, do tipo doble(decimal), calcula o acrescimo e mais o valorProduto.
		
		System.out.println("Valor total: " + valorTotal); //Apresenta o 'valorTotal' (Resultado) para o usuário.
		
		scanner.close();
	}
}
