package capitulo07;

public class declarandoVetores1Dimensao {

	public static void main(String[] args) {
		System.out.println("CARD�PIO DE PIZZA");
		System.out.println("-------------------");
		String[] cardapio = new String[4];
		cardapio[0] = "Calabresa";
		cardapio[1] = "Atum";
		cardapio[2] = "Queijo";
		cardapio[3] = "Presunto";
		
		for(int i = 0; i < cardapio.length; i++) {
			System.out.println(cardapio[i]);
		}
	}
//		String [] cardapio = new String [] {"Calabresa", "Atum", "Queijo", "Presunto"};
//	
//		System.out.println ("Escolha o sabor:");
//	
//		for (int i = 0; i <cardapio.length; i ++) {
//			System.out.println ("[" + i + "]" + cardapio [i]);
//		}
//	
//		Scanner scanner = new Scanner (System.in);
//	
//		System.out.print ("Digite o n�mero referente ao sabor:");
//		Inteiro saborEscolhido = scanner.nextInt ();
//	
//		System.out.println ("Voc� escolheu o sabor:" + cardapio [saborEscolhido]);
//	
//		scanner.close ();
	

	
//		String [] cardapio = new String [] {"Calabresa", "Atum", "Queijo", "Presunto"};		
//		cardapio [3] = "Frango";
//		for (int i = 0; i <cardapio.length; i ++) {
//			System.out.println (cardapio [i]);
//		}
}