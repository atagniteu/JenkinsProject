package programme;

import klassen.Fahrzeug;
import vererbung.LKW;
import vererbung.Mottorad;
import vererbung.PKW;

public class FahrzeugProgramme {

	public static void main(String[] args) {

		// Fahrzeug f = new Fahrzeug(); weil Abstracte Klasse keine Intanze der Klasse
		// möglich. Die Reference der Obeject f wird nicht mehr ausgegeben.

		Fahrzeug f1 = new LKW();
		Fahrzeug f2 = new PKW();
		Fahrzeug f3 = new Mottorad();

		//System.out.println("Reference der Object F1, das ein LKW ist: " + f1);
		//System.out.println("Refernce der Object F2, das von Type PKW ist : " + f2.toString());
		//System.out.println("Refernce der Object F2, das von Type Mottorad ist: " + f3.toString());
		
		System.out.println(f1);
		System.out.println(f2.toString());
		System.out.println(f3.toString());
	
	}
}
