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

	public static void essePizza(int st�ckZahl, int maxSt�ck) {
		while (st�ckZahl <= maxSt�ck) {
			System.out.println("ich erste der " + st�ckZahl + ".te St�ck");
			st�ckZahl = st�ckZahl + 1;
			if (st�ckZahl == maxSt�ck) {
				System.out.println("\nich esse mein lezter st�ck");
			} 
		}
	}

	public static void esseAllePizza(int stuckzahl, int maxSt�ck) {
		if (stuckzahl > maxSt�ck) {
			System.out.println("Ich bin schon satt");
			return;
		}
		System.out.println("ich erste der " + stuckzahl + ".te St�ck");
		esseAllePizza(stuckzahl + 1, maxSt�ck);
		
	}

}
