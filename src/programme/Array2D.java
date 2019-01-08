package programme;

public class Array2D {
	public static void main(String[] args) {
		
		//String[][] array2D =  new String[4][2]; // Kann man auch so deklarieren
		// Aray mit 4 Zeile und 3 Spalte
		String[][] array2d = {
				{"Nr. 1", "Mike", "10 ans"},
				{"Nr. 2", "Noelle", "6 ans"},
				{"Nr. 3", "Annick", "46 ans"},
				{"Nr. 4", "Jean", "35 ans"}
		};
		
		System.out.println("Die Länge der Tabelle: " + array2d.length);
		System.out.println("Die länge der 2 Dimensionale Array bezieht sich auf die Länge der Zeile");
		
		System.out.println("\nMa liste d'employee");
		System.out.println("----------------------");
		
		for (int zeile = 0; zeile < array2d.length; zeile++) {
			for (int spalte = 0; spalte < array2d[zeile].length; spalte++) {
				System.out.print(array2d[zeile][spalte] + "\t");
			}
			System.out.println();
	
		}
	
	}

}
