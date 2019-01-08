package vererbung;

import klassen.Fahrzeug;

public class Mottorad extends Fahrzeug {
	private double preis;

	public Mottorad() {
		super();
	}

	public Mottorad(String hersteller, int leistung, double preise, int anzahlReife) {
		super(hersteller, leistung, preise, 2);
		System.out.println(toString());
	}

	public Mottorad(String hersteller, int leistung) {
		super(hersteller, leistung);
		// TODO Auto-generated constructor stub
	}

	{
		this.tuned(60);
	}

	@Override
	public String toString() {
		return "Der Fahrzeug ist ein " + this.getClass().getName().substring(10) + " Der Hersteller ist: " + hersteller
				+ " hat eine Leistung von: " + leistung + " PS und kostet: " + preise
				+ " Euro. Der Anzahl von Reife ist immer " + anzahlReife + ". Und hat keine Tür.";

	}

	@Override
	public void crashTest() {
		System.out.println("Methode CrashTest() von Fahrzeug Type Mottorad. Die passagieren fallen runter");

	}

	@Override
	public double getPreis() {
		return preis;
	}
	@Override
	public String hallo() {
		// TODO Auto-generated method stub
		return "Brum Brum Brum :) als Begrüssung. In der Interface definierte Konstante Zahl ist " + zahl;
	}

	@Override
	public boolean canBremsen() {
		// TODO Auto-generated method stub
		return false;
	}

}
