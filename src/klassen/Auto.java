package klassen;

import java.awt.Color;
import java.util.Locale;


/**
 * Dokumentation Kommentar --> Programm beschreib
 * @author lenovo
 * {@link #getResult(String)}
 *
 */
public class Auto implements Comparable<Auto> {
	// Instanz-Variablen (Attribute, Member)
	// <Datentypen> <Variable Name> [<Zuweisung>];
	private int leistung;// Auto PS
	private String hersteller;
	public final String farbe = "Rot"; // final Variable keine Konztanzen --> Zeile Kommentar
										// Variablen
	public static int erstellterAuto = 0; // Klassen Variablen 
	public final static int TUNEDWERT = 25; // Konstanten Variablen
	private Color color = null;
	Locale locale = null;
	private static final int EXIT_FAILURE = -1;
	// Instanz-Methoden
	// <Rückgabenwert> <Methode Name> [<Parameterliste>] {rumpf (logik)}
	// void Methode ohne Rückagenwert
	public void tuned(int tuneWerd) {
		boolean isPositiv = tuneWerd > 0 ;
		if (isPositiv) {
			this.leistung = this.leistung + tuneWerd;
		} else {
			System.out.println(tuneWerd + " ist eine ungültige Zahl");
			System.exit(EXIT_FAILURE);
		}
	
		
		// Man kann auch so schreiben:
		// liestung += tunedWert /
		// liestung -= tunedWert

		//leistung = 1000;
		//int leistung = 20000; // lokale variable
		//this.hersteller = "Toyota";
		//System.out.println("Leistung von lokale Variable: " + leistung);
		//System.out.println("Leistung von Klasse bzw. globale Variable: "+ this.leistung);
	}

	/* Block Kommentar
	 * public void tuned(){ int tunedWert = 25; leistung = leistung + tunedWert;
	 * 
	 * }
	 */

	public void tuned() {
		tuned(TUNEDWERT);
	}

	// Konstruktoren
	// <Klasse Name> [<Parameterliste>] {rumpf (logik)}
	// default Konstruktor
	public Auto() {
		super();
	}

	public Auto(int leistung, String hersteller) {
		super();
		setLeistung(leistung);
		this.hersteller = hersteller;
		// Auto.erstellterAuto = erstellterAuto +1; und initialisierung von
		// erstellauto auf 0
		// this.leistung = 20500;

		erstellterAuto = erstellterAuto + 1;
		System.out.println("Anzahlt erstelltes Auto: " + erstellterAuto);
//		{
//			int lokal = 125; // locale Variable muss immer initialisert werdern.
//			System.out.println(lokal); // SO Okay
//		}
		// System.out.println(lokal); Variable hier nicht mehr sichtbar

	}

	// overloading von Methoden. Methoden call the first Methoden

	public Auto(String hersteller) {
		this(100, hersteller);
	}

	public int getLeistung() {
		return leistung;
	}

	public void setLeistung(int leistung) {

		boolean positiv = leistung > 0;

		if (positiv) {
			this.leistung = leistung;
		} else {
			System.err
					.println("Leistung ist nicht gültig. Das programm wird beendet");
			System.exit(0);
		}
		
		
	}
	
	public String getResult(String hersteller){
		return hersteller.equals("BMW") ? "Hersteller is BMW " : "Hersteller ungültig er ist nicht bmw";
	}
	
	public Boolean isLeistungPositiv(){
		return leistung > 0 ? true : false;
		
	}

	public String getHersteller() {
		return hersteller;
	}

	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	// Ohne Initialisierung von erstellauto
	public String toString() {
		return "Auto hat folgende Leistung " + leistung
				+ " PS, und ist von der Hersteller " + hersteller
				+ "Anzal erstellte Auto " + erstellterAuto;
	}

	// eine Klasse Methode in der Klasse Auto:

	public static void gibtAutoAus(Auto auto) {
		System.out.println("Das Auto von Hersteller " + auto.hersteller
				+ " hat eine Leistung von " + auto.leistung + " PS");
		System.out.println("");
	}

	static {
		System.out
				.println("Hallo Die klasse wird hier Initialisiert und wird nur einmal durchgeführt.");

	}

	public Auto(int leistung, String hersteller, Color color) {
		super();
		this.leistung = leistung;
		this.hersteller = hersteller;
		this.color = color;
	}

	public String getFarbe() {
		return farbe;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public Auto(int leistung, String hersteller, Color color, Locale locale) {
		super();
		this.leistung = leistung;
		this.hersteller = hersteller;
		this.color = color;
		this.locale = locale;
	}

	// nur für liste zuläaasig
	@Override
	public int compareTo(Auto auto) {
		return this.getLeistung() - auto.getLeistung();
	}

}
