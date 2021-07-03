package capitulo06;

public class iterandoWhile {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			if (i == 5) {
				System.out.println("Vai continuar...");
				i++;
				continue;
			}
			
			System.out.println(i + ": Um texto qualquer.");
			i++;
		}
	}
}
