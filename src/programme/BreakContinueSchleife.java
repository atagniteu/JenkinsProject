package programme;

import java.awt.Label;
import java.util.Random;

import klassen.Auto;

public class BreakContinueSchleife {
	public static void main(String[] args) {
		int[] intArray = new int[6];
		
		Random rn = new Random();
		Label label = new Label("La description de la Klasse", 1);
		
		System.out.println("Mein Label : " + label.getText() + " " + label.getAlignment());
	
		for (int i = 0; i< intArray.length; i++) {
			intArray[i] = rn.nextInt();
			System.out.println( "Ausgabe i Ohne prufung : " + i);			
		}
		
		for(int arrays : intArray) {
			if (arrays  % 2 == 0) {
				System.out.println("Zahl ist gerade: " + arrays);
				break;
			}
		}
		
		
		Auto[] autos = new Auto[8];
		for (int i = 0; i < autos.length; i++) {
			autos[i] = new Auto(80 + (i * 5), "Hersteller_" + (i + 1));
		}
		for (Auto auto : autos) {
			if (auto.getLeistung() > 100) {
				System.out.println("Leistung ist größer als 100:  " + auto.getLeistung() + " " +auto.getHersteller());
				continue;
			
			}
		}
		

	}
}
