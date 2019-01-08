package klassen;

public class FahrzeugBestand {

	private static Fahrzeug[] fahrzeuge = new Fahrzeug[10];

	public static int anzahlFahrzeug = 0;

	public  static void hinzufgen(Fahrzeug f) {
		if (anzahlFahrzeug < fahrzeuge.length) {
			fahrzeuge[anzahlFahrzeug++] = f;
		}
	}
	
	public static int getCounter() {
		return anzahlFahrzeug;
	}
	
	public static double getberechnetePreise() {
		double total = 0;
		for (Fahrzeug f : fahrzeuge) {
			if (f == null) {
				break;
			}
			total = total + f.getPreise();
		}
		return total ;
	}

}
