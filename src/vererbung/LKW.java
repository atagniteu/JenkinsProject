package vererbung;

import klassen.Voiture;

public class LKW extends Voiture{

	
	@Override
	public boolean canBremsen() {
		// TODO Auto-generated method stub
		return true;
	}

	public LKW(String hersteller, int leistung, double preise) {
		super(hersteller, leistung, preise);	
		
	}
	
	public LKW() {
		super("Toyota", 180, 12.000);
	}

	public LKW(String hersteller, int leistung, double preis, int anzahlReife, int anzahltür) {
		super(hersteller, leistung, preis, 4, anzahltür);
		System.out.println(toString());

	}

	{
		this.tuned(250);
	}

	
	
}
