package capitulo09;

public class MetodoInstancia {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Alexandre";
		cliente.ultimoNome = "Afonso";
		cliente.telefone = "349000000";
		cliente.email = "alexandre.afonso@algawork.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "Jo�o";
		cliente2.ultimoNome = "Silva";
		cliente2.telefone = "3489999999";
		
		
//		 System.out.println("Nome cliente: " + Cliente.obterNomeCompleto(cliente)); // Esse � o m�todo est�tico.
		
		System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
		System.out.println("Nome cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());
	}
	
//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//		
//		return nomeCompleto;
//	}
}
