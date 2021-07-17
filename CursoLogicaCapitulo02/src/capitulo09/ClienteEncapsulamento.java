package capitulo09;

public class ClienteEncapsulamento {

	public static void main(String[] args) {
		 encapsulamento de pacote ;

		 	
//		  	String nome;
		 	
		 	String primeiroNome;
		 	
		 	String ultimoNome;
		 	
		 	Telefone de corda ;
		 	
		 	String  getNome () {
		 		return primeiroNome +  "  "  + ultimoNome;
		 	}
		 	
		 	void  setNome ( String  nome ) {
		 		String [] nomeCompleto = nome . dividir ( "  " );
		 		primeiroNome = nomeCompleto [ 0 ];
		 		ultimoNome = nomeCompleto [ 1 ];
		 	}

		 	String  getPrimeiroNome () {
		 		return primeiroNome;
		 	}

		 	void  setPrimeiroNome ( String  primeiroNome ) {
		 		isso . primeiroNome = primeiroNome;
		 	}

		 	String  getUltimoNome () {
		 		return ultimoNome;
		 	}

		 	void  setUltimoNome ( String  ultimoNome ) {
		 		isso . ultimoNome = ultimoNome;
		 	}

		 	String  getTelefone () {
		 		retorno telefone;
		 	}

		 	void  setTelefone ( String  telefone ) {
		 		isso . telefone = telefone;
		 	}
		 }

	}

}
