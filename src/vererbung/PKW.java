package vererbung;

import klassen.Voiture;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter	
public class PKW extends Voiture {

	private int anzahlT�r;

	public PKW(String hersteller, int leistung, double preise) {
		super(hersteller, leistung, preise);
		
	}

	public PKW(String hersteller, int leistung, double preise, 
			int anzahT�r) {
	super(hersteller, leistung, preise);
		this.anzahlT�r = anzahT�r;
		
	}
	
	{
		this.getTuned();
	}	

	
	public PKW() {
		super();
		//System.out.println(toString() );
	}

	public PKW(String hersteller, int leistung, double preise, int anzahlReife, int anzahlTuer) {
		super(hersteller, leistung, preise, 6, anzahlTuer);
		System.out.println(toString());
	}

	public PKW(String hersteller, int leistung) {
		super(hersteller, leistung);
		// TODO Auto-generated constructor stub
	}
}
