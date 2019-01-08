package programme;

import klassen.Hund;
import vererbung.Dackel;

public class HundeProgramm {
	public static void main(String[] args) {
		Hund hund = new Hund();
		hund.setName("dackel");
		Hund dackel = new Dackel(1200);
		
		
		System.out.println(hund);
		System.out.println(hund.getName());
		hund.essen();
		dackel.essen();
			
	}

}
