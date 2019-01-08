package programme;

import java.util.Scanner;

public class scannerInputOutput {

	public static void main(String[] args) {

		String[] listeDePersonne = new String[2];

		listeDePersonne[0] = "muriel";
		listeDePersonne[1] = "noelle";
		//int[] zahlenListe= {40, 20, 44, 55, 6};

		//System.out.println(listeDePersonne[2]);// indexOutOfBoundexception --> wir wollen unsere Tableau mit nur 2 Element
		System.out.println("--------------------");
		// index ausgeben mit for schleife
		int index1 = 0;
		for (String persone : listeDePersonne) {

			System.out.println((index1++) + ".Persone ist " + persone);

		}
		System.out.println("--------------------");

		for (int i = 0; i < listeDePersonne.length; i++) {
			System.out.println(i + " " + listeDePersonne[i]);
		}
		
		System.out.println("-----------------------");
		int [] intZahlListe = new int [4];
		System.out.println("Bitte geben sie für Arry 4 Zahl ein: ");
		for ( int i = 0; i<intZahlListe.length; i++) {
			Scanner scanner = new Scanner(System.in);
			try {
				int userZahl = scanner.nextInt();
				intZahlListe[i] = userZahl;
		
				
			} finally {
				scanner.close();
			}
			
		}
		
		for (int zahl : intZahlListe) {
			System.out.println(zahl);
			
		}
		


//		Scanner scan = new Scanner(System.in);
//		System.out.println("Bitte geben sie ein Zahl ein: ");
//		int zahl = scan.nextInt();
//
//		System.out.println("Die Zahle ist: " + zahl);
//		System.out.println("noch ein Zahl bitte: ");
//		double zahl1 = scan.nextDouble();
//		System.out.println("zahl ist: " + zahl1);
//
//		String stringObject = new String("Muriel");
//		System.out.println(stringObject.toCharArray());
		
	
	}

	public static int getIndex(String[] arrayList) {
		int index = 0;
		for (int i = 0; i < arrayList.length; i++) {
			index = i;
		}
		return index;
	}

}
