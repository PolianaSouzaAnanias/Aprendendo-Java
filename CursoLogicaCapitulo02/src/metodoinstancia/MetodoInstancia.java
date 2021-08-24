package metodoinstancia;

public class MetodoInstancia {

	public  static  void  main ( String [] args ) {
		Cliente cliente =  new  Cliente ();
		
		cliente . primeiroNome =  "Poliana" ;
		cliente . ultimoNome =  "Ananias" ;
		cliente . telefone =  "819000000" ;
		cliente . email =  " poliana.souzaa@hotmail.com " ;
		
		Cliente cliente2 =  new  Cliente ();
		cliente2 . primeiroNome =  "Thiago" ;
		cliente2 . ultimoNome =  "Silva" ;
		cliente2 . telefone =  "819999999" ;
		
		
// 		 System.out.println ("Nome cliente:" + Cliente.obterNomeCompleto (cliente)); // Esse é o método estático.
		System.out.println("CLIENTES");
		System.out.println( " Nome cliente: "  + cliente . obterNomeCompleto () +  " , DDD: "  + cliente . obterDDD ());
		System.out.println( " Nome cliente: "  + cliente2 . obterNomeCompleto () +  " , DDD: "  + cliente2 . obterDDD ());
	}
	
// 	String estática obterNomeCompletoCliente (Cliente cliente) {
// 		String nomeCompleto = cliente.primeiroNome + "" + cliente.ultimoNome;
//		
// 		return nomeCompleto;
// 	}

}
