package programme;

import java.awt.Color;

import klassen.Auto;

public class VergleichDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Auto a1 = new Auto(100, "BMW", Color.BLACK);
		Auto a2 = new Auto(100, "bmw", Color.BLACK);
		// a1 und a2 sind die gleiche AUtos aber jede Auto hat seine Indentität
		// oder Referenz

		boolean vergleichObjekt = a1 == a2;
		System.out.println("Object Auto vergleichen: " + vergleichObjekt);
		System.out.println("--------------------");
		boolean vergleichInztanzVariable = a1.getLeistung() == a2.getLeistung();
		System.out.println("Object Auto vergleichen: "
				+ vergleichInztanzVariable);

		System.out.println("--------------------");
		boolean vergleichEqual = a1.equals(a2);
		System.out.println("Object Auto vergleichen: " + vergleichEqual);

		System.out.println("--------------------");
		boolean vergleichKlasseIgnoreCase = a1.getHersteller()
				.equalsIgnoreCase(a2.getHersteller());
		System.out.println("Object Auto vergleichen: "
				+ vergleichKlasseIgnoreCase);
		
		

	}

}
