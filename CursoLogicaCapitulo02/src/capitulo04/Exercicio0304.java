package capitulo04;

public class Exercicio0304 {
	public static void main(String[] args){
		
	System.out.println("CALCULO DE GASTO FAMILIAR");
	System.out.println(".........................");
	
float contaLuz = 300.00f;
float contaAgua = 20.00f;
float contaTelefone = 50.00f;
float escolaFilho = 500.00f;
float faturaCartao = 2000.00f;
float gastosSupermercado = 800.00f;
float somaGastos;

	System.out.println("Lista de gastos");
	System.out.println("");
	System.out.println("Conta de Luz: " + contaLuz);
	System.out.println("Conta de Água: " + contaAgua);
	System.out.println("Conta de Telefone: " + contaTelefone);
	System.out.println("Mensalidade Escola do Filho: " + escolaFilho);
	System.out.println("Fatura do Cartão: " + faturaCartao);
	System.out.println("Gastos Supermecado: " + gastosSupermercado);
	System.out.println(".........................");
	
somaGastos = (contaLuz + contaAgua + contaTelefone + escolaFilho + faturaCartao + gastosSupermercado);
	System.out.println ("Total gasto: " + somaGastos);
	}	
}
