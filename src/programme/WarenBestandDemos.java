package programme;

import klassen.Fahrzeug;
import klassen.Warenbestand;
import vererbung.Dackel;
import vererbung.LKW;

public class WarenBestandDemos {
	public static void main(String[] args) {

		Fahrzeug lkw = new LKW("BMW", 12, 25000);
		Dackel dackel = new Dackel(1200);

		Warenbestand.warenHinzufuegen(lkw);
		Warenbestand.warenHinzufuegen(dackel);

		System.out.println("Gesamte Preis beim Verkaufte von " + Warenbestand.getAnzahlWaren() + " Waren ist "
				+ Warenbestand.berechnetPreis() + " €");
		

	}
}
