package klassen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Computer {
	private String cpu;
	private Mainboard mainboard; // Association. Computer Klasse kenn die Klasse Mainboard
	private double preis;
	
	
	
	
	public Computer(int ramSlot, int karteSlot, int usbSlot, String cpu, double preis) {
		this.mainboard = new Mainboard(ramSlot, karteSlot, usbSlot);
		this.cpu = cpu;
		this.preis = preis;
	}
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", mainboard=" + mainboard + ", preis=" + preis + "]";
	}
	

}
