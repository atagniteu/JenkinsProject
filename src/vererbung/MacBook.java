package vererbung;

import klassen.Laptop;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MacBook extends Laptop{
	
	private boolean tochbar;

	public MacBook(int ram, String marke, double preis, String cpu, boolean tochbar) {
		super(ram, marke, preis, cpu);
		this.tochbar = tochbar;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Ist der macBook toucbar " + tochbar + " Und die Farbe ist: " + getFarbe();
	}

	@Override
	public void starten() {
		System.out.println(" Und das Macbook habe ich gestarten :)");
	}
	
	
	
	
	
	

}
