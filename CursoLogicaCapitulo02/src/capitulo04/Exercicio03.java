package capitulo04;

public class Exercicio03 {
// Fa�a um programa que receba: O valor da conta de luz, Conta de �gua, Conta de telefone, Escola do filho, Fatura do cart�o, Gastos com supermercado
// ... e mostre o gasto total que a fam�lia teve no m�s. N�o esque�a de usar muito o operador "+="
	
	public static void main(String[] args) {
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
		System.out.println("Conta de �gua: " + contaAgua);
		System.out.println("Conta de Telefone: " + contaTelefone);
		System.out.println("Mensalidade Escola do Filho: " + escolaFilho);
		System.out.println("Fatura do Cart�o: " + faturaCartao);
		System.out.println("Gastos Supermecado: " + gastosSupermercado);
		System.out.println(".........................");
		
	somaGastos = (contaLuz + contaAgua + contaTelefone + escolaFilho + faturaCartao + gastosSupermercado);
		System.out.println ("Total gasto: " + somaGastos);
		}	
}
