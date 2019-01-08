package programme;

public class IterativeMethode {
	public static void main(String[] args) {
		System.out.println("Iterative Methode");
		essePizza(1, 6);
		System.out.println("Iterative Methode mit max erreich");
		essePizza(12, 6);
		
		
		System.out.println("\nRekursive Methode, Methode ruft sisch selbst.");
		esseAllePizza(1, 4);
		System.out.println("\nRekursive Methode, Methode ruft sisch selbst.");
		esseAllePizza(5, 4);
	}

	public static void essePizza(int stückZahl, int maxStück) {
		while (stückZahl <= maxStück) {
			System.out.println("ich erste der " + stückZahl + ".te Stück");
			stückZahl = stückZahl + 1;
			if (stückZahl == maxStück) {
				System.out.println("\nich esse mein lezter stück");
			} 
		}
	}

	public static void esseAllePizza(int stuckzahl, int maxStück) {
		if (stuckzahl > maxStück) {
			System.out.println("Ich bin schon satt");
			return;
		}
		System.out.println("ich erste der " + stuckzahl + ".te Stück");
		esseAllePizza(stuckzahl + 1, maxStück);
		
	}

}
