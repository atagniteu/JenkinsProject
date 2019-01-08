package programme;

public class RekursiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String zahl = args[0];
		int intZahl = Integer.parseInt(zahl);
		int ergebnis = berechnen(intZahl);
		System.out.println("Summe: " + ergebnis);
		System.out.println("Square " + Math.sqrt(2));

	}

	private static int berechnen(int intZahl) {
		if (intZahl == 1) {
			return 1;
		}
		return intZahl + berechnen(intZahl - 1);
	}

}
