package capitulo09;

public class Cliente {

	public static void main(String[] args) {
		String primeiroNome;
		
		String ultimoNome;
		
		String telefone;
		
		String email;
		
		String obterNomeCompleto() {
			String nomeCompleto = primeiroNome + " " + ultimoNome;
			
			return nomeCompleto;
		}
		
		String obterDDD() {
			
			String ddd = telefone.substring(0, 2);
			return ddd;
		
	}

}
