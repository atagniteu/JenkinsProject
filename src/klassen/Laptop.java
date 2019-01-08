package klassen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Laptop {

	private int ram;
	private String marke;
	private double preis;
	static final String FARBE = "Blau"; // diese static variable überlebt auch wenn keinen Object ertzeugt ist
	private String cpu;

	// diese Variable überlebt auch wenn die Klasse keinen Object erzeugt hat
	public static void klassemethode() {
		System.out.println("ich rufe mich von der Obeject auf!...");
	}

	@Override
	public String toString() {
		return "Laptop mit dem ram: " + ram + ", von der marke: " + marke + ", mit dem preis: " + preis;
	}

	public String getFarbe() {
		return Laptop.FARBE;
	}

	public void starten() {

	}

}
