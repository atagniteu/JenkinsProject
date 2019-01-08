package klassen;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Auto1 {
	// Global Variable wenn jede Erzeugte Object der Klasse denselben Wert hat
	static int reifeAnzahl = 4;// global variable. Wenn man 100 AUto erzeugt jede Auto hat immer nur 4 Reifen.
	private double preis;
	private String marke;

	private Reifen reifen;
	
	public void autoGasGeben() {
		System.out.println("Das Auto mit der marke " + this.marke + " fährt gleich los!");
	}

	public double roundedPreis(double preis) {
		BigDecimal rounded = new BigDecimal(preis);
		BigDecimal value = rounded.setScale(2, BigDecimal.ROUND_CEILING);
		double doubleValue = value.doubleValue();
		return doubleValue;
	}
	
	public void vergleichPreis (Auto1 auto1, Auto1 auto2) {
		if(auto1.getPreis() < auto2.getPreis()) {
			System.out.println(roundedPreis(auto1.getPreis()));
			System.out.println(roundedPreis(auto2.getPreis()));	
		} else {
			System.out.println(roundedPreis(auto2.getPreis()));
			System.out.println(roundedPreis(auto1.getPreis()));
			
		}
	} 
	
	public static int getReife() {
		return reifeAnzahl;
	}
	
	public Auto1(String reifenMarken, String reifenTyp, double preis, String marke) {
		reifen = new Reifen(reifenMarken, reifenTyp);
		this.preis = preis;
		this.marke = marke;
	}

	@Override
	public String toString() {
		return "Auto1 [preis=" + preis + ", marke=" + marke + ", reifen=" + reifen + "]";
	}
	

}
