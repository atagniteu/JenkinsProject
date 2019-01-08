package klassen;

import exceptions.UncheckedException;
import interfaces.Verkaeuflich;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// durch getter und setter haben wir schon getPreis()

public abstract class Fahrzeug implements Verkaeuflich{
	protected String hersteller;
	protected int leistung;
	protected double preise;
	protected int anzahlReife;
	
	public static final int DEFAULT_TUNED = 25;


	public Fahrzeug(String hersteller, int leistung, double preise) {
		super();
		this.hersteller = hersteller;
		this.leistung = leistung;
		this.preise = preise;
		this.toString();
				
	}

	
	public double getPreis() {
		return preise;
	}

	public Fahrzeug(String hersteller, int leistung) {
		super();
		this.hersteller = hersteller;
		this.leistung = leistung;
	}		
	  
	protected void tuned(int i) {
		if (i <= 0) {
			throw new UncheckedException("Zahl muss positiv sein", new IllegalArgumentException(""), true, true);
		}
		this.leistung = leistung + i;
		
	}
	
	public void getTuned() {
		tuned(DEFAULT_TUNED);
	}

	public Fahrzeug() {
		super();
	}


	public Fahrzeug(String hersteller, int leistung, double preise, int anzahlReife) {
		super();
		this.hersteller = hersteller;
		this.leistung = leistung;
		this.preise = preise;
		this.anzahlReife = anzahlReife;
		
	}


	@Override
	public String toString() {
		return "Der Fahrzeug ist ein: " + getClass().getName() + " Der Hersteller ist: " + hersteller + " hat eine Leistung von: " + leistung + " PS und kostet: "
				+ preise + " Euro. Der Anzahl von Reife ist immer " + anzahlReife ;

	}

	public abstract void crashTest();
	
	public abstract boolean canBremsen();
	
	

}
