package klassen;

public abstract class Voiture extends Fahrzeug {

	private int anzahlTuer;

	public Voiture(String hersteller, int leistung, double preise) {
		super(hersteller, leistung, preise);
		// TODO Auto-generated constructor stub
	}

	public Voiture(String hersteller, int leistung) {
		super(hersteller, leistung);
		// TODO Auto-generated constructor stub
	}

	public Voiture() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public boolean canBremsen() {
		// TODO Auto-generated method stub
		return true;
	}

	public int getAnzahlTuer() {
		return anzahlTuer;
	}

	public void setAnzahlTuer(int anzahlTuer) {
		this.anzahlTuer = anzahlTuer;
	}

	public Voiture(String hersteller, int leistung, double preise, int anzahlReife, int anzahlTuer) {
		super(hersteller, leistung, preise, anzahlReife);
		this.anzahlTuer = anzahlTuer;
	}

	// Überschreiben (Overriding) von Java Object Klasse toString() Methode
	@Override
	public String toString() {
		return "Der Fahrzeug ist ein: " + getClass().getName().substring(10) + " Der Hersteller ist: "
				+ super.hersteller + " hat eine Leistung von: " + leistung + " PS und kostet: " + preise
				+ " Euro. Der Anzahl von Reife ist immer " + super.anzahlReife + " und der Anzal der Türen ist: "
				+ anzahlTuer;

	}

	@Override
	public void crashTest() {
		System.out.println(
				"Metode CrashTest() von Fahrzeug Type Voiture. Die passagieren sind im Auto geklempt und können nicht mehr raus kommen.");

	}

	@Override
	public String hallo() {
		// TODO Auto-generated method stub
		return "Bonjour";
	}

	

	
	
}
