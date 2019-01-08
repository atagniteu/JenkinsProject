package programme;

import klassen.Fahrzeug;
import klassen.FahrzeugBestand;
import vererbung.LKW;
import vererbung.Mottorad;
import vererbung.PKW;

public class LKWProgramme {

	public static void main(String[] args) {
		//FahrzeugBestand bestand = new FahrzeugBestand();
		
		LKW bmw = new LKW("BMW", 120, 20000, 0, 4);	
		PKW audi = new PKW("Audi", 220, 30000, 0, 8);
		Mottorad honda = new Mottorad("Honda", 68, 5000, 2);
		
		FahrzeugBestand.hinzufgen(bmw); // weil die Methode static ist
		FahrzeugBestand.hinzufgen(audi);
		FahrzeugBestand.hinzufgen(honda);
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Anzhal der gesamte Fahrezeuge: " +  FahrzeugBestand.getCounter());
		System.out.println("Preise der gesamte Fahrzeuge: " + FahrzeugBestand.getberechnetePreise());
		System.out.println("----------------------------------------------------------");
		bmw.crashTest();
		honda.crashTest();
		System.out.println("-----------------------INSTANCEOF----------------------------------");
		
		Fahrzeug f = new PKW();
		if (f instanceof LKW) {
			System.out.println(" f Fahrzeug ist ein LKW ");
		} else {
			System.out.println("f Fahrzeug ist ein PKW");
		}	
		
		System.out.println("---------------------------BEGRÜSSUNG-------------------------------");
		
		System.out.println(honda.hallo());
		Boolean canBremsen = bmw.canBremsen();
		if (canBremsen) {
			System.out.println("kann bremsen");
			
		}else {
			System.out.println("kann nicht bremsen");
		}
	}
	
}
