package capitulo09;

public class Encapsulamento {

	public static void main(String[] args) {
//			ClienteEncapsulamento ClienteEncapsulamento = new ClienteEncapsulamento();
//			
//			ClienteEncapsulamento.nome = "Alexandre Afonso";
//			ClienteEncapsulamento.telefone = "34922334455";
//			
//			System.out.println("Nome cliente: " + ClienteEncapsulamento.nome);
			
			
		ClienteEncapsulamento ClienteEncapsulamento = new ClienteEncapsulamento();
			
			ClienteEncapsulamento.setNome("Alexandre Afonso");
			ClienteEncapsulamento.setTelefone("34922334455");
			
			System.out.println("Nome cliente: " + ClienteEncapsulamento.getNome());
			System.out.println("Primeiro nome: " + ClienteEncapsulamento.getPrimeiroNome());
			System.out.println("Último nome: " + ClienteEncapsulamento.getUltimoNome());
			
			
	}
}
