package capitulo05;
// Pense em uma empresa fict�cia que todo o m�s de Janeiro premia seus funcion�rios com um b�nus, caso a meta seja alcan�ada.
// Crie um programa que receba 3 par�metros. O primeiro ser� a meta de faturamento anual da empresa para o ano que passou. Depois, receba o par�metro referente ao faturamento real da empresa no ultimo ano. Por �ltimo, receba a m�dia salarial do funcion�rio(a) para o ano anterior (n�o precisa fazer c�lculo de m�dia salarial, j� que estamos trabalhando com um algoritmo fict�cio - na hora de informar esse par�metro, invente um valor qualquer para representar essa m�dia salarial).
// Nessa empresa fict�cia, se o faturamento real for igual ou maior que a meta de faturamento anual, ent�o os funcion�rios ganharam um b�nus que ser� igual a m�dia salarial deles no �ltimo ano. Caso o faturamento seja menor que a meta, mas, seja maior ou igual a 80% do valor da meta, ent�o eles receber�o tamb�m 80% de sua m�dia salarial.
// No final, mostre de quanto ser� o pr�mio desse funcion�rio(a).

public class Exercicio02 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a meta de faturamento para esse ano: ");
		Double meta = scanner.nextDouble();
		
		System.out.print("Digite o faturamento: ");
		Double faturamento = scanner.nextDouble();
		
		System.out.print("Digite a m�dia salarial dos �ltimos 12 meses: ");
		Double mediaSalarial = scanner.nextDouble();
		
		Double oitentaPorCentoDaMeta = (meta * 80) / 100;
		
		Boolean bateuAMeta = faturamento >= meta;
		
		Boolean faturouPeloMenosOitentaPorCento = faturamento >= oitentaPorCentoDaMeta;
		
		if (bateuAMeta) {
			System.out.println("Voc� vai ganhar um b�nus de 100%! Ele ser� de: " + mediaSalarial);
		} else if (faturouPeloMenosOitentaPorCento) {
			Double oitentaPorCentoDaMediaSalarial = (mediaSalarial * 80) / 100; // Esse c�lculo s� precisa ser feito se a meta N�O tiver sido batida e, por isso, ele ficou aqui.
			
			System.out.println("Voc� vai ganhar um b�nus de 80%! Ele ser� de: " + oitentaPorCentoDaMediaSalarial);
		} else {
			System.out.println("Infelizmente, esse ano n�o tem b�nus!");
		}		
		
		scanner.close();

	}
}
