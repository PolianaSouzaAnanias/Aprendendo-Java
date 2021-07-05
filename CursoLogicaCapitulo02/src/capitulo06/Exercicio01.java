package capitulo06;
// Dada a lista de n�meros abaixo:
// Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
//  ... Itere por essa lista e imprima todos os n�meros que s�o divis�veis por 3.
// Para descobrir se um n�mero � divis�vel por 3, voc� pode utilizar o operador m�dulo. Toda vez que o m�dulo de um n�mero por 3 for igual a zero, ent�o esse n�mero e divis�vel por 3.

public class Exercicio01 {

		static final Integer DIVISOR = 3;
		
		public static void main(String[] args) {
			Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
			
			for(int i = 0; i < numeros.length; i++) {
				Integer numero = numeros[i];
				Integer moduloPorTres = numero % DIVISOR;
				
				if (moduloPorTres.equals(0)) {
					System.out.println("N�mero " + numero + " � divis�vel por 3.");
				}
			}
			
			System.out.println("Fim.");
		}
}
